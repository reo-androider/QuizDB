import controller.userController
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import model.table.Chapters
import model.table.Mistakes
import model.table.Questions
import model.table.Users
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils.create
import org.jetbrains.exposed.sql.StdOutSqlLogger
import org.jetbrains.exposed.sql.addLogger
import org.jetbrains.exposed.sql.transactions.transaction


fun main() {
    Database.connect("jdbc:h2:mem:test", driver = "org.h2.Driver")
    transaction {
        addLogger(StdOutSqlLogger)
        create(Users, Questions, Mistakes, Chapters)
    }
    val server = embeddedServer(Netty, port = 8080) {
        routing {
            userController()
            get("/test") {
                call.respond("success!")
            }
        }
    }
    server.start(wait = true)
}
