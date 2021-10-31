import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.transactions.transaction

fun main() {
    transaction { }
}

object Users : IntIdTable("user")

object Questions : IntIdTable() {
    val word = varchar("word", 4)
    val answer = varchar("answer", 4)
    val description = varchar("description", 20)
    val chapterId = reference("chapterId", Chapters)
}

object Mistakes : IntIdTable() {
    val userId = reference("userId", Users)
}

object Chapters : IntIdTable() {
    val title = varchar("title", 10)
    val count = integer("count")
}
