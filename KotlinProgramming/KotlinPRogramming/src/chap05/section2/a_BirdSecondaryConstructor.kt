package chap05.section2

/*여러가지 다른 전달인자 조합으로 생성했을때 생성되게할 여러개의 부생성자들을 만들음*/

class Bird{
    var name: String
    var wing: Int
    var beak: String
    var color:String

    //1. 첫번째 부생성자 (this사용)
    constructor(name:String, wing:Int, beak:String, color:String){
        this.name=name //this를 사용하기 싫으면 전달인자 이름 앞에 언더스코어 붙여서 _name으로 받고 name=_name으로 한다
        this.wing=wing
        this.beak=beak
        this.color=color
    }

    //2. 두번째 부생성자(_언더스코어 사용)
    constructor(_name:String, _beak:String){//그렇게 언더스코어 사용한 방식이 이거임
        name=_name
        wing=2
        beak=_beak
        color="grey"
    }

    fun fly()=println("Fly wing: $wing")
    fun sing(vol:Int)=println("Sing vol: $vol")
}

fun main(){
    val coco=Bird("mybird", 2, "short", "blue") //생성자의 인자로 객체 생성과 동시에 초기화
    coco.color="yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
    
    
    val bird1=Bird("mybird", 2, "short", "blue") //첫번째 부생성자 호출
    val bird2=Bird("mybird2", "long")//두번째 부생성자 호출
}