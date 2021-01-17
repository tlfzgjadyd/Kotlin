package chap07.section1

class CoffeeMaker(val coffeeModule: CoffeeModule) {
    fun brew(){ //<<3. 그럼 이 함수 본문이 실행됨>>
        val theSiphon: Thermosiphon = coffeeModule.getThermosiphon()//<<4. 열사이판방식으로 객체 생성 >>
        theSiphon.on() //<<5. 열사이판 켠다 >>
        theSiphon.pump()//<<6. 열사이판 펌프질 시작 >>
        println("Coffee, here! Enjoy!~") //<<7. 커피 완성됐으니 안내문구 >>
        theSiphon.off()//<<8. 열사이판 끈다 >>
    }
}

fun main() {
    val coffeeMaker = CoffeeMaker(MyDripCoffeeModule()) //<<1.커피제조기에 드립커피모듈 껴서 준비함>>
    coffeeMaker.brew() //<<2. 내린다>>
}