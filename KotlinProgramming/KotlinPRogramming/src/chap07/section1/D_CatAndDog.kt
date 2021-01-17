package chap07.section1

open class Animal(val name: String)

//1. feeding의 구현을 위해 인터페이스 Pet 지정
class Dog(name: String, override var category: String) : Animal(name), Pet{
    override var species: String = "dog"
    override fun feeding(){
        println("Feed the dog a bone")
    }
}

class Master{//마스터는 개와 노는 함수 및 고양이와 노는 함수를 가지고 있다
    
    //1. 이전에 사용했던 방법
    /*fun playWithPet(dog: Dog){ //2. 각 애완동물 종류에 따라 다형성을 갖고 오버로딩됨
        println("Enjoy with my dog")
    }
    fun playWithPet(cat: Cat){ //3. 고양이일 경우 이쪽 메소드로 실행한다
        println("Enjoy with my cat")
    }*/
    
    //2. 인터페이스 추가해서 사용하는 방법
    fun playWithPet(pet: Pet){  //인터페이스를 객체로 매개변수를 지정
        println("Enjoy with my ${pet.species}")
    }   
}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}