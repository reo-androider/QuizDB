package model.table

import org.jetbrains.exposed.dao.id.IntIdTable


object Chapters : IntIdTable() {
    val title = varchar("title", 10)
    val count = integer("count")
}