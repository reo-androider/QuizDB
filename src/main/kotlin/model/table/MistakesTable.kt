package model.table

import org.jetbrains.exposed.dao.id.IntIdTable

object Mistakes : IntIdTable() {
    val userId = reference("userId", Users)
    val questionId = reference("questionId", Questions)
}