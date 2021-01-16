package chap04.section1

/*원래 주제는 등급 판별하기로 if else문 활용하기지만
  내쪽에서 메인은 readLine함수여서 예제를 편집했음
 */
fun main() {
    println("Enter the score:")
    val score = readLine()!!.toDouble()
    /* readLine() : 콘솔로부터 입력받음
       !!.: 단정기호, 단정기호는 null가능성이 있는 경우에도 잘 작동하게 해주지만
            실제 내용물이 null일 경우 NPE Null Pointer Error을 발생시켜준다
       즉 readLine까지만 했을 경우 단정기호는 굳이 필요 없었음
       그럼에도 toDouble을 사용한 이유는 사용자가 입력하는 값은 숫자처럼 보여도 실제론 문자열이기 때문
       그래서 "100.0"을 실제 숫자로 바꿔줘야하는데 만약 85a 이런식으로 섞어서 입력했을 경우
       제대로 변환하지 못하기 때문에 별도로 null을 검사하거나 단정기호를 통해 받을 수 있음012.0
     */

    println("score : $score")
}