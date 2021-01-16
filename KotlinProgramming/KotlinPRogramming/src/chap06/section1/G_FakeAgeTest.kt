package chap06.section1

/*이번 예제에서는 field 보조필드에 when을 통해 대입하는 작업을 할거임
* 이 과정에서 예전 연습문제때 when쓰는 예제 틀렸던거에 대한 해답을 얻었음
* 자세한 설명은 아래 또는 4단원 연습문제 3번 파일을 참조*/

fun main() {
    val kim=FakeAge()
    kim.age=15
    println("Kim's real age = 15, pretended age = ${kim.age}")
    
    val hong = FakeAge()
    hong.age=35
    println("Hong's real age = 35, pretended age = ${hong.age}")
}

class FakeAge{
    var age: Int = 0
        set(value){
            field=when{ //여기서 꺠달았음 이전에 연습문제에서 when 사용한 예제 틀렸었는데
                value <18->18 //내가 생각한 when이랑 개념이 달랐던거임 while인줄
                value in 18..30 ->value //실제론 switch - case같은걸로 굳이 판별할 변수 안줘도 되는걸 잊고있었음
                else -> value -3
            }
        }
}