package chap04.section1

/*전달인자 없이 when을 사용하는 것도 가능하다
  이럴 경우 인자 제한 없이 표현식 구성 가능
 */
fun main() {
    print("Enter the score: ")
    var score = readLine()!!.toDouble()
    var grade: Char ='F'

    when{
        score >=90.0->grade='A' //인자 있는 when문과 다르게 조건식 구성 가능
        score in 80.0..89.9 ->grade = 'B'
        score in 70.0..79.9->grade='C'
        score <70.0->grade='F'
    }
    println("Score: $score, Grade: $grade")
}