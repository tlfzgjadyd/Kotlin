package chap09.section4

/* < 컬렉션 확장함수 4. 필터(Filtering) 기능의 메소드 : 원하는 요소를 골라내는 기능 >
* < 요소의 매핑 >
* .map()함수 : 매핑에 사용, 전달인자로 보낸 식을 모든 요소들에 적용한 후 새로운 컬렉션으로 만들어 반환한다
*              forEach와 비슷하지만 컬렉션을 안건드리기 때문에 훨씬 안전함
* < 여러가지 메소드 >
* 요소의 매핑과 관련된 여러가지 메소드들을 알아보겠다
* 1. map : 전달인자로 받은 식을 일괄적용해 만들어진 새로운 컬렉션 반환
* 2. mapIndexed : map과 기능은 같은데 index를 추가적으로 사용한다 (사용 예시는 아래에 있음)
* 3. mapNotNull : 컬렉션에 null이 있을 경우 null 제외하고 식 적용해 새로운 컬렉션 반환
* -----------------------
* 4. flatMap : 전달인자로 받은 식을 각 요소에 적용한 후 다시 합쳐서 새로운 컬렉션 반환
*               하는일은 map이랑 별 다를거 없어보이는데 전달인자로 넘기는 부분에서 차이가 나는듯
*               map은 그냥 일반 표현식인 반면 flatMap은 listOf식이 넘어간다
* ------------------------
* 5. groupBy : 주어진 함수를 적용했을때 나오는 결과별로 분류해서 map형태로 반환
*              odd, even 두종류로 결과가 나온다면 odd=[1, 3, 5], even = [2, 4, 6] 이런식으로 묶여서 나온다
* */

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNull = listOf(1, null, 3, null, 5, 6)

    //TODO...
    //1. map : 전달인자로 받은 식을 일괄적용해 만들어진 새로운 컬렉션 반환
    println(list.map{it*2})

    //2. mapIndexed : map과 기능은 같은데 index를 추가적으로 사용한다 (사용 예시는 아래에 있음)
    val mapIndexed = list.mapIndexed {index, it -> index * it }
    println(mapIndexed)

    //3. mapNotNull : 컬렉션에 null이 있을 경우 null 제외하고 식 적용해 새로운 컬렉션 반환
    println(listWithNull.mapNotNull{it?.times(2) })

    //--------------------------------------------------------------------
    //4. flatMap : 전달인자로 받은 식을 각 요소에 적용한 후 다시 합쳐서 새로운 컬렉션 반환
    //              하는일은 map이랑 별 다를거 없어보이는데 전달인자로 넘기는 부분에서 차이가 나는듯
    //              map은 그냥 일반 표현식인 반면 flatMap은 listOf식이 넘어간다
    println(list.flatMap{listOf(it, 'A')})
    val result = listOf("abc", "12").flatMap{it.toList()}
    println(result)
    //--------------------------------------------------------------------
    //5. groupBy : 주어진 함수를 적용했을때 나오는 결과별로 분류해서 map형태로 반환
    //             odd, even 두종류로 결과가 나온다면 odd=[1, 3, 5], even = [2, 4, 6] 이런식으로 묶여서 나온다
    val grpMap = list.groupBy {if (it%2==0) "even" else "odd"}
    println(grpMap)
}