package chap03.section5.functions

/* 중위 표현법 (Infix Notation) : 클래스 멤버 호출할때 3.multiply(10)대신 3 multiply 10처럼
   .과 소괄호를 생략하여 호출하는 표현법, 보다 직관적이게 표현 가능하다
   
   중위 함수 만드는 방법 : Int를 확장해서 기존 multiply 대신 새 multiply를 만든다
                        infix fun 확장대상.확장함수명(x:Int) : Int { return 대상 }

   사용처 : 일종의 연산자를 구현할 수 있고 비트 연산자에서 사용된다
   
   중위 함수의 조건 
   1. 멤버 메서드 또는 확장 함수여야 한다
   2. 하나의 매개변수를 가져야 한다
   3. infix 키워드를 사용하여 정의한다
 */
fun main() {
    //일반 표현법
    //val multi = 3.multiply(10)
    
    //중위 표현법
    val multi = 3 multiply 10
    println("multi: $multi")
}

//Int를 확장해서 multiply() 함수를 하나 더 추가함 
infix fun Int.multiply(x:Int) : Int{ //infix로 선언되므로 중위 함수
    return this * x
}