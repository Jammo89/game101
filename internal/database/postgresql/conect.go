package postgresql

import (
	"database/sql"

	_ "github.com/lib/pq"
)

func ConectPSQL() *sql.DB {

	connStr := "user=postgres password=6362 dbname=game_101 sslmode=disable"
	db, err := sql.Open("postgres", connStr)

	if err != nil {
		panic(err)
	}

	return db

}
