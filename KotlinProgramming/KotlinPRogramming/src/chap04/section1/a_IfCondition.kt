package chap04.section1

/* 신기한 표현식들 있음
   근데 코틀린에서는 if문만 단독으로 사용 불가능한가봄 else도 반드시 쓰라고 뜨네
*/
fun main() {
    val a=1
    val b=2

    val max1 = if (a >b) a else b //return문 삭제 가능

    val max2 = if (a > b) {
        println("a 선택")
        a //마지막 식인 a가 반환되어 max에 할당
        //여기서도 역시 return문 없이 그냥 썼더니 알아서 return된걸 알 수 있음
    }
    else {
        println("b 선택")
        b //return 생략 알아서 b 리턴해서 max2에 할당
    }
    println(max1)
    println(max2)
}