package chap07.section2

/*< 이너클래스 >
* 이너클래스의 경우 중첩클래스와 달리 외부클래스의 프로퍼티와 메소드에 접근이 가능한데
* private 멤버여도 접근이 가능하다고 한다!
* */

class Smartphone(val model: String){
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int){
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb" //cpu는 private 변수임에도 접근 가능함을 볼 수 있다
    }
}

fun main() {
    //사실 밑에 메인코드는 별로 필요 없음 그냥 private인데도 inner클래스는 접근 가능하단것만 알면됨
    val mySdcard = Smartphone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())
}