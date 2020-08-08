package chap03.section1

fun main() {
    val result = sum(3, 2)
    print(result)

    val maxResult : Int
    maxResult = max(12,15)
    println(maxResult)
}


fun sum (a: Int, b: Int) : Int {
    var sum = a + b
    return sum
}

fun max(a: Int, b: Int) = if(a > b) a else b