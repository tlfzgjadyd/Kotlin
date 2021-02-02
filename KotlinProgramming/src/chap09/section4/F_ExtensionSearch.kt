package chap09.section4

/* < 컬렉션 확장함수 4. 필터(Filtering) 기능의 메소드 : 원하는 요소를 골라내는 기능 >
* < 요소 처리와 검색 >
* < 1. element 관련 메소드>
* element 관련 연산은 인덱스와 함께 해당 요소의 값을 반환한다
* 그렇기에 아래의 element 관련 메소드들은 모두 주어진 인덱스에 해당하는 요소를 반환하는 메소드들이다
* 하지만 인덱스 범위를 벗어났을때 대응 방식이 다름
* 1. elementAt()       : 인덱스에 해당하는 요소 반환, 인덱스 범위 벗어나면 IndexOutOfBoundsException 에러 발생
* 2. elementAtOrElse() : 인덱스에 해당하는 요소 반환, 인덱스 범위 벗어나도 식에 따라 결과 반환
* 3. elementAtOrNull() : 인덱스에 해당하는 요소 반환, 인덱스 범위 벗어나면 null반환
* => 특히 elementAt은 에러까지 내므로 더 조심해야됨
* 
* < 2. first, last 관련 메소드 >
* 1. first : 식에 일치하는 첫 요소 반환
* 2. last : 식에 일치하는 마지막 요소 반환
* 3. firstOfNull : 식에 일치하지 않는 경우 null반환
* 4. lastOfNull : 식에 일치하지 않는 경우 null 반환
* 
* < 3. indexOf 관련 메소드 >
* 1. indexOf : 주어진 요소에 일치하는 첫 인덱스 반환
* 2. indexOfFirst : 람다식에 일치하는 첫 요소의 인덱스 반환, 없을 경우 -1을 반환
* 3. lastIndexOf : 주어진 요소에 일치하는 가장 마지막 인덱스 반환
* 4. indexOfLast : 람다식에 일치하는 마지막 요소의 인덱스 반환, 없을 경우 01을 반환
* 
* < 4. single 관련 메소드 > 
* 1. single : 람다식에 일치하는 요소 하나 반환
* 2. singleOrNull : single과 기능 같은데 조건식에 일치하는 요소가 없거나 일치하는 요소가 1개 이상이면 null을 반환
*
* < 5. 탐색 관련 메소드 >
* 1. binarySearch : 요소에 대해 이진탐색 수행 후 요소에 해당하는 인덱스 반환
* 2. find : 조건식을 만족하는 첫 번째 검색된 요소 반환, 없으면 null
* */

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100), Pair("D", 200))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // < 1. element 관련 메소드>
    //1. elementAt() : 인덱스에 해당하는 요소 반환, 인덱스 범위 벗어나면 IndexOutOfBoundsException 에러 발생
    println("elementAt: "+ list.elementAt(1))

    //2. elementAtOrElse() : 인덱스에 해당하는 요소 반환, 인덱스 범위 벗어나도 식에 따라 결과 반환
    println("elementAtOrElse: "+ list.elementAtOrElse(10, {2*it}))
                                    //elementAtOrElse(10){2*it} 표현과 같다

    //3. elementAtOrNull() : 인덱스에 해당하는 요소 반환, 인덱스 범위 벗어나면 null반환
    println("elementAtOrNull: "+list.elementAtOrNull(10))

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // < 2. first, last 관련 메소드 >
    //1. first : 식에 일치하는 첫 요소 반환
    println("first: "+listPair.first{it.second==200})

    //2. last : 식에 일치하는 마지막 요소 반환
    println("last: "+listPair.last{it.second==200})

    //3. firstOfNull : 식에 일치하지 않는 경우 null반환
    println("firstOrNull: "+listPair.firstOrNull{it.first=="E"})
    
    //4. lastOfNull : 식에 일치하지 않는 경우 null 반환
    println("lastOrNull: "+listPair.lastOrNull{it.first=="E"})

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // < 3. indexOf 관련 메소드 >
    //1. indexOf : 주어진 요소에 일치하는 첫 인덱스 반환
    println("indexOf : "+list.indexOf(4))

    //2. indexOfFirst : 람다식에 일치하는 첫 요소의 인덱스 반환, 없을 경우 -1을 반환
    println("indexOfFirst : "+list.indexOfFirst({it%2==0}))

    //3. lastIndexOf : 주어진 요소에 일치하는 가장 마지막 인덱스 반환
    println("lastIndexOf : "+listRepeated.lastIndexOf(5))

    //4. indexOfLast : 람다식에 일치하는 마지막 요소의 인덱스 반환, 없을 경우 01을 반환
    println("indexOfLast : "+list.indexOfLast({it%2==0}))

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // < 4. single 관련 메소드 >
    //1. single : 람다식에 일치하는 요소 하나 반환
    println("single: "+listPair.single{it.second==100})

    //2. singleOrNull : single과 기능 같은데 조건식에 일치하는 요소가 없거나 일치하는 요소가 1개 이상이면 null을 반환
    println("singleOrNull : "+ listPair.singleOrNull{it.second==500})

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // < 5. 탐색 관련 메소드 >
    //1. binarySearch : 요소에 대해 이진탐색 수행 후 요소에 해당하는 인덱스 반환
    println("binarySearch : "+list.binarySearch(3)) //근데 이거 인자 생성되는거 보니까 {}로 표현식도 가능한듯

    //2. find : 조건식을 만족하는 첫 번째 검색된 요소 반환, 없으면 null
    println("find: "+list.find{it>3})

    ///////////////////////////////////////////////////////////////////////////////////////////////////
}