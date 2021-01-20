package chap07.section2

/*< 열거형 클래스 >
* 열거형 클래스 : 여러 개의 상수를 선언하고 열거된 값을 조건에 따라 선택할 수 있는 특수한 클래스
* enum키워드를 통해 사용하며 자료형이 동일한 상수를 나열할 수 있다
* 열거형 클래스를 실습하며 확인해본 결과 이건 뭐하는 애들이냐면
* MONDAY같이 어떤 정해진 값을 읽기 쉽게 문자형태로 사용하고 싶음 그런 경우에 사용하는데
* RGB색상의 BLUE(1,1,1)이런거 할때 enum형의 주생성자로 3개의 전달인자 받아서 그 BLUE의 3가지 프로퍼티를 초기화하는 방식이다
* 그래서 결국 뭐냐면 enum클래스 내에는 동일한 템플릿을 가진 여러 객체들이 존재하는데
* 그 객체들 내부에 각각 존재하는 프로퍼티들은 enum클래스 생성자의 전달인자를 통해 초기화하는거지
* 그런 다음에 그 객체들의 프로퍼티 값을 사용하고 싶을 경우 BLUE.r BLUE.g BLUE.b 이런식으로
* 객체명.속성명 사용하듯이 사용하는거고
* 어쨌든 이런 방식으로 초기화되는거기 때문에 MONDAY(1)했다고 해서 얘의 순서번호가 0->1로 바뀌고 이러는게 아니라
* 순서번호는 그대로 유지하는데 day속성값이 1로 바뀌는것 뿐임
* 즉 MONDAY객체 내에는 ordinal속성과 day속성이 들어가게 되는거고 ordinal프로퍼티 값으론 0이 영원히 지속되고
* day속성만 내가 설정한 1의 값을 갖게 되는 것이다
* 그래서 이후에 프린트할떄 MONDAY.ordinal을 하게 되면 영원히 변하지 않는 순서값을 출력하게 되는 것이다
* 
* < 실드클래스와 열거형클래스의 공통점과 차이점 >
* 나열하는것은 비슷하지만
* 열거형클래스는 실드클래스처럼 다양한 자료형을 다루지 못한다
* 한 enum 내에는 같은 자료형만 올 수 있음
*
* < 열거형 클래스 사용법 >
* 1. 값 따로 지정해주지 않는 방식
* enum class 클래스명 {
*    NORTH, SOUTH, WEST, EAST
* }
*
* 2. 값 지정해주는 방식, 이때는 반드시 전달인자로 Int형 num을 받아줘야 에러안남 왜인지는 정확히는 모르겠는데 이후에 작동하는걸로 봐서
* enum class 클래스명(val num: Int){ //여기서 받은 전달인자가 열거형 상수들의 프로퍼티가 되는것같음 Int자료형을 num이란 이름으로
*   MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), //받았으니 각 MONDAY, TUESDAY들에는 num프로퍼티값이 1, 2, 이런식으로
*   FRIDAY(5), SATURDAY(6), SUNDAY(7)                 //저장되는 것이라고 추정된다
*
* 3. 메소드를 포함시키는 방식 (이떈 필요하길래 생성자도 같이 놔줌, 열거형 클래스도 당연히 주생성자 가질 수 있음)
* enum class Color(val r: Int, val g: Int, val b: Int){//주생성자로 받은 인자를 메소드에 사용할거임
*   RED(255,0,0), yello(255,255,0), BLUE(0, 0, 255); //메소드를 포함하는 경우 열거한 상수와 구분하기 위해 세미콜론 찍어줌
*
*   fun rgb() = (r*256+g) * 256+b //메소드
* }
* fun main(args: Array){
*   println(Color.BLUE.rgb())
* }
* */

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class DayOfWeek(val num: Int){//주생성자로 Int형 변수 num을 받았기에
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), //아래의 초기화 숫자 값들은 num이란 프로퍼티로
    FRIDAY(5), SATURDAY(6), SUNDAY(7)                      //들어가게 되는듯
}

enum class Color(val r: Int, val g: Int, val b: Int){//주생성자로 받은 인자를 메소드에 사용할거임
    RED(255,0,0), YELLOW(255,255,0), BLUE(0, 0, 255);
                                    //열거한 상수끝에 세미콜론 붙여서 메소드 영역과 구분

    fun rgb() = (r*256+g) * 256+b //메소드
}
fun main() {
    val day = DayOfWeek.SATURDAY //SATURDAY의 값 읽기, 말그대로 SATURDAY라고 출력됨
    println(day)
    when(day.num){ //num이란 이름으로 생성자 전달인자 받아서 열거형 상수들의 값을 초기화했기에 그 num프로퍼티 사용시 초기화한 값을
        1, 2, 3, 4, 5 -> println("Weekday")                                                        //읽어올 수 있다
        6, 7->println("Weekend!")
    }

    println(Color.BLUE.rgb())
}