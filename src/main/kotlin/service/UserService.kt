package service

import model.dao.User
import org.jetbrains.exposed.sql.transactions.transaction

class UserService {
    fun createAccount(name: String, email: String) {
        transaction {
            User.new {
                this.name = name
                this.mail = mail
            }
        }
    }
}