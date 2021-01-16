package chap06.section3

/* < 3. object 표현식만 사용하기>
* 이번 예제에서는 앞에서 말한 object 표현식 3가지 사용법중 3번째 방식을 사용할거임
* 객체는 필요하지만 상위 인터페이스나 클래스가 없는 경우에는 이렇게 가능하다
* 이번엔 object 표현식만 쓴다음 상속 안받은채로 object표현식 내부에 원하는 내용을 적었음
*/

fun foo(){
    val adHoc = object{
        var x: Int=0
        var y: Int=0
    }
    print(adHoc.x+adHoc.y)
}