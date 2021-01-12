package chap03.section5.functions

/* 일반 재귀함수의 경우 호출 후에 계산하는 반면 꼬리 재귀함수는 계산 후에 호출한다
   factorial 인자 안에서 팩토리얼읟 도중 값을 계산하고 호출하기에 꼬리재뀌 사용가능
   스택 오버플로우에서 더욱 안전한 코드가 됐기에 n을 크게 설정해도 괜찮다
 */
fun main() {
    val number = 5
    println("Factorial: $number -> ${factorial(number)}")
}

tailrec fun factorial(n:Int, run:Int = 1):Long{
    return if (n==1) run.toLong() else factorial(n-1, run*n)
}

//비교용 원래 재귀함수
/*fun factorial(n:Int):Long{
    return if (n==1) n.toLong() else n*factorial(n-1)
}*/