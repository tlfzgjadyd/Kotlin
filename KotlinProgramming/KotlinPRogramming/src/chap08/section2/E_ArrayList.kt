package chap08.section2

/*배열은 한번 정의되면 길이와 내용이 메모리에 고정된다
* 그래서 선언된 배열을 잘라내거나 덧붙일 수 없어서
* 만약 고정되지 않은 동적인 배열이 필요할 경우 컬렉션의 일종인 List를 사용해야함
*
* < 배열에 요소 추가하기>
* val 새로운배열명 = 기존배열명.plus(5)
*
* < 배열 요소 잘라내기 >
* val 새로운배열명 = 기존배열명.sliceArray(시작..끝)
* 이때 시작..끝의 경우 평소 언어들과 달리 시작, 끝 둘다 범위에 포함돼서 시작<=x<=끝인게 특징이다
*
* */
import java.util.Arrays;
fun main() {
    val arr1 = intArrayOf(1, 2, 3, 4, 5) //5개로 고정된 배열
    println("원래 배열 : ${Arrays.toString(arr1)}") // 원래 배열 : [1, 2, 3, 4, 5]

    val arr2 = arr1.plus(6) //뒤에 6이라는 요소 추가됨
    println("추가된 후 : ${Arrays.toString(arr2)}") // 추가된 후 : [1, 2, 3, 4, 5, 6]

    val arr3 = arr1.sliceArray(0..2) //필요한 범위를 잘라내서 새 배열 생성
    println("잘라낸 후 : ${Arrays.toString(arr3)}") // 잘라낸 후 : [1, 2, 3]
}