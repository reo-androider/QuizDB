package model.dao

import model.table.Mistakes
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Mistake(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Mistake>(Mistakes)

    var userId by User referencedOn Mistakes.userId
    var questionId by Question referencedOn Mistakes.questionId
}