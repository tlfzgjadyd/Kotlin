package chap08.section1

/* < reified 자료형 > 
* refine인줄 알았네 rei  fied고 구체화된 이라는 뜻임
* 일반적인 제네릭 함수의 경우 T 자료형은 자바처럼 실행시간에 삭제되기 때문에 T 자체에 접근하는건 불가능하다
* 그래서 <Int>처럼 이미 결정된 자료형이 아닌 <T>같은 결정되지 않은 제네릭 자료형은
* 컴파일 타임에만 접근 가능하고 런타임엔 접근 불가능하다
* 그래서 런타임에도 T 자료형이 삭제되지 않도록 별도의 처리를 해주거나 reified를 사용해야한다
*
* < 런타임에도 T를 살아있게 하는 방법 >
* 1. fun<T> myGenericFun(c: Class<T>) //이처럼 c: Class<T> 해주면 런타임에도 안사라짐
* 2. inline fun <reified T> myGenericFun() //이처럼 reified 키워드를 사용해주면 됨
*
* < 1번째 방식 : Class<T> 방식 >
* 자바에서는 .class 형태로 반환 받는 객체를 Class<T>라고 한다
* 이 Class라는 원본클래스는 대한 많은 메타데이터를 가지고 있음(패키지명, 메소드, 필드, 변수, 구현된 인터페이스 등)
* 코틀린에서는 Object::class로 표현되고 KClass를 나타낸다
* KClass는 자바의 Class와 완전히 동일하지는 않기에
* 완전히 동일한 Class를 가지려면 Object::class.java라고 표현해야 한다
* .java 확장 프로퍼티로 자바의 Class를 가져오기 때문
* 그래서 다음과 같이 됨
* Object::clas //KClass
* Object::class.java //Class
*
* < 2번째 방식 : reified 방식의 단점 >
* reified는 인라인 함수에만 사용 가능하다는 단점이 있다
* 인라인 키워드에 의해 본문에 코드가 복사되어 들어갈 경우
* 컴파일러가 복사할 때에 실제 자료형을 알 수 있게 되기에 런타임에도 사용할 수 있게 되는것
* 
* < 1번째 방식 관련해서 KClass의 리플렉션 >
* KClass에서 제공하는 리플렉션은 런타임에 사용되는 자신의 구조와 행위를 관리. 수정할 수 있는 개념을 말한다
* "Type Introspection"은 런타임에 객체 자료형을 결정할 수 있는 능력을 의미함
* 예를들어 특정 클래스에서 함수 호출할때 함수명을 안쓰고도 리플렉션을 써서 호출 가능하다
* 자바에서 이런 리플렉션 사용하려면 kotlin-reflect.jar을 이용해야 한다
* KClass는 isAbstract 등 확인하는 기능을 제공하기도함
*
* */

fun main() {
    val result = getType<Float>(10)
    println("result = $result")
}
inline fun <reified T> getType(value: Int): T{//reified 쓰려면 인라인이어야하기에 inline 키워드도 같이 썼음
    println(T::class) //reified 키워드를 사용했기에 실행 시간에 삭제되지 않고 사용 가능
    println(T::class.java)
    
    return when (T::class){ //when은 switch같은 역할을 하니까 받아들인 제네릭 자료형에 따라 반환
        Float::class ->value.toFloat() as T
        Int::class ->value as T
        else -> throw IllegalStateException("${T::class} is not supported!")
    }
}