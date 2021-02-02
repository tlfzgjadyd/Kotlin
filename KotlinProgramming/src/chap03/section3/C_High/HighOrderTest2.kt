package chap03.section3.C_High
//고차함수 : 람다식을 리턴값으로 사용하기

fun highOrder(sum: (Int, Int) -> Int, a:Int, b:Int): Int{  
    //여기서도 람다식은 매개변수 자료형을 확실하게 함수 형태로 해주고 있다는 점에서 일반함수때와 차이가 있다
    return sum(a,b)
    //전달받은 람다식을 사용한 리턴
}

fun main() {
    var res: Int
    res = highOrder({ x, y -> x+y }, 10, 20)
    //여러 인자들중 람다식을 쓴 인자는 하나 뿐이기에 다른 변수들과 섞이지 않도록 람다식 인자는 { } 로 묶어줬다
    println(res)
}