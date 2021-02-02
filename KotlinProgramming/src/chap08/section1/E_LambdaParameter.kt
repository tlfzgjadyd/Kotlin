package chap08.section1

/*형식 매개변수로 선언된 함수의 매개변수를 연산할 경우에는 자료형을 결정할 수 없기 때문에 에러 나지만
* 람다식을 매개변수로 받으면 자료형 결정하지 않아도 실행시 람다식 본문 넘겨줄때 결정되므로 이런 문제 쉽게 해결 가능함*/

fun<T> add(a: T, b: T, op: (T, T)->T): T{
    return op(a, b)
}
fun main() {
    val result = add(2, 3, {a, b-> a+b})
    //val result = add(2, 3){a, b->a+b}와 같이 표현 가능
    println(result);
}