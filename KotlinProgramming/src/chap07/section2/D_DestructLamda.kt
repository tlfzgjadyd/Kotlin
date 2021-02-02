package chap07.section2

/*이번엔 람다식으로 디스트럭처링된 변수를 출력해본다*/

fun main() {
    val cus1 = Customer("Sean", "sean@mail.com")

    val myLamda = { //2. {}로 감싸진 내부는 myLamda변수에 할당된 람다식 본문이기 때문에 내용을 살펴보면
        (nameLa, emailLa) : Customer-> //람다식은 전달인자로 nameLa, emailLa를 받음
        println(nameLa)                //분명히 호출할떄 전달한건 cus1 객체지만 받을때 저렇게 분해해서 받았기에
        println(emailLa)               //알아서 디스트럭처링된걸로 받게된다 
                                        //그래서 내부에서 분해된 nameLa, emailLa 각각으로 출력할 수 있게 된다

        /*3. 아직 람다식이 익숙하지 않은듯 해서 저거 이해하느라 한참걸렸음 해석하자면
        * val myLamda = {람다식}
        * 이런식으로 람다식을 myLamda 변수에 할당하게됨
        * (그래서 밑에서 myLamda변수를 함수처럼 취급할 수 있었던것)
        * 
        * {람다식} 내부를 해석해보면
        * 만약 리턴값이 없었을 경우 이런식이 됐었겠지
        * (nameLa,emailLa)->
        * println(nameLa)
        * println(emailLa)
        * 리턴자료형 Customer때문에 괜히 헷갈렸던것
        * 즉 저 람다식은 nameLa, emailLa 전달인자를 받아 ->이후의 본문 내용을 실행 한 후  :Customer 자료형의 객체를 반환하는 식이다
        * */
    }
    myLamda(cus1) //1. cus1객체를 myLamda에 전달하면
}