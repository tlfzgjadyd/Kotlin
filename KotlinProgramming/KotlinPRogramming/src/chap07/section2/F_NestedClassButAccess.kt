package chap07.section2

/*중첩클래스를 사용하면서도 밖에 감싼 외부클래스에도 접근하는법
* : companion object를 안에 두면 된다 
* 자세한 예시는 아래와 같다*/

class Outer2{
    val ov = 5
    class Nested{ //1. 여기에 중첩클래스
        val nv = 10
        fun accessOuter(){
            println(country)
            getSomething()//4. 비록 중첩클래스를 사용했지만 외부클래스의 companion object에는 접근 가능하기에 
                          //   getSomething()함수에도 접근이 가능하다
                          //   이것이 가능한 이유는 컴패니언 객체로 지정할 경우 객체 생성 없이도 고정 정적 메모리를 할당받기 때문이다 
        }
    }//2. 여기까지가 중첩클래스 끝
    companion object{ //3. 중첩클래스 바깥이자 외부클래스 안쪽에 companion object를 두었음
        const val country = "Korea"
        fun getSomething() = println("Get something...")
    }
}
fun main() {

}