package chap02.section3

fun main() {
    checkDataType()
}

fun safeCallandElvis () {
    var str1 : String? = "Hello Null"
    str1 = null

    println("len : ${str1?.length ?: -1}")   // 세이프콜(left) - null이면 null 반환, null 아니면 length값 반환
    // 엘비스 연산자(right) - 왼쪽값이 null 아니면 왼쪽 값 반환,
    //  null 이면 오른쪽 값 반환,  결과 : len : -1
}

fun NPE () {
    var str1 : String? = "Hello Null"
    str1 = null

    println("${str1!!.length}")   // non-null 단정 기호 // NPE 발생
}

fun checkNull () {
    var str1 : String? = "Hello Null"
    str1 = null

    val len = if(str1 != null) str1.length else -1    //  // 조건문을 활용한 null 변수 검증
    println("len : {$len}")
}

fun checkDataType () {
//    val a: Int = 1
//    val b: Double = a     Type mismatch Required : Double / Found : Int
    val a : Int = 1
    val b : Double = a.toDouble()
    val result = 1L + 3   // Long형 + Int 형  -> 결과는 Long형
    println(b)      // 1.0
    println("${result::class.simpleName}")      // Long
    println("${result::class.qualifiedName}")      // kotlin.Long
}