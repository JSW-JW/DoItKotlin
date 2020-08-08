package chap02.section3

fun main() {

    smartCastAny()
}

fun isCheck () {
    val num = 256

    if ( num is Int) {
        print(num)
    } else if (num !is Int) {
        println("Not an Int")
    }
}

fun smartCastAny () {
    val x : Any
    x="Hello"   // type of x is still 'Any'
    println("type : ${x::class.simpleName}")
    if (x is String) {
        println(x.length)
    }
}

fun smartCastAs () {
//    val y = null
//    val x : String = y as String  // TypeCastException: null cannot be cast to non-null type kotlin.String
    val y : Int? = null
    val x : String? = y as? String      // String? 으로 해줘도 가능

    println(x)    // 결과 : null

}

