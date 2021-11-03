import model.table.Chapters
import model.table.Mistakes
import model.table.Questions
import model.table.Users
import org.jetbrains.exposed.sql.transactions.transaction
import java.beans.EventHandler.create

fun main() {
    transaction {
        create(Users, Questions, Mistakes, Chapters)
    }
}
