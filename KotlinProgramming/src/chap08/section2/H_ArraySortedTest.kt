package chap08.section2

/*11:30~12:00
* < 배열 정렬하기 >
* 1. 오름차순 ascending
* 2. 내림차순 descending
* => Array에선 정렬 알고리즘을 아예 제공해줌
*
* < 1. 오름차순, 내림차순으로 정렬해서 반환하기에 새 변수에 할당해야 하는것들 >
* 1) 오름차순 정렬 : val asc = arr.sortedArray()
* 2) 내림차순 정렬 : val desc = arr.sortedArrayDescending()
*
* < 2. 원본 배열에 대한 정렬하는것들 >
* 1) 오름차순 정렬 :  arr.sort(1, 3) //sort(fromIndex, toIndex)
* 2) 내림차순 정렬 : arr.sortDescending(1, 3)
* => 이때 만약 index 안쓰고 arr.sort(), arr.sortDescending() 하게 되면 전체를 다 정렬함
*
* < 3. 정렬 후 List로 반환하기에 새 list형 변수에 할당해야 하는 것들 >
* 1) 오름차순 정렬 : val listAsc: List<Int> = arr.sorted()
* 2) 내림차순 정렬 : val listDesc: List<Int> = arr.sortedDescending()
*
* < 4. SortBy를 이용한 특정 기준에 따라 정렬 >
* 예를 들어 val items = 문자열 배열  이렇게 할당했을때
* 배열변수명.sortBy { 정렬할때 붙일이름 -> 정렬할때 붙인이름.정렬기준 } 이런식으로 사용할 수 있다
*  ex) items.sortBy{ item -> item.length }
*  이렇게 할 경우 items라는 배열의 요소들을 item이라는 이름을 부여해서 정렬하는데 그 정렬 기준은 item.length 즉 문자열 길이가 되는것
* 변수명 주기 싫을 경우 {it.정렬기준} 이렇게해도됨
* */

import java.util.Arrays;

fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)

    //1. 오름차순, 내림차순으로 정렬된 일반 배열로 반환하기에 새 변수에 할당해야 하는것들
    val asc = arr.sortedArray() //그냥 sortedArray 사용하면 오름차순 ascending됨
    println("ASC: " + Arrays.toString(asc))

    val desc = arr.sortedArrayDescending() //뒤에 descending 붙이면 내림차순됨
    println("DEC: " + Arrays.toString(desc))

    //2. 원본 배열에 대한 정렬
    arr.sort(1, 3) //sort(fromIndex, toIndex)
    println("ORI: " + Arrays.toString(arr))
    arr.sortDescending()
    println("ORI: " + Arrays.toString(arr))

    //3. 정렬 후 List로 반환하기에 list 자료형 변수로 받아줘야하는것
    val listAsc: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()
    println("LST: " + listAsc)
    println("LST: " + listDesc)

    //4. SortBy를 이용한 특정 기준에 따라 정렬
    val items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Po") //문자열이 들어가는 배열 선언
    items.sortBy{ item -> item.length }//sortBy{ 정렬할때 붙일이름->정렬할때 붙인이름.정렬기준 }
    println(Arrays.toString(items)) //여기서는 문자열 길이에 따라 정렬하고 있다
    items.sortBy{it.length}//이런 사용법도 가능함
}