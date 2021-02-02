package chap08.section1

/*< 제네릭 함수에서 자료형 제한하기 .
* 똑같이 T: Number 방식으로 제한한다
* */
fun main(){
    fun<T: Number> addLimit(a: T, b: T, op: (T, T)->T): T{
        return op(a, b)
    }

    val result = addLimit(97, 98, {a, b->a+b}) //제한된 자료형으로 인해 오류 발생
    //val result = addLimit("abc", "def", {a, b->a+b}) //제한된 자료형으로 인해 오류 발생
}