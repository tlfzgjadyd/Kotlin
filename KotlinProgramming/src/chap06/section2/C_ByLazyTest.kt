package chap06.section2

/* < lazy를 사용한 지연 초기화 >
*  lazy를 사용한 지연 초기화를 배울거임
*  lateinit을 사용할때는 val은 안되고 var에만 먹혔다
*  그래서 val로 선언한것도 초기화를 미루고 싶어서 lazy를 사용함
*
*  < lazy는 무엇인지 >
*  lazy는 람다식으로 구성되어 lazy 인스턴스를 반환하는 함수다
*  val 프로퍼티에 by lazy를 사용해서 초기화해두면
*  나중에 최초로 그 프로퍼티가 쓰일때 lazy 인스턴스 반환값으로 초기화됨
*
*  < lazy의 특징 >
*  1. 호출 시점에 by lazy{...} 정의에 의해 블록 부분의 초기화 진행
*  2. 불변의 변수 선언인 val에서만 사용 가능하다(읽기 전용)
*  3. val이므로 값을 다시 변경할 수 없다
* */

class LazyTest{
    init{
        println("init block") //2. test객체 생성시 초기화블록이 작동함, 
                              // 하지만 subject라는 프로퍼티에는 lazy를 붙였기에 초기화 건너뜀 
                              //그 밑에 flow함수는 초기화고 뭐고 전달인자 없으니까 나중에 실행될때 본문 실행할거임
    }

    val subject by lazy{ //by는 프로퍼티를 위임할때 사용하는 키워드
        println("lazy initialized") //6.
        "Kotlin Programming" //7. lazy 반환값,
                             //이 반환값에 의해 나중에 subject가 최초로 쓰일때 subject 변수값은
                             //"Kotlin Programming"이란 값으로 초기화됨
    }
    fun flow(){
        println("not initialized") //4. flow 실행돼서 본문이 순서대로 실행된다
        println("subject one: $subject") //5. 최초 초기화 시점, 왜냐면 이때 처음 subject란 값이 쓰이기 때문
        println("subject two: $subject") //8. 이미 초기화된 값 사용
    }
}

fun main() {
    val test = LazyTest() //1. test객체 생성
    test.flow() //3. flow함수 사용
}