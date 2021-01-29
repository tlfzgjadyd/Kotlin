package chap09.section5

/*< 요소 값 가져오기 >
* asSequence(): 중간 연산 결과 없이 한번에 끝까지 연산한 후 결과를 반환
*
* < 중간 연산 결과 >
* 중간 연산 결과가 뭐냐면 .map후에 .filter를 메소드 체이닝 해서 연산했다고 하자
* 그럼 .map 연산이 끝난 후에 .filter를 처리하기 때문에 .map과 .filter 사이에는 중간연산이 존재하게됨
* 
* < asSequence()체이닝 방식과 filter, map 메소드사용한 기본 체이닝 방식의 차이점 >
* filter, map 사용한 기본 체이닝 : 순차적 연산이라 시간이 많이 걸릴 수 있다
* asSequence() 체이닝 방식 : 병렬처리 되기 때문에 처리 성능이 좋음
* => 무슨 말인지는 아래 예제에 설명을 써놨음
*    결론은 asSequence를 사용하면 속도나 메모리 측면에서 성능이 좋아진다는 것이다
* 
* < 역컴파일된 위의 2가지 방식 살펴보기 >
* 저 2가지 방식은 역컴파일한 코드를 봐도 차이가 난다
* 기본적인 체이닝 방식을 사용한 코드는 while루프 2개 돌며 처리하는데
* asSequence 사용한 체이닝은 내부적으로 iterator를 공유하고 map을 하나의 요소로  변경해 filter 인자로 전달하기에
* 새로운 list 만들지 않은채로 처리하게 된다
* */

fun main() {
    //<1. filter, map을 통한 순차적 연산 >
    val list1 = listOf(1, 2, 3, 4, 5)
    val save1 = list1
        .map{println("map($it) "); it*it} //1
        .filter{println("filter($it) "); it%2==0}
    println(save1)
    /* 그냥 list에 이어서 map과 filter를 메소드 체이닝 했다
    * 이렇게 했을 경우 .map 처리가 끝난 후에 .filter를 처리한다
    * 그래서 .map과 .filter 사이에 중간연산 결과가 존재함
    * 그 중간결과가 나올 때마다 save1변수에 저장하게됨
    * */

    //<2. asSequence()를 통한 병렬적 연산 >
    val save2 = list1.asSequence()
        .map{ print("map($it) "); it*it }//(1번과정)
        .filter{ println("filter($it) "); it%2==0}//(2번과정)
        .toList()//(3번과정)
    println(save2)
    /*asSequence로 listSeq 변수에 할당한 후 바로 map, filter를 메소드 체이닝 했다
    * 이렇게 할 경우 (1번과정)과 (2번과정)만으로는 결과를 도출할 수 었다
    * (3번과정)까지 가서 최종 결과를 list 목록으로 반환할 때 모든 연산이 수행되고 새로운 리스트가 save변수에 할당되는것
    * */
}