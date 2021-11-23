package controller

import io.ktor.application.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import model.deserialize.CreateUserAccount

fun Route.userController() {
    get("/user") {
        call.respondText { "user routing ok" }
    }
    post {
        val request = call.receive<CreateUserAccount>()
    }
}