package chap09.section3

/*2>
* < 여러가지 형태의 map들 >
* Set에서 HashSet, SortedSet, LinkedHashSet등을 사용했듯이
* Map에서 역시 HashMap, SortedMap, LinkedHashMap 사용이 가능하다
* 각각은 hashMapOf(), sortedMapOf(), linkedMapOf()을 통해 생성 가능하고
* 각각의 내부구조는 해시, 트리, 링크드 리스트 자료구조로 구현되어있다
* */

import java.util.*
//import java.util.HashMap;
//import java.util.SortedMap;
//import java.util.LinkedHashMap;

fun main() {
    //java.util.HashMap 사용
    val hashMap: HashMap<Int, String> = hashMapOf(1 to "Hello", 2 to "World")
    println("hashMap = $hashMap")
    
    //java.util.SortedMap 사용
    val sortedMap: SortedMap<Int, String> = sortedMapOf(1 to "Apple", 2 to "Banana")
    println("sortedMap = $sortedMap")

    //java.util.LinkedHashMap 사용
    val linkedHash: LinkedHashMap<Int, String> = linkedMapOf(1 to "Computer", 2 to "Mouse")
    println("linkedHash = $linkedHash")
}