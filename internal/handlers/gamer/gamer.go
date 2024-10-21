package gamer

import (
	"encoding/json"
	"game_101/internal/database/postgresql"
	"game_101/internal/models/gamer"

	"log"
	"net/http"
)

//GET ALL

func Get_all(w http.ResponseWriter, req *http.Request) {

	db := postgresql.ConectPSQL()

	rows, err := db.Query("SELECT * FROM gamer")
	if err != nil {
		log.Println(err)
	}

	defer rows.Close()

	gamers := []gamer.Gamer{}

	for rows.Next() {
		g := gamer.Gamer{}
		err := rows.Scan(&g.Id, &g.Name, &g.Count, &g.Raiting)
		if err != nil {
			log.Println(err)
			continue
		}

		gamers = append(gamers, g)
	}

	for _, g := range gamers {
		json.NewEncoder(w).Encode(g)
		log.Println(g.Name, " Счeт: ", g.Count)
	}

}

// GET ONE GEMER

func Get_one_gamer(w http.ResponseWriter, req *http.Request) {

	db := postgresql.ConectPSQL()

	var id int
	gamer, err := db.Query("SELECT * FROM gamer WHERE id = $1", id)
	if err != nil {
		log.Println(err)
	}

	json.NewEncoder(w).Encode(gamer)

}

// CREATE GAMER

func Create_gamer(w http.ResponseWriter, req *http.Request) {

	db := postgresql.ConectPSQL()
	gamer := gamer.Gamer{}

	json.NewDecoder(req.Body).Decode(&gamer)

	db.Exec("INSERT INTO Gamer (Name, Count, Rating ) values ($1, $2, $3)", gamer.Name, gamer.Count, gamer.Raiting)

	json.NewEncoder(w).Encode(gamer.Name)
	log.Println(gamer.Name)

}

// UPDATE GAMER

func Update_gamer(w http.ResponseWriter, req *http.Request) {

	db := postgresql.ConectPSQL()
	gamer := gamer.Gamer{}

	json.NewDecoder(req.Body).Decode(&gamer)

	result, err := db.Exec("UPDATE Gamer SET name = $1, count = $2, rating = $3 where id = $4", gamer.Name, gamer.Count, gamer.Raiting, gamer.Id)
	if err != nil {
		log.Println(err)
	}
	json.NewEncoder(w).Encode(result)
	log.Println(gamer.Name, gamer.Id)

}

// DELETE GAMER

func DeleteGamer(w http.ResponseWriter, req *http.Request) {

	db := postgresql.ConectPSQL()
	gamer := gamer.Gamer{}

	json.NewDecoder(req.Body).Decode(&gamer)

	result, err := db.Exec("DELETE from Gamer where id = $1", gamer.Id)
	if err != nil {
		log.Println(err)
	}
	json.NewEncoder(w).Encode(result)
	log.Println("delete")

}
