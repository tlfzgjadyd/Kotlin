package chap08.section3

import java.lang.NumberFormatException

/* < 그 외 문자열 처리 메소드들 >
   1. stringtokenizer 기능 : split("구분인자1", "구분인자2")
   2. 문자열을 숫자로 변환하기 : 문자열명.toInt()
      만약 숫자가 아닌것 포함일때 프로그램 중단 방지하고자 한다면 : 문자열명.toIntOrNull()
   상세한 설명은 아래에 있다
 */
fun main() {
    //1. 공백으로 자르기
    var deli = "Welcome to Kotlin"
    val sp = deli.split(" ")
    println(sp) //결과는 [ Welcome, to, Kotlin ]
    
    //2. 여러가지 기호로 자르기
    val phone = "전화번호 = 000-1111-2222"
    val sp2 = phone.split("=", "-") //이럴 경우 =또는 -이 있으면 잘리기 때문에 한번에 분리 가능하다
    println(sp2) //결과는 [ 전화번호 ,  000, 1111, 2222 ]
    
    //3-1. 문자열을 정수로 변환하기
    val number: Int = "123".toInt()

    // 3-2. 숫자 아닌 경우 NumberFormatException에러 나므로 try catch해주는것도 좋은 선택임
    try {
        "12w".toInt()
    }catch(e: NumberFormatException){
        println(e.printStackTrace())
    }

    //3-3. 만약 숫자가 아닌 문자가 포함되었을 때 null을 반환받고자 하면 toInt()대신 toIntOrNull() 쓸 수 있음 (프로그램 중단 방지)
    val number2: Int? = "123".toIntOrNull() //대신 받아주는 변수의 자료형도 Int->Int?로 Null 허용으로 바꿔줘야됨
}