package chap02.section1

import com.example.edu.Person as User

fun main() {
    val user1 = User("SJ", 30)
    val user2 = Person("12324u99", "AL")

    println(user1.name)
    println(user1.age)
    println(user2)
    println(user2.name)
}

class Person(val id: String, val name : String)


