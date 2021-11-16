package service

import io.ktor.routing.*
import model.dao.Mistake
import org.jetbrains.exposed.sql.transactions.transaction

class MistakeService {
    fun Route.getMistake(): List<Mistake> {
        var mistakeList = listOf<Mistake>()
        transaction {
            mistakeList = Mistake.all().toList()
        }
        return mistakeList
    }
}