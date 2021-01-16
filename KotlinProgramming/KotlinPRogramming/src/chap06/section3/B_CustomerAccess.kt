package chap06.section3

/*자바의 정적 변수와 메소드를 코틀린에서 가져다 써보는 실험이다*/

fun main() {
    println(B_Customer.LEVEL) //자바클래스 b_Customer의 인스턴스 생성 전에 정적 필드 LEVEL을 성공적으로 가져다썼음
    B_Customer.login() //자바클래스 b_Customer의 인스턴스 생성 전에 정적 메소드를 성공적으로 가져다 썼음
}