package chap02.section

fun main() {
    smartCast()
}

fun smartCast () {
    var test : Number = 12.2
    println("${test::class.simpleName}")

    test = 12
    println("${test::class.simpleName}")

    test = 120L
    println("${test::class.simpleName}")

    test += 12.0f
    println("${test::class.simpleName}")
}
