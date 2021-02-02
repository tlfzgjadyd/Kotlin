package chap04.section3

/*Unit을 반환한다는것 : Unit이라는 자료형 자체를 반환한다는 뜻으로 void와 다르다
 */
fun main() {
    hello1()
    hello2()
    hello3()
}

//1. Unit을 명시적으로 반환
fun hello1():Unit{
    return Unit
}

//2. Unit 이름 생략해서 반환
fun hello2():Unit{
    return
}

//3. return문 자체를 생략
fun hello3():Unit{

}