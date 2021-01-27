package chap08.section2

/*12:30~1:00
* < SortWith >
* sortWith 함수는 Comparator를 매개변수로 받는다
* Comparator는 자바 인터페이스로 이 내부에선 2개의 객체를 비교하는 compare를 구현해줘야됨
* 아래의 예제에선 p1, p2를 비교하여 1, 0, -1의 값을 반환하도록 구현했다
* 즉 직접 비교하는 코드를 구현하는 함수인것
*
* < CompareBy >
* forEach만 써서 출력해도 되지만
* 직전에 sortWith(compareBy로 정렬한 후에 forEach로 출력해보면 결과가 달라짐
* 당연하겠지 sortWith로 정렬을 바꿨으니까
* sortWith 전달인자로 위에선 Comparator를 줬지만 이번엔 compareBy 함수를 주는것이다
* 사용법은 다음과 같다
* 배열변수명.sortWith(compareBy({it.첫번째 기준}, {it.두번째 기준}))
* ex) products.sortWith(compareBy({it.name}, {it.price}))
* 여기서 첫번쨰 기준 비교했을때 같은 경우에만 두번째 기준으로 비교함
*
* < forEach 새로운 방식으로 쓰기 >
* 방금전에 분류할때도 sortBy에 it쓰니까 훨씬 간단해지는 등 it 사용한 예시가 있었지
* forEach도 맨날 돌 변수명 할당해주기 귀찮았는데 it 사용하니까 한번에 정리된다
* 사용법은 아래와 같다
* 배열변수명.forEach{ 작업할내용 쓰는데 각각의 요소는 it이라고 부른다 }
* ex)  products.forEach{println(it)}
* */

//data class Product(val name: String, val price: Double)//이전 파일에도 있어서 주석처리했음

fun main() {
    val products = arrayOf(
        Product("Snow Ball", 870.00), 
        Product("Smart Phone", 999.00),
        Product("Drone", 240.00),
        Product("Mouse", 333.55),
        Product("Keyboard", 125.99),
        Product("Monitor", 1500.99),
        Product("Tablet", 512.99))
    
    products.sortWith(//Comparator를 이용해 두 객체를 비교하여 p1이 크면 1, 같으면 0, 작으면 -1을 반환한다)
        Comparator<Product> {p1, p2->
            when{
                p1.price >p2.price ->1
                p1.price ==p2.price->0
                else -> -1

            }            
        }
    )
    println("< forEach만 사용해서 출력하기 >")
    products.forEach {println(it)} //여기서 forEach만 사용해도 되지만

    println("\n\n< sortWith compareBy 사용 후에 forEach 사용해서 출력하기 >")
    products.sortWith(compareBy({it.name}, {it.price})) //이렇게 compareBy를 사용해서 출력할수도 있다
    products.forEach{println(it)} //sortWith compareBy 첫번쨰 전달인자로 먼저 비교한 후 같을 경우에만 두번째 전달인자로 비교함

}