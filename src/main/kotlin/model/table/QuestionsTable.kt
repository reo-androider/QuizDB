package model.table

import org.jetbrains.exposed.dao.id.IntIdTable

object Questions : IntIdTable() {
    val word = varchar("word", 4)
    val answer = varchar("answer", 4)
    val description = varchar("description", 255)
    val chapterId = reference("chapterID", Chapters)
}