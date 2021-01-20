package chap07.section2

/* < 열거형 클래스에서 기본으로 제공되는 멤버들 >
 * 열거형 클래스의 각 상수는 객체로 취급되고 이에 따라 프로퍼티에 자동으로 생기던 toString같은것들이 생성됨
 * 1. name : 상수의 이름 자체를 반환, 즉 MONDAY 이런거 그대로 출력함
 * 2. ordinal : 0부터 시작하는 순서번호 가져오기, 이것과 전달인자로 초기화한 값은 다른거임
 * 3. toString() : 이름 가져오기
 * => 이때 name,ordinal은 프로퍼티처럼 사용하고 toString만 메소드처럼 사용함
 * */

enum class Color2(val r: Int, val g: Int, val b: Int){//주생성자로 받은 인자를 메소드에 사용할거임,
    RED(255,0,0), ORANGE(255, 165, 0),//이제 알수있는건 전달인자로 받은 변수가 여러개면
    YELLOW(255,255,0), GREEN(0, 255, 0), BLUE(0, 0, 255),//한 열거형 상수당 여러 초기값 가능하단것
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);//실제로도 색깔이 아마 이렇게 만들어지지 않았을까 생각함

    fun rgb() = (r*256+g) * 256+b //메소드
}

fun getColor(color: Color2) = when(color){
    Color2.RED->color.name //이름 가져오기 즉 RED 그대로 출력됨
    Color2.ORANGE -> color.ordinal //순서 번호 : 1
    Color2.YELLOW -> color.toString() //문자열 변환
    Color2.GREEN -> color //기본값(문자열)
    Color2.BLUE -> color.r //r값: 0, 왜냐면 주생성자에 전달인자를 그렇게 들여왔거든
    Color2.INDIGO -> color.g
    Color2.VIOLET -> color.rgb() //메소드 연산 결과
}

fun main() {
    println(getColor(Color2.RED))
    println(getColor(Color2.ORANGE))
    println(getColor(Color2.YELLOW))
    println(getColor(Color2.GREEN))
    println(getColor(Color2.BLUE))
    println(getColor(Color2.INDIGO))
    println(getColor(Color2.VIOLET))
}