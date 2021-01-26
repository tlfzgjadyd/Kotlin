package chap08.section2

/*배열 요소에 접근할때는 이런식으로 가능하다
* 값지정 : array.set(2, 7)   또는   array[2] = 7
* 값뽑기 : array.get(2)      또는   array[2]
*
* 그리고 만약 한번에 출력하려면 이렇게하면됨
* 1차원일 경우 : Arrays.toString(배열명)
* 다차원일 경우 : Arrays.deepToString(배열명)
* =>Arrays를 사용할 경우 import java.util.Arrays 필요하다
* */

import java.util.Arrays //배열을 사용하기 위해 필요한건 아니고 배열 다룰때 이게 필요함 Arrays.toString 써야하기 때문

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    println("arr: ${Arrays.toString(arr)}")// Arrays.toString()은 배열의 내용을 문자열로 변환
    println("size: ${arr.size}") //size는 배열의 크기를 나타냄
    println("sum(): ${arr.sum()}") //sum()메소드는 배열의 합을 계산
    //게터에 의한 접근과 대괄호 연산자 표기법
    println(arr.get(2))
    println(arr[2])

    //세터에 의한 값의 설정
    arr.set(2, 7)
    arr[0]=8
    println("size: ${arr.size} arr[0]: ${arr[0]}, arr[2]: ${arr[2]}")

    //루프를 통한 배열 요소의 접근
    for (i in 0..arr.size-1){
        println("arr[$i]=${arr[i]}")
    }
}