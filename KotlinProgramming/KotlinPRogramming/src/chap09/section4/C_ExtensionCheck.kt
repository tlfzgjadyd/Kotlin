package chap09.section4

/*
 < 요소의 검사 >
 확장메소드 여러가지를 살펴볼거다

 < 요소의 일치 여부 검사하기 >
 1. all : 컬렉션내의 모든 요소가 조건과 일치해야 true 반환
 2. any : 컬렉션 내의 요소들중 조건과 맞는게 최소 1개 이상일 경우 true 반환

 < 특정 요소의 포함 및 존재 여부 검사하기 >
 1. contains : (전달인자로 요소 1개 가능) 컬렉션 내에 전달인자로 받은 요소가 포함되어있으면 true 반환
 2. containsAll : (전달인자로 list등 여러개 가능) 컬렉션 내에 전달인자로 받은 요소들이 모두 포함되어 있으면 true 반환
 3. none : 컬렉션 내에 표현식에 해당하는 요소가 없으면 true 반환
 4. isEmpty : 컬렉션이 비어있으면 true 반환
 5. isNotEmpty : 컬렉션이 비어있지 않으면 true 반환
 */
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")
    //< 요소의 일치 여부 검사하기 >
    //1. all : 컬렉션내의 모든 요소가 조건과 일치해야 true 반환
    println(list.all{it<10})
    println(list.all{it%2==0})
    
    //2. any : 컬렉션 내의 요소들중 조건과 맞는게 최소 1개 이상일 경우 true 반환
    println(list.any{it%2==0})
    println(list.any{it>10})

    // < 특정 요소의 포함 및 존재 여부 검사하기 >
    //1. contains : 컬렉션 내에 전달인자로 받은 요소가 포함되어있으면 true 반환
    println("contains: "+list.contains(2))
    println(2 in list)
    println(map.contains(11))
    println(11 in map)

    //2. containsAll: 컬렉션 내에 전달인자로 받은 요소들이 모두 포함되어 있으면 true 반환
    println("containsAll: "+list.containsAll(listOf(1, 2, 3)))
    
    //3. none : 컬렉션 내에 표현식에 해당하는 요소가 없으면 true 반환
    println("none: "+ list.none{it>6}) //6이상은 없으므로 true 반환
    
    //4. isEmpty/isNotEmpty : 컬렉션이 비어있는지 아닌지 검사
    println(list.isEmpty())
    println(list.isNotEmpty())
}