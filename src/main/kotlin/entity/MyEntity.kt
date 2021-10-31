import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class User(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<User>(Users)
}

class Question(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Question>(Questions)

    var word by Questions.word
    var answer by Questions.answer
    var description by Questions.description
    var chapterId by Chapter referencedOn Questions.chapterId
}

class Mistake(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Mistake>(Mistakes)

    var userId by User referencedOn Mistakes.userId
}

class Chapter(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Chapter>(Chapters)

    var title by Chapters.title
    var count by Chapters.count
}