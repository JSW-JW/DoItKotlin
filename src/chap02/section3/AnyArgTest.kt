package chap02.section3

fun main() {
    checkArg("Hi!")
    checkArg(12345)
    checkArg(1.25)
}

fun checkArg(x : Any) {
    if(x is String) {
        println("x is String : $x")
    }
    else if(x is Int) {
        println("x is Int : $x")
    }
    else {
        println("x is out of typeRange")
    }
}