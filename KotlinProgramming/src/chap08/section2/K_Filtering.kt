package chap08.section2

/* 1:00~1:30
* < 배열 필터링하기 >
* filter() 메소드를 통해 원하는 데이터만 골라낼 수 있음
* 배열변수명.filter{부여이름->부여이름과 조건 }
* 아래 예제에서는 바로 이어서 forEach도 사용하고 있음
*
* < 필터링 사용방식 >
* 1. 배열변수명.filter{부여이름->부여이름과 조건 }
* ex) arr.filter{e->e>0}
*
* 2. 배열변수명.filter{it.조건함수()}
* ex) fruits.filter{it.startsWith("a")}
*
* 3. 메소드 체이닝
* 여러 함수들 연달아서 사용하는 방식을 메소드 체이닝이라함 아래에서 실습해볼거임
* 디버깅은 어려워지지만 코드가 간결해져서 읽기 쉽다
* */

fun main() {
    //1. 일반 filter를 사용해서 0보다 큰 수 골라내기
    val arr = arrayOf(1, -2, 3, 4, -5, 0)
    arr.filter{e->e>0}.forEach {e->print("$e ")} //1 3 4 출력
    println()

    //2. filter에 조건함수 사용하는 방식
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")
    fruits.filter{it.startsWith("a")}.forEach{println(it)}
    println()

    //3. 메소드 체이닝 : filter에 연달아 sortBy, map 사용해보기
    val fruits2=arrayOf("banana", "avocado", "apple", "kiwi")
    fruits.filter{ it.startsWith("a")} //a로 시작하는것만 뽑았으니 avocado, apple만 남겟지
        .sortedBy{it} //별도로 desc 들어간 말이 없으니 알아서 오름차순 정렬되겠지
        .map{it.toUpperCase() }//컬렉션의 일종인 map을 사용해서 전부 대문자로 변경한걸 받았음
        .forEach { println(it) }
    println()
}