package chap04
//이제 생성자 여러개 써야해서 부생성자를 쓰게됨
//부생성자는 자바나 c++과 달리 클래스명 말고 constructor라는 키워드 하나로 생성함
//constructor 옆에 클래스명도 안오고 바로 전달인자 온다
//내부에서는 this.을 사용하거나 _name으로 변수명을 언더스코어로 바꾸는 방식을 사용한다
//근데 막상 풀어보니까 부생성자 필요없었네

class Song constructor(val title:String, val artist:String, val year:Int, val country:String){
    //만약 가시성 public같은걸 class에 지정하면 constructor키워드 생략 불가
    fun show(){
        println("${year}년 ${country}국적의 ${artist}가 부른 ${title}")
    }
}

fun main() {
    val song = Song("Dancing Queen", "ABBA", 1978, "스웨덴")
    song.show()
}