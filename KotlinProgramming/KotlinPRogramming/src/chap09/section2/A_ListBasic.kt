package chap09.section1
/* < List >
* List :  순서에 따라 정렬된 요소를 가지는 컬렉션
* 값을 바꿀 수 없는 불변형 List를 만들고 싶을 경우 : listOf()
* 값을 바꿀 수 있는 가변형 List를 만들고 싶은 경우 : mutableListOf()
* => 가변형으로 만들고 싶을 경우 앞에 mutable만 붙여주면 되는것을 확인할 수 있음
* 
* < 헬퍼 함수 >
* 헬퍼 함수 : List와 같은 컬렉션들은 직접 생성자 사용해서 생성하지 않고 다른 메소드들의 도움을 받아 생성한다
*           이때 사용되는 함수를 헬퍼 함수라고 한다
*
* < 비어있는 리스트 생성하기 >
*   val emptyList: List<String> = emptyList<String>() //emptyList<T>()함수를 사용한다
*
* < null제외하고 반환하여 새로운 리스트 생성하기 >
* 배열을 생성할때 null 포함된 정보를 주더라도 listOfNotNull함수를 사용하면 null빼고 배열이 만들어진다 
*  val nonNullsList: List<Int> = listOfNotNull(2, 45, 2, null, 5, null) 
*   println(nonNullsList)                                                        
*
* < vararg 사용하기 >
* 인자는 원하는 만큼 가변 인자를 가지도록 vararg로 선언 가능 ( var + arg )
* public fun <T> listOf(vararg elements: T): List<T>
* 이런식으로 전달인자 부분에 추가로 붙여서 사용되며 반환값은 List<T> 자료형이다
* 뭔소린지 모르겠지 저 반환값이 저런 형태니까 listOf 받아주는 변수는 List<Int> 이런식의 자료형이어야 한다는 뜻이다
* 아래의 예제를 보면 뭔소린지 바로 나옴
* 
* < 각 요소 순환하기 >
* for(이름부여 in 리스트명) {
*     내용
* }
* =>이런식으로 컬렉션 내부를 돌 수 있다
*
* < 컬렉션 내부에 index 사용해서 접근하고싶은 경우 >
* 컬렉션 내부에 index로 접근하는건 기본적으로 불가능하기에 for문에 다른 장치를 추가해줘야됨
* for(index in 리스트명.indices) { //이런식으로 리스트명.indices라고 키워드를 추가해야됨 index->indices
*     //이때 이름 부여하는 자리에 index라고 했기에 이후엔 index라는 이름으로 접근 가능, for문의 i같은 역할을 완벽하게 수행할 수 있게됨
*     println("fruits[$index] = ${fruits[index]}")
* }
*=> 이전에는 인덱스 접근은 불가능하기에 for문에서의 i와 같은 역할이라 하기엔 약했지만 이젠 array[index]같은 느낌으로 사용 가능하기에
*   for문의 i역할과 같아졌다고 할 수 있다
* 
* < while과 index를 사용해서 컬렉션 돌리기 >
* 이때 자바에서의 array.length같은 역할을 fruits.size라는 프로퍼티가 한다
*   var index = 0 //이때는 for의 이름부여 부분에 index에 하는게 아니라 따로 index 변수를 선언해서 시작한다
*   while(index<fruits.size){ //while을 사용해서 돌릴 경우 array.length하듯이 fruits.size를 통해 돌릴 수 있다
*       println("fruits[$index] = ${fruits[index]}")
*       index++
*   }
*/

fun main() {
    //불변형 List의 사용법
    println("\n < 불변형 List의 사용법 > ")
    println("""
         var numbers: List<Int> = listOf(1, 2, 3, 4, 5) 
         var names: List<String> = listOf("one", "two", "three") 
    """.trimIndent())
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5) //listOf를 통해 불변형 선언 가능, 받아주는 변수는 List<Int>형이다
    var names: List<String> = listOf("one", "two", "three") //반환값이 List<T>형이기 때문에 이번에는 List<String>으로 받아주고있음
    
    //비어있는 리스트 생성하기
    println("\n < 비어있는 리스트 생성하기 > ")
    println("val emptyList: List<String> = emptyList<String>()")
    val emptyList: List<String> = emptyList<String>() //emptyList<T>()함수를 사용한다

    //null제외하고 반환하여 새로운 리스트 생성하기
    println("\n < null제외하고 반환하여 새로운 리스트 생성하기 > ")
    println("""
            val nonNullsList: List<Int> = listOfNotNull(2, 45, 2, null, 5, null)
            println(nonNullsList)
    """.trimIndent())
    val nonNullsList: List<Int> = listOfNotNull(2, 45, 2, null, 5, null) //null이 포함된 데이터를 주더라도
    println(nonNullsList)                                   //listOfNotNull을 사용해서 만들었기에 null을 제외한채로 생성된다

    //각 요소 순환하기
    println("\n < 각 요소 순환하기 > ")
    for(name in names){ 
        println(name)
    }
    for (num in numbers) print(num) //한 줄에서 처리하기
    println() //내용이 없을 경우 개행

    //컬렉션 내부에 index 사용해서 접근하고싶은 경우
    println("\n < 컬렉션 내부에 index 사용해서 접근하고싶은 경우 > ")
    var fruits: List<String> = listOf("banana", "apple", "avocado", "orange")
    for(index in fruits.indices) { //이런식으로 리스트명.indices
        //이때 이름 부여하는 자리에 index라고 했기에 이후엔 index라는 이름으로 사용 가능
        println("fruits[$index] = ${fruits[index]}")
    }

    //컬렉션 index 응용하기
    println("\n < 컬렉션 index 응용하기 > ")
    for(index in fruits.indices) {
        if(index %2==0) println("fruits[$index] = ${fruits[index]}")
        //이런식으로 i%2==0 연산하듯이 index 연산이 가능하다
    }
    
    //컬렉션 while과 index 사용하기
    println("\n < 컬렉션 while과 index 사용하기 > ")
    var index = 0 //이때는 for의 이름부여 부분에 index에 하는게 아니라 따로 index 변수를 선언해서 시작한다
    while(index<fruits.size){ //while을 사용해서 돌릴 경우 array.length하듯이 fruits.size를 통해 돌릴 수 있다
        println("fruits[$index] = ${fruits[index]}")
        index++
    }
}