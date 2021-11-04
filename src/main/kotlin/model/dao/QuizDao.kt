import model.table.Chapters
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID


class Chapter(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Chapter>(Chapters)

    var title by Chapters.title
    var count by Chapters.count
}