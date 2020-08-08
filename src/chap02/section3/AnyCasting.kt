package chap02.section3

fun main() {
    var a : Any = 12
    a  = 10L
    println("typeofA : ${a::class.simpleName}")
}