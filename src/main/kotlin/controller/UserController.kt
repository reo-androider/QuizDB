package controller

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.userController() {
    get("/user") {
        call.respondText { "user routing ok" }
    }
    post {

    }
}