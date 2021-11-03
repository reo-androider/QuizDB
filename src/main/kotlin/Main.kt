import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.StdOutSqlLogger
import org.jetbrains.exposed.sql.addLogger
import org.jetbrains.exposed.sql.transactions.transaction

fun main() {
    Database.connect("jdbc:postgresql://localhost:12346/test", "org.postgresql.Driver", "root", "your_pwd")
    transaction {
        addLogger(StdOutSqlLogger)
    }
}
