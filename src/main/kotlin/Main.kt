import model.table.Chapters
import model.table.Mistakes
import model.table.Questions
import model.table.Users
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.transactions.transaction

fun main() {
    Database.connect("jdbc:postgresql://localhost:12346/test", "org.postgresql.Driver", "root", "your_pwd")
    transaction {
        create(Users, Questions, Mistakes, Chapters)
    }
}
