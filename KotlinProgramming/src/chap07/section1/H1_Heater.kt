package chap07.section1

/*< 커피 제조기 만들어보기 >
* 커피 만드는 순서는 책에서 알려줬음
* 이제 커피를 만들기 위해 필요한 여러가지 클래스들을 정의해서 커피 제조기를 구현할거다
* */

//히터 인터페이스
interface Heater {
    fun on()
    fun off()
    fun isHot() : Boolean
}