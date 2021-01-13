package chap04.section3

/*when문과 범위 지정자를 사용하여 10~20 사이의 값이 아닌 경우 본문 블록을 실행하는 코드를 직접 작성하시오*/

fun main() {
    val a=10
    val b=25

    test(a)
    test(b)
}
fun test(n:Int):Unit{
   /* when(n !in 10..20)->{
        println("sdf")
    }*/
}
/*답이 !in 10..20->{...}이라는데 뭐지 에러남
  에러는 나지만 여기서 주워가야할건 자바와 달리 n<10||n>20이 아니라 !in 10..20을 사용해야 한다는점*/