package model.dao

import Chapter
import model.table.Questions
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Question(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Question>(Questions)

    var word by Questions.word
    var answer by Questions.answer
    var description by Questions.description
    var chapterId by Chapter referencedOn Questions.chapterId
}