package chap08.section1

/* * < 가변성의 3가지 유형 >
* 제네릭에서 상, 하위와 같은 관계를 주기 위해선 가변성의 3가지 특징을 이해하고 있어야한다
* 1. 공변성     : T'가 T의 하위 자료형이면 C<T'>도 C<T>의 하위 자료형이다 ( 생상자 입장의 out 성질, class Box<out T>이런식으로 사용)
* 2. 반공변성   : T'가 T의 하위 자료형이면 C<T>는 C<T'> 하위 자료형이다   ( 소비자 입장의 in 성질, class Box<int T>이런식으로 사용)
* 3. 무변성    : C<T>와 C<T'>는 아무 관계가 없다 (생상자 + 소비자, class Box<T>이런식으로 사용)
*
* < 반공변성 contravariance>
* 형식 매개변수의 상하 자료형 관계가 반대로 뒤집혀서 인스턴스 자료형 관계로 되는 경우 반공변성이라고 한다
* 아래의 예제처럼 in이라는 키워드로 역방향 상하 자료형 관계가 성립될 경우
* Any의 하위 클래스인 Int는 공변성을 가지게된다
* 하지만 Nothing은 실제로 Int의 하위 자료형이 아니라 에러남
* +이때 Any<-Int<-Nothing 클래스로 실험을 할거다 Nothing은 최하위 클래스인듯
* 
* < Nothing 클래스 >
* Nothing 클래스는 코틀린 최하위 자료형으로 아무것도 가지고 있지 않은 클래스다
* 최상위 클래스인 Any와는 정반대인 클래스로 
* 보통 Nothing은 아무것도 존재하지 않는 값일때 사용한다
* 예를들어 함수의 반환 자료형이 Nothing이면 그 함수는 절대 아무것도 반환하지 않는 것을 나타낸다
* 자바의 void 대신 코틀린에선 Unit을 사용하지만 Unit은 객체를 돌려주기에 차이점이 있다
* */

class Contravariance<in T>(val size: Int) //여기에 in 키워드로 클래스를 선언한다

fun main() {
    val anys: Contravariance<Int> = Contravariance<Any>(10) //in키워드 & 실제 자료형이 상하관계이므로 실제완 반대로 할경우 에러안남
    //val anys2: Contravariance<Any> = Contravariance<Int>(10) //이미 관계가 뒤집혔기에 원래대로 가리키면 에러남
    val nothings: Contravariance<Nothing> = Contravariance<Int>(20) //그래서 반대로 하면 역방향 상하관계라 에러 안남
}