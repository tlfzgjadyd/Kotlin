package chap06.section2

/*이번엔 by lazy를 사용한 person변수와 그냥 lazy를 사용한 personDelegate를 비교해볼거다
*
* < by lazy와 lazy 할당의 차이점 >
* by lazy : 객체의 위임을 나타내는 반면
* lazy :    변수에 위임됨 Lazy 객체 자체를 나타낸다
*           그렇기에 바로 프로퍼티에 접근하지 못하고 personDelegate.value.name과 같이 
*           value를 한단계 더 거쳐서 접근해야한다
* 
* => 차이점 뭔소린지 모르겠었는데
*    한단계 더 거쳐서 프로퍼티에 접근하는거 보니까 다음과 같은것같음
*
* by lazy는 그 변수에 할당할 객체나 프로퍼티를 나중에 최초로 쓰일때 초기화하는거고
* lazy는 그 변수가 lazy라는 프로퍼티를 가지고 그 lazy 프로퍼티는 진짜 원하는 객체를 가지는데
* lazy 프로퍼티 초기화를 미뤘기 때문에 그 안에 있는 클래스 역시 같이 미뤄지는것
* 그림으로 그려보면 다음과 같다
* by lazy -> 진짜값 (미룬다)
* lazy-> 가짜속성 lazy(미룬다) ->진짜값 할당
* ================================================================================
* 위에까지가 by lazy와 lazy의 차이점이고
* 이제부턴 lazy 모드의 이해에 대해 알아볼거임
* 근데 밑에 코드쓴건 by lazy와 lazy 차이점까지만 쓴거니까 참고할것
* 
* lazy모드를 이해하기 위해 JVM에서 사용되고 있는 lazy키워드를 예시로 들었음
* lazy()는 매개변수 없는 람다식을 받을 수 있고 Lazy<T>를 반환함 (T 제네릭을 통해 모든 자료형 처리 가능)
* lazy의 실행은 구현부인 synchronizedLazyImpl()에 보내서 처리하는데
* 이때 mode 매개변수에 3가지 모드중에서 선택해서 지정할 수 있움
* mode 지정 안하면 기본값으로 SYNCHRONIZED가 된다
*
* < 3가지 종류의 mode >
* 1. SYNCHRONIZED (기본값) : lock을 사용해 특정 스레드만 사용하도록 그 외의 스레드를 막는다
* 2. PUBLICATION : 여러곳에서 호출될 수 있으나 처음 초기화된 후 반환값 사용
* 3. NONE : lock 사용하지 않기에 빠르지만 여러 스레드 동시 접근 가능해 값의 일관성 보장할 수 없음
*           그렇기에 항상 스레드가 1개만 있는 환경에서 작동하는 것이 보장될 경우 NONE을 사용해도 좋다
*
* 만약 다른 모드를 사용하고 싶은 경우 by lazy(모드명)을 통해 사용이 가능함
* 
* 코드를 자세히 보면 값을 getter에서 읽을때 값을 의미없는 값으로 초기화한 다음 synchronized 블록을 반환하고 있음
* 이떄 이 반환되는 블록은 스레드에 안전한 형태로 동작시키기 위해 lock기법을 사용하고 있다
* 아직 초기화되지 않았을 경우 값은 원하는 자료형으로 형변환되어 반환되고
* 또다시 호출이 일어나면 이미 생성한 변수를 통해 불러오게 된다
*
* => 이 마지막 문단 내가 나름 정리한거긴 한데 그래도 뭔소린지 못알아먹겠었음
*    그러다가 설명이 끝남 그냥 요약하자면 lazy 모드로 3종류 사용 가능하고
*    별도의 동기화 기법이 없으면 걍 기본값인 SYNCHRONIZED 쓰라는 뜻인듯
*    이걸 왜 여기서 알려주는지 뭐에다 쓰는건지 전혀 안나옴
* */

class Person3(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false //초기화 확인 용도

    // < 1. by lazy를 사용하는 person변수 >
    val person : Person3 by lazy { //1. lazy를 사용한 person 객체의 지연 초기화, 이전 예제에선 자료형 없이
        isPersonInstantiated = true  //val person by lazy 이런식으로만 했었지 하지만 이건 객체라 명시해줬음
        Person3("Kim", 23) //2. Person3객체가 통째로 Lazy 객체로 반환되어 person프로퍼티에 할당됨
     }

    // < 2. lazy를 사용하는 personDelegate변수 >
    val personDelegate = lazy {Person3("Hong", 40)} //3. 위임 변수를 사용한 초기화

    println("person Init : $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name=${person.name}") //4. 이 시점에서 초기화
    println("personDelegate.value.name=${personDelegate.value.name}") //5. 이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: 4{personDelegate.isInitialized()}")
}