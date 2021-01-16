package chap04.section3

/*예외 Exception 대부분의 에러는 컴파일러가 잡아낼 수 있지만 메모리 부족같은건 예상 못함
  예외를 발생시키는 상황으론 다음과 같은 것들이 있다
  1. 운영체제의 문제 (잘못된 시스템 호출)
  2. 입력값의 문제 (존재하지 않는 파일 열었거나 또는 숫자 입력란에 문자를 입력하는 등)
  3. 받아들일 수 없는 연산 (0으로 나누기 같은 말이 안되는 연산)
  4. 메모리의 할당 실패 및 부족
  5. 컴퓨터 기계 자체의 문제(전원 문제, 망가진 기억 장치 등)
  
  try catch finally 사용법
  try{
       예외 발생 가능한 문장
  }catch (e:예외 처리클래스 이름){
       예외 처리문
  }finally{
       반드시 실행되어야 하는 문장
  }
*/

fun main() {
    val a = 6
    val b = 0
    var c : Int

    //1. 일반 예외처리
    try{
        c=a/b
    }catch(e:Exception){
        println("Exception is handled")
    }finally{
        println("finally 블록은 반드시 항상 실행됨")
    }

    //2. 특정 예외만 골라서 처리 (e:자료형을 해당 자료형으로 해둔다)
    try{
        c=a/b
    }catch(e:ArithmeticException){  //산술연산에러 자료형으로 특정해서 처리
        println("Exception is handled. ${e.message}")
    }finally{
        println("finally 블록은 반드시 항상 실행됨")
    }

    //3. 스택 추적하기 (e.printStackTrace)
    try{
        c=a/b
    }catch(e:Exception){
        e.printStackTrace() //이렇게 printStackTrace를 사용할 경우 에러가 발생한 코드의 줄을 확인할 수 있음
    }finally{               //에러 발생줄을 스택으로부터 추적 가능한 이유는 프로그램이 디버깅 정보를 유지하고 있기 때문이다
        println("finally 블록은 반드시 항상 실행됨")//이때 출력되는 에러는 System.err통로를 이용하는 반면 
    }                                           //println은 System.out통로를 이용하기 떄문에 순서 섞일 수 있다
}