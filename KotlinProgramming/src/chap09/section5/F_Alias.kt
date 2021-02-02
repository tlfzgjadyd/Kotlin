package chap09.section5

import java.io.File

/*< 자료형 별칭 >
* 알리아싱을 통해서 특정 자료형 대체 가능
* 특히 제네릭 자료형에서 유용하게 쓸 수 있다
* 함수 자료형, 내부클래스에도 사용됨
* 
* < 알리아싱 사용하기 >
* 키워드 : typealias 키워드를 사용하고
* 주의사항 : main함수 바깥에 사용해야 에러 안나더라
* */

//1. 제네릭에 알리아싱
//typealias NodeSet = Set<Network.Node> //Network 에러나서 일단 막아둠
typealias FileTable<K> = MutableMap<K, MutableList<File>>

//2. 함수 자료형에 알리아싱
typealias MyHandler = (Int, String, Any) ->Unit
typealias Predicate<T> = (T) -> Boolean

//3. 내부클래스에 알리아싱
class Outer{
    class Nested{
        inner class Inner
    }
}
typealias Something = Outer.Nested.Inner