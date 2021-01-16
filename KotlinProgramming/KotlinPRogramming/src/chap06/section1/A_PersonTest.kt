package chap06.section1

/*자바에선 필드라고 부르지만 코틀린에선 프로퍼티라고 부른다
* 자바의 필드는 단순한 변수 선언 부분만 가지기에 직접 접근 메소드 getter setter들을 다 만들어줘야함
* 엄청나게 긴 라인으로 자바 코드를 작성해야함
*
* 하지만 코틀린에서는 class 클래스명 (프로퍼티들) 이렇게만 해놓으면 알아서 getter setter 만들어짐
* show Kotlin Bytecode로 역컴파일된거 열어보면 알아서 getter setter 생겨있는걸 확인할 수 있다
* 
* 이떄 val의 경우 수정 불가능한 유형이므로 getter만 만들어지고
* var의 경우 getter setter 둘 다 만들어진다
* */
class Person(var name: String, var age: Int)