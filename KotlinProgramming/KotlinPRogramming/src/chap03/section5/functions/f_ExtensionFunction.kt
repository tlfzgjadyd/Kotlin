package chap03.section5.functions

/* 기존 멤버 메소드는 아니지만 임의로 추가해서 확장하고 싶을 경우 확장함수를 통해 추가
   이것이 좋은 이유는 기존 라이브러리를 수정하지 않고도 확장이 가능하기 때문이며
   만약 확장하려는 대상에 이미 동일한 이름이 존재한다면 이미 존재하던걸 먼저 호출
   만약 코틀린에 있는 모든 클래스에 동일한 확장함수를 추가하고 싶을 경우 
   최상위 클래스인 Any에 확장함수를 구현하면 가능하다
 */
fun main() {
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

//String 클래스를 확장해 getLongString() 확장 함수 추가
fun String.getLongString(target:String): String =
    if (this.length>target.length )this else target //비교해서 this.length가 더 길면 this를 리턴
                                                    //target.length가 더 길면 target을 리턴
                                                    //즉 return이란 문구를 빼고 this else target만 쓴것