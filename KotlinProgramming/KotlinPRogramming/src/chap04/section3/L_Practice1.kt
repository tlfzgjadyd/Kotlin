package chap04.section3

/*str1변수에 null이 저장될 수 있는 경우를 if문으로 검사한 다음 null이 저장되지 않은 경우 str1의 길이를 반환,
  null이 저장되어 있는 경우에는 -1을 반환하도록 코드를 직접 작성*/

fun main() {
    var str1:String?="Hello"
    var len={if(str1!=null) str1.length else -1}
    println(len())
}