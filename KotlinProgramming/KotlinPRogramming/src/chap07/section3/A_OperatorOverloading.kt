package chap07.section3

/*연산자 오버로딩은 다형성의 한 종류다
*
* < 연산자의 작동방식 >
* a+b는 a.plus(b)를 호출하는것과 같음
* 이때 a와 b의 자료형에 따라 여러 자료형의 plus함수들이 선언되어있다
* 각각은 연산자이기 때문에 operator 키워드를 통해
* operator fun plus(other::Byte): Int 이런식으로 여러 자료형들에 대해 선언되어있음
* 
* < 산술연산자의 종류 >
* 산술연산자 : 사칙연산, %등이 포함된다, 이떄 코틀린 기존의 mod연산자는 이름이 rem으로 바뀌었음
* a+b =a.plus(b)
* a-b = a.minus(b)
* a*b = a.times(b)
* a/b = a.div(b)
* a%b=a.rem(b)
* a..b = a.rangeTo(b)
* =>여기서 뭐뭐있는진 안중요하고 각각 +가 plus에 대응되고 *는 times에 대응되고 이런것이 중요하다 오버로딩 해야하니까
*   그리고 a..b는 뭔지 알아봐야됨
* 
* < 호출 연산자의 종류 >
* 호출연산자 : 함수 호출을 돕는데 사용
* 이건 구조가 조금 까다로움 이런식으로 Manager클래스가 있다고 치자
* class Manager{
* operator fun invoke(value: String){
*   println(value)
* }}
* 메인함수는 이렇다
* fun main(){
*   val m = Manager()
*   m("Do ~") //manager.invoke("...") 형태로 호출되며 invoke가 생략됨
* 
* 분명 Manager클래스 내에 있는 invoke함수를 호출해야 작동할 예정일텐데 invoke함수 호출 없이
* 그냥 m으로 객체명으로 호출하면 알아서 invoke가 작동하도록 되어있다
* 이처럼 invoke가 있는데 람다식에는 기본적으로 invoke가 정의되기에 sum.invoke()대신 sum()으로 사용이 가능한것
* 
* < 인덱스 접근 연산자 >
* 인덱스 접근연산자 : getter, setter다루기 위한 대괄호[]연산자가 제공되며
* a[i]같은건 a.get(i), a[i]=b;같은건 a.set(b)같은 형태로 제공된다
* 
* < 단일 연산자 >
* 단일 연산자 : +a, -a, !a같은 애들이다 뭔지 알잖음 단항연산자임,
* 각각은 이렇게 대응된다
* +a = a.unaryPlus()
* -a = a.unaryMinus()
* !a = a.not()
* 
* < 범위 연산자 >
* 범위 연산자 : in 연산자는 특정 객체 반복을 위해 반복문에 사용된다
* if ( i in 1..10) 이런식으로 사용됨
* if(a in b) 는 if(b.contains(a))에 대응된다
*
* < 대입 연산자 >
* 대입 연산자 : 연산 결과 할당하는 =시리즈
* a+=b 는 a.plusAssign(b)
* a-=b 는 a.misnuAssign(b)
* a*=b 는 a.timesAssign(b)
* a/=b 는 a.divAssign(b)
* a%b  는 a.remAssign(b)
* 
* < 동등성 연산자 >
* 동등선 연산자 : ==랑 !=
* a==b는 a?.equals(b) ?: (b===null)
* 에 해당한다 이때 인자가 null이어도 작동할 수 있도록 해놨음
* 그렇기때문에 만약 a, b 둘 다 null이어도 true가 반환되는 점에 주의해야됨
* 그리고 이때 equals는 Any클래스(최상위)에 operator 붙어서 구현된거라 override 키워드를 통해 ==와 치환 가능하며
* 이런 특이점 때문에 equals는 확장함수로 구현 불가능하다
* 
* < 비교 연사자 >
* a비교기호 b는 a.compareTo(b)에 대응된다
* */

class Point(var x: Int = 0, var y: Int = 10){
    //plus()함수의 연산자 오버로딩
    operator fun plus(p: Point) :Point { //a+b는 a.plus(b)호출과 같기에 plus 연산자를 선언해준것
        return Point(x + p.x, y+ p.y)
    }
}

fun main() {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)
    
    var point = Point()
    point = p1+p2 //Point 객체의 +연산이 가능하게됨
    println("point = (${point.x}, ${point.y}")
}