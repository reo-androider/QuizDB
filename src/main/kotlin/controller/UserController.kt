package controller

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import model.deserialize.CreateUserAccount
import service.UserService

fun Route.userController() {
    val userService = UserService()

    get("/user") {
        call.respondText { "user routing ok" }
    }
    post {
        val request = call.receive<CreateUserAccount>()
        userService.createAccount(request.name, request.mail)
        call.respond(HttpStatusCode.OK)
    }
}