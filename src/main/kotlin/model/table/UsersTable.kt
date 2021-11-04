package model.table

import org.jetbrains.exposed.dao.id.IntIdTable

object Users : IntIdTable() {
    val name = varchar("name", 20)
    val mail = varchar("mail", 255)
}