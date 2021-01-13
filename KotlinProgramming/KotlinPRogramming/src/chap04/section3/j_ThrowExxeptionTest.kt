package chap04.section3

/* 위에서는 try catch finally를 통해 에러가 알아서 발생하는걸 기다렸다
   하지만 스스로 throw를 통해 발생시킬 수도 있음

   try catch finally : 등록된 에러가 날 경우 자동으로 에러 던져짐
   try{ throw } catch finally : try내부 또는 try에서 사용한 함수 내에 특정 조건 만족시 직접 에러 던지도록
                                if ()
                                   throw Exception("~")를 한다
 */
fun main() {
    var amount=600

    try{
        amount-=100
        checkAmount(amount)
    }catch(e:Exception){
        println(e.message)
    }
    println("amount:$amount")
}

fun checkAmount(amount:Int){
    if(amount<1000)
        throw Exception("잔고가 $amount 으로 1000이하입니다") //throw를 통해 특정 조건 충족시 에러 던지게 해둠
}