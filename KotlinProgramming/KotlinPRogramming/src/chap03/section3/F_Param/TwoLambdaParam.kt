package chap03.section3.F_Param

fun main() {
    twoLambda({ a,b->"First Lambda $a $b"}, {"Second Lambda $it"})
    twoLambda({ a,b->"First Lambda $a $b"}) {"Second Lambda $it"} //마지막이 람다인건 변함없으니 앞에서 했듯이 분리 가능
}

fun twoLambda(first:(String, String)->String, second:(String)->String){
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}