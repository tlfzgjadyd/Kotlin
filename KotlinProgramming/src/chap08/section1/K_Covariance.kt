package chap08.section1

/* * < 가변성의 3가지 유형 >
* 제네릭에서 상, 하위와 같은 관계를 주기 위해선 가변성의 3가지 특징을 이해하고 있어야한다
* 1. 공변성     : T'가 T의 하위 자료형이면 C<T'>도 C<T>의 하위 자료형이다 ( 생상자 입장의 out 성질, class Box<out T>이런식으로 사용)
* 2. 반공변성   : T'가 T의 하위 자료형이면 C<T>는 C<T'> 하위 자료형이다   ( 소비자 입장의 in 성질, class Box<int T>이런식으로 사용)
* 3. 무변성    : C<T>와 C<T'>는 아무 관계가 없다 (생상자 + 소비자, class Box<T>이런식으로 사용)
*
* < 공변성 covariance >
* 형식 매개변수의 상하 자료형 관계가 그대로 인스턴스 자료형 관계로 이어지는 경우 공변성이라고 한다
* 아래의 예제처럼 out이라는 키워드로 상하 자료형 관계가 성립될 경우
* Any의 하위 클래스인 Int는 공변성을 가지게된다
* 하지만 Nothing은 실제로 Int의 하위 자료형이 아니라 에러남
* +이때 Any<-Int<-Nothing 클래스로 실험을 할거다 Nothing은 최하위 클래스인듯
*
* < out키워드에 var 사용하기 >
* out을 사용할 경우 매개변수는 val만 사용 가능하기에
* 만약 var을 사용하고 싶을 경우 private를 붙여줘야한다
* 좀더 아래쪽에 outVar클래스를 보면 알 수 있음
* */

class Covariance<out T>(val size: Int) //여기에 out 키워드로 클래스를 선언한다

fun main() {
    val anys: Covariance<Any> = Covariance<Int>(10) //out키워드 & 실제 자료형이 상하관계이므로 객체 생성 가능
    //val nothings: Covariance<Nothing> = Covariance<Int>(20) //실제론 Int가 Nothing의 기반클래스라 반대로해서 에러남
    val nothings: Covariance<Int> = Covariance<Nothing>(20) //이건 제대로된 관계라 에러 안남
}

class outVar<out T>(private var elem: T)
