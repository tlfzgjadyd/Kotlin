package chap09.section4

/* < 컬렉션 확장함수 4. 필터(Filtering) 기능의 메소드 : 원하는 요소를 골라내는 기능 >
* < 요소의 필터와 추출 >
* < 특정 요소 골라내기 >
* 1. filter         : 조건식에 맞는 요소 골라내기
* 2. filterNot      : 조건식 이외의 요소 골라내기
* 3. filterNotNull  : null이 아닌것만 골라내기
* ------------------
* 4. filterIndexed   : 인덱스와 함께 추출하도록 할 수 있음, 이때 사용되는 idx는 index라는 의미다
* 5. filterIndexedTo : filterIndexed처럼 인덱스와 함께 추출 후 가변형 컬렉션 형태로 반환하는 기능이 추가되어있다
* ------------------
* 6. filterKeys      : key중에 11을 제외한 key 요소 추출
* 7. filterValues    : value중에 값이 Java인 value 요소 추출
* ------------------
* 8. filterIsInstance : 여러 자료형이 섞여있을때 원하는 자료형만 골라낸다
*
* < 특정 범위 잘라내기 >
* 1. slice : 전달인자로 받은 index 리스트에 해당하는 요소들을 반환
*
* < 특정 범위 반환하기 >
* 1. take       : 맨앞의 요소 2개 반환
* 2. takeLast   : 마지막쪽의 요소 2개 반환
* 3. takeWhile  : 조건식에 해당하는 요소 반환
*
* < 특정 요소 제외하기 >
* 1. drop           : 앞의 요소 3개 제외한 나머지를 반환
* 2. dropWhile      : 조건식에 해당하는 요소를 제외한 나머지를 반환
* 3. dropLastWhile  : dropWhile과 기능이 같은데 제외되는 순서가 달라서 의도한거랑 다르게 될때도 있었음
*
* < 각 요소의 반환 >
* 1. componentN     : N은 인덱스 번호가 아니라 요소 순서번호라 1번부터 시작함
* 사용 예시는 다음과 같다
* println("-> component1 : "+list.component1())//첫번째 요소인 1 반환
* println("-> component2 : "+list.component2())//두번째 요소인 2 반환
* println("-> component3 : "+list.component3())//세번째 요소인 3 반환
* println("-> component4 : "+list.component4())//네번째 요소인 4 반환
*
* < 합집합과 교집합 >
* 1. distinct   : 중복되는 요소는 하나로 취급해서 list 반환
* 2. intersect  : 전달인자로 받은 컬렉션과 list.으로 사용한 list를 비교하여 교집합이 되는 요소만 골라낸다
*
* */

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    //TODO...
    println("< 특정 요소 골라내기 >")
    println("1. filter : "+list.filter{it%2==0}) //조건식에 맞는 요소 골라내기
    
    println("\n2. filterNot : "+list.filterNot{it%2==0})  //조건식 이외의 요소 골라내기
    
    println("\n3. filterNotNull : "+list.filterNotNull())//null이 아닌것만 골라내기

    println("\n--------------------------------------")
    println("\n4. filterIndexed : "+list.filterIndexed{idx, value -> idx ==1 && value %2==0})
    //인덱스와 함께 추출하도록 할 수 있음, 이때 사용되는 idx는 index라는 의미다

    val mutList = 
        list.filterIndexedTo(mutableListOf()){idx, value->idx != 1 && value %2 ==0 }
    println("\n5.filterIndexedTo: $mutList")//filterIndexed처럼 인덱스와 함께 추출 후 가변형 컬렉션 형태로 반환하는 기능이 추가되어있다
     
    println("\n--------------------------------------")
    println("\n6. filterKeys: "+map.filterKeys{it!=11}) //key중에 11을 제외한 key 요소 추출
     
    println("\n7. filterValues: "+map.filterValues{it=="Java"}) //value중에 값이 Java인  value 요소 추출
     
    println("\n--------------------------------------")
    val listMixed = listOf(1, "Hello", 3, "World", 5, 'A')
    println("\n8. filterIsInstance: "+listMixed.filterIsInstance<String>())//여러 자료형이 섞여있을때 원하는 자료형만 골라낸다
    println("\n--------------------------------------")
     
    println("\n\n< 특정 범위 잘라내기 >")
    println("1. slice : "+ list.slice(listOf(0, 1, 2))) //전달인자로 받은 index 리스트에 해당하는 요소들을 반환
     
     
    println("\n\n< 특정 범위 반환하기 >")
    println("1. take : "+list.take(2))//맨앞의 요소 2개 반환
     
    println("\n2. takeLast : "+list.takeLast(2))//마지막쪽의 요소 2개 반환
     
    println("\n3. takeWhile : "+ list.takeWhile{it<3})//조건식에 해당하는 요소 반환
     
     
    println("\n\n< 특정 요소 제외하기 >")
    println("1. drop : " + list.drop(3)) //앞의 요소 3개 제외한 나머지를 반환
     
    println("\n2. dropWhile : " + list.dropWhile{it<3})//조건식에 해당하는 요소를 제외한 나머지를 반환
     
    println("\n3-1. dropLastWhile : "+list.dropLastWhile { it<3 })//dropWhile이랑 기능 똑같은듯하지만 뭔가는 다름
                                                        //이렇게 했을때 아무것도 제외되지 않은채 전부다 출력됨
    println("\n3-2. dropLastWhile : "+list.dropLastWhile { it>3 })
                                                        //반대로 이렇게 하면 잘 제외되는걸로 봐서 제외 순서 방향이 다른듯


    println("\n\n< 각 요소의 반환 >")
    println("1. componentN") //N은 인덱스 번호가 아니라 요소 순서번호라 1번부터 시작함
    println("-> component1 : "+list.component1())//첫번째 요소인 1 반환
    println("-> component2 : "+list.component2())//두번째 요소인 2 반환
    println("-> component3 : "+list.component3())//세번째 요소인 3 반환
    println("-> component4 : "+list.component4())//네번째 요소인 4 반환
     
     
    println("\n\n< 합집합과 교집합 >")
    println("1. distinct : "+listRepeated.distinct()) //중복되는 요소는 하나로 취급해서 list 반환

    println("\n2. intersect : "+list.intersect(listOf(5, 6, 7, 8)))
    //전달인자로 받은 컬렉션과 list.으로 사용한 list를 비교하여 교집합이 되는 요소만 골라낸다
     
     
}