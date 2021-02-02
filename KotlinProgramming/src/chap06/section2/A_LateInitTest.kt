package chap06.section2

/*< 프로퍼티의 지연 초기화 >

* 지연 초기화가 필요한 이유 : 프로퍼티 선언시 초기화해야하는데
*                         만약 초기화에 필요한 정보가 나중에 나타나는 경우
*                         객체 생성과 동시에 초기화하는건 어렵다
*                         그래서 초기화를 미루기 위해 lateinit, lazy 키워드를 통해 이를 해결하고자 한다
*
*
* 지연초기화가 필요한 예시 : 지연 초기화가 필요한 구체적인 예시는 Car과 Engine임
*                        왜냐면 Engine객체가 생성되지 않으면 Car객체 초기화가 불가능하기 때문
*                        만약 지금 쓸것도 아닌데 미리 Engine 생성해서 초기화에 쓰려고 하면 그건 메모리 낭비다
*                        그래서 이럴 경우에도 지연 초기화로 임시객체만 생성해서 테스트해야됨
* 
* lateinit키워드 : lateinit 키워드를 사용하면 프로퍼티에 값이 바로 할당되지 않아도 컴파일러에서 허용해줌
*                 컴파일러에게 나중에 할당한단걸 알려주는것
*                 하지만 나중에 채워넣긴 해야됨 실행할때까지도 안채워서 비어있는 상태면 에러난다
* 
* lateinit의 제한사항 : 1. lateinit은 var로 선언된 프로퍼티에만 사용할 수 있다
*                     2. lateinit 사용한 경우 프로퍼티에 대해 getter setter 사용 불가능함*/

class Person{
    lateinit var name: String //1. lateinit 키워드 사용

    fun test(){
        if(!::name.isInitialized){     //2. 프로퍼티 초기화됐는지 판단 (::더블콜론 없으면 에러남)
            println("not initialized") //이쪽이 실행되는걸로 보아 lateinit 키워드를 통해 초기화를 미뤘기 때문에
        }else{                         //아직 실행되지 않았음을 알 수 있다
            println("initialized")
        }
    }
}
fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name="Kildong" //3. 기다렸다가 값이 들어온 이 시점에서 초기화됨
    kildong.test()
    println("name=${kildong.name}") //4.값이 들어온 이후에 사용했기에 잘되는거지
                                    //만약 지연초기화 해놓고 실제 값 대입하기 전에 사용하면 에러남
}