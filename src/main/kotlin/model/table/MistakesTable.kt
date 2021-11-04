package model.table

import model.dao.Users
import org.jetbrains.exposed.dao.id.IntIdTable

object Mistakes : IntIdTable() {
    val userId = reference("userId", Users)
}