package chap06.section3

/*< 최상위 함수(패키지 레벨 함수) >
* 일반적으로 클래스를 생성하고 그 안에 있는 메소드를 갖다쓰는 방식으로 메소드를 쓰는데
* 우리가 평소에 쓰던 일반 함수들의 경우 클래스 없이 만들어도 실행이 가능했다
* 이런 main밖에 정의하고 main에서 클래스 없이 갖다쓰는 함수들을 최상위 함수 또는 패키지 레벨 함수라고 한다
* 
* <최상위 함수의 구성 >
* 역컴파일로 자바로 변환된 코드를 열어보면 최상위 함수는 main 밑에 있어도 실행될 수 있도록 static으로 선언되어 있음을 확인할 수 있다
* */

fun packageLevelFunc(){
    println("Package-Level Function")
}

fun main() {
    packageLevelFunc()
}