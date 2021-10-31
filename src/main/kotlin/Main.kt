import org.jetbrains.exposed.dao.id.IntIdTable

fun main() {

}

object User : IntIdTable("user")

object Question : IntIdTable() {
    val ward = varchar("word", 4)
    val answer = varchar("answer", 4)
    val description = varchar("description", 20)
    val chapterId = reference("chapterId", Chapter)
}

object Mistake : IntIdTable() {
    val userId = reference("userId", User)
}

object Chapter : IntIdTable() {
    val title = varchar("title", 10)
    val count = integer("count")
}