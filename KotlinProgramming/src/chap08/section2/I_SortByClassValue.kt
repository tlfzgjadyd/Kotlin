package chap08.section2

/*12:00~12:30
* < SortBy로 데이터 클래스 정렬하기 >
* 이번에는 sortBy로 데이터 클래스 내부의 멤버를 기준으로 정렬해볼거다
* 이전에 살퍄봤던 sortBy사용법은 이런식이라
* 배열변수명.sortBy { 정렬할때 붙일이름 -> 정렬할때 붙인이름.정렬기준 }
* 실제론 이런식으로 사용됐었는데
* items.sortBy{ item -> item.length }
* 아래의 예제에서와 같이 it을 부여해버리면 별도의 변수명 줄 필요 없이 한방에 가능한듯
* sortBy{it.정렬기준}
* 클래스에만 먹히는거인줄 알았는데 이전파일에 추가실험 해보니까
* 그냥 문자열로만 이뤄진 배열에도 먹히더라
*
* < sortBy 사용법 >
* 1. 배열변수명.sortBy { 정렬할때 붙일이름 -> 정렬할때 붙인이름.정렬기준 }
* 2. 배열변수명.sortBy{ it.정렬기준 }
* =>둘다 클래스가 아니더라도 일반 문자열 배열이어도 사용 가능하다
* */

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf( //products라는 배열 내에는 Product 데이터 클래스 객체들이 여러개 들어있다
        Product("Snow Ball", 870.00), //그리고 각 Product 객체 내에는 name프로퍼티와 price 프로퍼티가 있음
        Product("Smart Phone", 999.00),
        Product("Drone", 240.00),
        Product("Mouse", 333.55),
        Product("Keyboard", 125.99),
        Product("Monitor", 1500.99),
        Product("Tablet", 512.99))
    products.sortBy {it.price} //sortBy 사용법 : 배열변수명.sortBy { 정렬할때 붙일이름 -> 정렬할때 붙인이름.정렬기준 }
    products.forEach {println(it)} //근데 it.price라고 해도 간단하게 해결 가능한가봄
}