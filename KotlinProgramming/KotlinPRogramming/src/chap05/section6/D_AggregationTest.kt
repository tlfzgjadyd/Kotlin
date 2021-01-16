package chap05.section6

/*  3. 집합관계 Aggregation: 한 클래스가 다른 클래스를 소유하는 것으로
     (하얀 다이아몬드)      연못이 오리를 소유하는 것을 예로 들 수 있다

     < 증거 찾아내기 >
     1. 객체 2개는 서로 따로 생성되며
     2. 두 객체의 생명주기는 다름
     3. 포함관계다
*/

//여러 마리의 오리를 위한 List 매개변수
class Pond(_name: String, _members: MutableList<Duck>){
    val name: String = _name
    val members: MutableList<Duck> = _members
    constructor(_name: String): this(_name, mutableListOf<Duck>())
}

class Duck(val name: String)
    fun main(){
        //두 개체는 서로 생명주기에 영향을 주지 않음
        val pond = Pond("myFavorite")
        val duck1=Duck("Duck1")
        val duck2=Duck("Duck2")

        //연못에 오리를 추가 - 연못에 오리가 집합
        pond.members.add(duck1)
        pond.members.add(duck2)

        //연못에 있는 오리들
        for(duck in pond.members){
            println(duck.name)
        }
    }