package chap08.section3

/* < 코틀린에서 scanner 사용하기 >
* 자바에선 System.in 그냥 쓰면 됐던것과 달리
* 코틀린에서는 예약어인 in을 ``로 감싸야하는데 이때 ` 는 작은따옴표가 아니라 물결 옆에 있는 표시다
* 그리고 예약어라 감싼다는게 무슨뜻이냐면 이전에 out, in을 통해 제네릭 자료형을 제한했었잖아
* 그때처럼 다른곳에서 이미 쓰이고 있기 때문에 여기서는 다른 기능으로 사용하기 위해서 감싼다는 뜻이다
* 또한 scanner를 사용하기 위해 자바때처럼 import java.util.Scanner 임포트가 필요하다
 */
import java.util.*

fun main() {
    //books
    val booksName = arrayOf("java", "c", "c++", "kotlin", "c#", "html")
    val price = 200.00f
    val studentDiscount = .25f
    val teacherDiscount = .15f

    //Scanner 객체에 System.in이라는 InputStream을 넣어서 scanner에 저장
    //`in`으로 감싼 이유는 in이 예약어이기 때문이라는데
    //이때 작은따옴표가 아니라 물결옆에있는 ``를 이용해야됨
    //자바에서는 그냥 System.in하면 됐지만 말이다
    //또한 자바때와 같이 Scanner 사용하려면 import java.util.Scanner인점은 똑같음
    val scanner = Scanner(System.`in`)

    println("** 오리의 서점에 오신 걸 환영합니다. **")
    do{
        println(Arrays.toString(booksName))
        println("어떤 책을 원하시나요?")
        print("답변: ")
        //\n을 포함하는 한 줄을 읽고 \n을 버리고 남은 문자열 반환 및 할당
        val book = scanner.nextLine()

        if(booksName.contains(book.toLowerCase())){
            println("선택하신 책은 $book 입니다. \$200")
            println("학생과 선생님인 경우에 할인을 적용하고 있습니다." +
            "\n당신의 직업은 무엇인가요(student, teacher, etc)?")
            print("답변: ")
            val occupation = scanner.nextLine()

            when(occupation.toLowerCase()){
                "student" ->calculatePrice(price, studentDiscount)
                "teacher" -> calculatePrice(price, teacherDiscount)
                else -> println("할인을 적용할 수 없습니다. " +
                "\n 최종 가격은 \$200 입니다.")
            }
        }else if (book =="exit" || book == "q"){
            break
        }else {
            println("죄송합니다. $book 의 재고가 없습니다.") //$book과 이후 문자열은 띄어서 써야 에러 안남
        }
    }while(true)
}

private fun calculatePrice(orig: Float, x: Float): Unit{
    val result = orig - (orig *x)
    println("최종가격은 \$$result 입니다.")
}