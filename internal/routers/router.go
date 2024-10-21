package routers

import (
	"game_101/internal/handlers/gamer"
	"net/http"
)

func Router() {
	http.HandleFunc("GET /gamer", gamer.Get_all)
	http.HandleFunc("GET /gamer/{id}", gamer.Get_all)
	http.HandleFunc("POST /gamer", gamer.Create_gamer)
	http.HandleFunc("PUT /gamer", gamer.Update_gamer)
	http.HandleFunc("DELETE /gamer", gamer.DeleteGamer)

}
