package chap07.section2

/*< 반복문으로 분해하기 >
* 분해할 데이터가 많아진다면 반복문을 통해 쉽게 처리 가능하다
* Customer클래스를 할당한 변수들 여러개를 준비한 다음
* customers변수에 모든 객체들을 리스트로 만들어서 할당
* 그다음 customer변수내를 돌며 분해
* val customers = listOf(cus1,cus2,bob,erica)
* for ((name, email) in customers){
*   작업수행
* }
*
* 근데 결과를 보니까 분해했다기보단 이터레이터 아닌가?
* 나중에 객체로도 잘 출력하는걸로 봐서 일회성으로 분해되는거고 본체에 영향을 안미침
* 결국 분해하면서 for문 돌렸다는건 객체단위말고 객체 내의 프로퍼티 단위로 작업을 수행할 수 있었다는 뜻이다
* */

fun main() {
    val cus1 = Customer("Sean", "sean@mail.com")
    val cus2 = Customer("Sean", "sean@mail.com")
    val bob = Customer("Bob", "bob@mail.com")
    val erica =Customer("Erica", "erica@mail.com")

    val customers = listOf(cus1, cus2, bob, erica) //Customer클래스 객체들을 리스트로 만든다

    for((name, email) in customers){ //반복문을 사용해 모든 객체의 프로퍼티 분해
        println("name = $name, email = $email")
    }
    println(cus1.email) //분해 이후에도 객체에 접근 가능한 것으로 보아 일회성 분해였음을 알 수 잇음
}