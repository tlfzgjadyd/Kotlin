package chap08.section2

/*이번엔 새로운 방식으로 배열 만들면서 초기화해볼거다
* 1. 사용방식은 Array(요소 개수, 초깃값 설정 람다식)
* 2. 만약 2번째 인자 사용하지 않을 경우 null로 채워지고
* 3. 만약 { 0 }으로 하면 0으로 채워진다
* */
import java.util.Arrays;

fun main() {
    val array1 = Array(5, {i->i*2})
    var array2 = arrayOfNulls <Int>(1000) //1000개의 null로 채워진 정수 배열
    var array3 = Array(1000, { 0 })
    println("arr: ${Arrays.toString(array1)}")
    println("arr: ${Arrays.toString(array2)}")
    println("arr: ${Arrays.toString(array3)}")
}