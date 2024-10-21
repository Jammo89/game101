package server

import (
	"game_101/internal/routers"
	"log"
	"net/http"
)

func Server() {
	routers.Router()

	log.Println("Server started on PORT: 2020")

	http.ListenAndServe(":2020", nil)

}
