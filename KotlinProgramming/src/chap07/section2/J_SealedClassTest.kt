package chap07.section2

/*< 실드 클래스 >
* 실드클래스는 미리 만들어둔 자료형을 묶어서 제공하기에 Enum열거형 클래스라고도 볼 수 있다
*
* < 실드 클래스 주의사항 >
* 1. private이 아닌 클래스 생성자는 허용되지 않는다
* 2. 같은 파일내에선 상속 가능하지만 다른 파일로는 상속불가능
* 3. 블록내에 선언되는 클래스는 상속이 필요한 경우 open 키워드로 선언될 수 있다
*
* < 실드 클래스 사용법 >
* sealed class 클래스명
* */

//실드 클래스를 선언하는 첫번째 방법
sealed class Result{
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String): Result()
}
class Status: Result() //같은 파일 내이기 때문에 실드클래스인 Result를 상속받을 수 있었음
class Inside: Result.Success("Status") //이건 Result말고 Result 내부에 있는 Success 클래스를 상속받았다
                                        //그게 가능한 이유는 Success클래스에만 open키워드를 붙여 상속이 가능하도록 했기 때문