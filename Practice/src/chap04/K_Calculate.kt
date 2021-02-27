package chap04

import java.util.Scanner
abstract class Calc(var a:Int, var b:Int){//안보이지만 open키워드들을 가짐, 추상클래스 아닌데 상속 가능케 하려면 open 키워드 필요
    fun setValue(a:Int, b:Int){         //지금 이건 추상클래스이므로 해당사항 없음
        this.a = a //this에 ->쓸지 .쓸지는 자바를 따름
        this.b = a
    }
    abstract fun calculate():Int; //리턴값은 전달인자 쓰는부분 다음에 온다
}
class Add(a:Int, b:Int):Calc(a, b){//코틀린은 상속을 :로 표시하는 대신 반드시 부모쪽에도 생성자표시 해줘야됨
    //이때 자기자신의 생성자에는 val, var 없이 이름(같아도됨), 타입만 쓰고 부모생성자 전달하는 곳에는 이름만 쓰고
    //유일하게 val var 들어가는 곳은 부모의 클래스 정의부에 있는 생성자이다
   override fun calculate():Int{ //override 키워드 필수
       return a+b
   }
}
class Sub(a:Int, b:Int):Calc(a,b){
    override fun calculate():Int{
        return a-b
    }
}
class Mul(a:Int, b:Int):Calc(a,b){
    override fun calculate():Int{
        return a*b
    }
}
class Div(a:Int, b:Int):Calc(a,b){
    override fun calculate():Int{
        return a/b
    }
}
fun main() {
    val sc = Scanner (System.`in`)
    print("두 정수와 연산자를 입력하시오>>")
    val a = sc.nextInt()
    val b = sc.nextInt()
    val type = sc.next()
    lateinit var instance:Calc//와 처음으로 lateinit 쓸만한 예제가 나왔어
    //뭐냐면 그냥 var instance:Calc로 해놓고 when문에서 할당하는데
    //맨마지막에 instance.calculat()에서 에러나는거임
    //왜냐면 instance 객체가 초기화가 안됐대
    //그래서 null로 초기화하려했는데 안먹혔음
    //instance?.로 세이프콜도 해보고
    //instance문제니까 !!instance나 instance!! 단정기호도 해봤는데 안됐음
    //그래서 어짜피 when문에서 반드시 초기화할텐데 굳이 저기서 초기화할필요 있나 싶어서
    //그럼 lateinit을 쓰면 되겠다는 생각이 들었음
    //그러니까 어떤거냐면 C++에서 int a;만 해놓고 가면 초기화 안했다고 에러나잖아
    //그래서 쓸데없이 int a=0;으로 초기화해주고 가곤 했는데
    //코틀린에서는 그런거 없이 나중에 값 할당할거니까 lateinit int a; 하고 넘어가는것임
    //그런 느낌으로 lateinit을 사용한다
    //적어도 변수에선 그런데 함수나 다른거에도 사용방법 있던건 언제쓰는지 아직 감이 안잡힘
    //생각보다 자바문제가 코틀린에 도움 되긴하네
    when(type){//type이 String이라 비교하는 +도 ""로 감싸줘야됨 ''로감싸면 to_String 호출해야됨
         "+" -> instance=Add(a,b)//is "+"고 뭐고 그런거 없고 그냥 "+"로 끝이다
         "-" -> instance=Sub(a,b)
         "*" -> instance = Mul(a,b)
         "/" -> instance = Div(a,b)
    }
    print(instance.calculate())
}