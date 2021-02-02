package chap07.section2

/* < 이번 파일에 할 일 >
  이전 파일에선 애노테이션 처리방법에 따라 리플렉션할때 애노테이션 정보 나오는지에 대해 알아봤었다
  이번 파일에선 그 리플렉션을 직접 실험해볼거임

  < 리플렉션 >
    리플렉션이란 프로그램의 특정 구조를 분석해내는 기법이다 (메타정보 출력같은것인듯)
    실행시간에 클래스를 분석하기 위해서를 클래스 정보가 들어있는 클래스 레퍼런스로부터 알아낼 수 있다
    즉 클래스 레퍼런스에 메타정보 저장돼있는것
    클래스 레퍼런스는 클래스명::class 같은 형태로 표현할 수 있다
    여기선 User클래스이기 때문에 User::class가 됐음
    이때 이 User::class라는건 KClass<*> 자료형이다 이걸 클래스 타입이라고함
    어쨌든 User::class로 메소드 오갈때에는 이 클래스 타입 자료형 KClass<*>로 받아줘야 한다
    그리고 그러기 위해서 kotlin.reflect에 있는 몇가지 라이브러리들을 import해야됨
  */

import kotlin.reflect.KClass
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

class User(val id: Int, val name: String, var grade: String = "Normal"){
    fun check(){
        if(grade =="Normal") println("You need to get the Silver grade")
    }
}

fun main() {
    //1. 클래스명 출력(교재에선 타입 출력이라고함)
    println(User::class) //클래스 레퍼런스를 위해 ::class 사용, class chap07.section2.User라고 출력됨,
                         //이 User::class라는 것은 KClass<*> 자료형을 반환하기 때문에 다른 메소드를 오갈 때에는 이 자료형으로 받아줘야한다

    //2. 클래스의 프로퍼티 출력
    val classInfo = User::class //User클래스 정보를 읽기 위해 User::class 변수인 classInfo를 사욯해 정보 출력
    classInfo.memberProperties.forEach{
        println("Property name: ${it.name}, type: ${it.returnType}")
    }
    //3. 클래스의 메소드 출력
    classInfo.memberFunctions.forEach{
        println("Function name: ${it.name}, type: ${it.returnType}")
    }
    //함수에 전달해 자료형을 알아냄
    getKotlinType(User::class)
}

fun getKotlinType(obj: KClass<*>){//User::class의 자료형은 KClass<*>형태를 반환하기에 KClass<*>형인 obj로 받아주고 있음
    println(obj.qualifiedName)//이렇게 하면 User::class만 출력했을때 class chap07.section2.User라고 나오던것과 달리
                               //class 수식어 짤려서 chap07.section2.User라고만 나오게 된다
}