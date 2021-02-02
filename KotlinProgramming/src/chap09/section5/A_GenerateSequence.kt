package chap09.section5

/*< 시퀀스 활용하기 >
* 시퀀스 : 요소 크기 나중에 정할 수 있는 특수한 컬렉션
*         처리중에는 계산하고 있지 않다가 toList()나 count()같은 최종 연산때에 크기 결정한다
* ex) 파일 줄단위로 읽어들일때 언제 끝날지 모르므로 사용
* 
* < generateSequence >
* : 특정 값 생성하기 위해 사용됨, Seed 전달인자 넘겨서 시작요소 값을 결정
*
* < 시퀀스 사용하기 >
* 1. 시퀀스 정의하기 
*   val 변수명 : Sequence<컬렉션에 담을자료형> = generateSequence(시작값){다음index는 어떻게 생성될지 식을 쓴다, it활용}
*
* 2. 원하는 개수만큼 획득하기
*   변수명.take(개수)
*
* 3. 생성된거 확인해보려면 
*   println(변수명.take(개수).toList()) //toList없이 인쇄하면 객체 시그니처만 나오므로 반드시 필요하다
*
* < 시퀀스 정의식 응용하기 >
* map이나 filter등을 섞어서 생성하도록 식을 짤수도 있다 아래의 예제에 있음
* 이때 메소드 연속해서 호출하는 메소드 체이닝 기법이 자주 쓰인다
* */

fun main() {
    //시드값 1을 시작으로 1씩 증가하는 시퀀스 정의
    val nums: Sequence<Int> = generateSequence(1) {it+1} //시드를 1로 넘겨서 1부터 시작한다, 어떤식으로 만들지 식만 정해둠

    //take()를 사용해 원하는 요소 개수만큼 획득하고 toList()를 사용해 List 컬렉션으로 반환
        println(nums.take(10).toList())//시퀀스식 정해둔거 할당한 nums변수에 take(생성할개수) 해서 생성하는데 
                                         //이때 별도로 .toList안해주고 그냥 print하면 객체 시그니처만 나온다

    //시퀀스 정의식 응용하기 : map
    val squares = generateSequence(1) {it+1}.map{it*it} //이때 {it+1.map{it*it}}처럼 한 {}안에 해버리면 타입에러 나므로 주의
    println(squares.take(10).toList())

    //시퀀스 정의식 응용하기 : filter
    val oddSquares = squares.filter{it%2!=0}
    println(oddSquares.take(5).toList())
}