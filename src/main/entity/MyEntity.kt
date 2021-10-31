class User(id: EntityId<Int>) : IntEntity(id) {
    companion object : IntEntityClass<User>(Users)
}

class