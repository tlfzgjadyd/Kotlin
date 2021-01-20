package chap07.section2

/*남은 애노테이션에 관한거 전부 여기에 쓸거임
*
* < 1. 애노테이션에 매개변수 지정하기 >
* 애노테이션에 매개변수를 지정하고자 한다면 다음과 같이 생성자를 통해 정의한다
* annotation class Special(val why: String) //애노테이션 클래스 정의
* @Special("example") class Foo4{} //애노테이션과 함깨 매개변수를 전달
* 
* < 애노테이션 매개변수로 가능한 자료형들 >
* 1. 자바의 기본형과 연동되는 자료형(Int, Long등)
* 2. 열거형
* 3. 문자열
* 4. 클래스자료형(KClass<*> 말하는거임
* 5. 기타 애노테이션
* 6. 위의 목록들을 가지는 배열
* 
* < 2. 애노테이션에서 또다른 애노테이션 사용하기 >
* 만약 애노테이션이 또 다른 애노테이션을 사용하려는 경우 @기호는 사용하지 않아도 된다 이미 전달된 후이기 때문인듯
* annotation class ReplcasWith(val expression: String) //첫 번쨰 애노테이션 클래스 정의
* annotation class Deprecated( //두 번째 애노테이션 클래스 정의
*   val message: String,
*   val replaceWith: ReplaceWith = ReplaceWith("")
* )
* @Deprecated("This function is deprecated, use === instead", ReplaceWith("this === other"))
* //Deprecated는 @를 사용하는데 ReplaceWith는 @기호가 생략하고 있는것을 확인할 수 있다
*
*
* < 3. 애노테이션 인자로 특정 클래스가 필요한 경우 >
* 애노테이션 인자로 특정 클래스 필요한 경우 위에서 클래스자료형도 가능하댔지 그래서 코틀린의 KClass 사용하면
* 코틀린 컴파일러가 자동으로 자바 클래스로 변환시켜주니까 그냥 쓰면 됨 이부 자바코드에서도 애노테이션 인자 쓸 수 있게 된다
* 
* < 4. 표준 애노테이션 >
* 1. @JvmName : 밑에 쓴 함수명을 JvmName이 받은 전달인자로 바꿔준다 (자세한건 아래 코드를 보면됨)
* 2. @JvmStatic : 자바의 정적 메소드로 생성할 수 있게 해줌
* 3. @Throw : 코틀린의 throw 구문이 자바에서도 포함되도록 한다
* 4. @JvmOverloads : 코틀린에서 기본값을 적용한 인자에 함수를 모두 오버로딩해준다
* => 이처럼 표준 애노테이션은 대부분 자바와의 원활한 연동에 목적을 두고 있다
* 
 */
import java.io.FileNotFoundException
import java.nio.file.Paths
import kotlin.reflect.KClass

//< 1. 애노테이션에 매개변수 지정하기 >
annotation class Special(val why: String) //애노테이션 클래스 정의
@Special("example") class Foo4{} //애노테이션과 함깨 매개변수를 전달

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//< 2. 애노테이션에서 또다른 애노테이션 사용하기 >
annotation class ReplcasWith(val expression: String) //첫 번쨰 애노테이션 클래스 정의
annotation class Deprecated( //두 번째 애노테이션 클래스 정의
    val message: String,
    val replaceWith: ReplaceWith = ReplaceWith("")
)
@Deprecated("This function is deprecated, use === instead", ReplaceWith("this === other"))
//deprecated는 @를 사용하는데 ReplaceWith는 @기호가 생략하고 있는것을 확인할 수 있다

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//< 3. 애노테이션 인자로 특정 클래스가 필요한 경우 >
annotation class Ann(val arg1: KClass<*>, val arg2: KClass<out Any>)
@Ann(String::class, Int::class) class MyClass2

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//< 4. 표준 애노테이션 >
@JvmName("filterStrings") //JvmName은 자바로 변환할때 filter라는 이름을 filterStrings로 변환
fun filter(list: List<String>): Unit{}

@JvmName("filterInts")//JvmName은 자바로 변환할때 filter라는 이름을 filterInts로 변환
fun filter(list: List<Int>): Unit{}

class File5(val path: String){
    @Throws(FileNotFoundException::class)
    fun exists():Boolean{
        if(!Paths.get(path).toFile().exists())
            throw FileNotFoundException("$path does not exist")
        return true
    }
}