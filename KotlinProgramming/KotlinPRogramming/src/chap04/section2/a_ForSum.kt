package chap04.section2

/* 코틀린의 for문은 자바의 for문과는 다르다 코틀린에선 기본적으로 세미콜론을 쓰지도 않음
   근데 이 새로운 형태의 for문이 R에서 본거랑 비슷하게 생긴듯
   
   코틀린은 for을 사용할때 이터레이터가 사용되기에 배열, 컬렉션등에서도 알아서 돌도록 되어있다

   for (x in 1..5){
        내용
   }
*/
fun main() {
    // 1. 기본 사용법
    for (x in 1..5) println(x)

    // 2. 응용 사용법
    var sum = 0
    for (x in 1..10) sum+=x
    println("sum: $sum")

    //3. 위의 방식이 상행 반복이었다면 이번엔 하행 반복
    for (i in 5 downTo 1) print(i)

    //4. 숫자를 2개씩 증가시키기
    for (i in 1..5 step 2) print(i)

    //5. downTo와 step 혼용해서 사용하기
    for(i in 5 downTo 1 step 2) print(i)
}