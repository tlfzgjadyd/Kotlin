package chap08.section2

/* 2:00~2:30
* < 배열 평탄화하기 >
* 배열 평탄화 : 다차원 배열을 단일 배열로 만드는것 
* 코틀린에서는 flatten()을 통해 평탄화가 가능하다
* */
fun main() {
    //1차원 배열을 각각 만든 후
    val numbers = arrayOf(1, 2, 3)
    val strs = arrayOf("one", "two", "three")
    
    //2차원 배열로 합친다
    val simpleArray = arrayOf(numbers, strs)
    simpleArray.forEach{println(it)} //이상태에선 출력할 경우 그 안에 배열 자체가 들어있기에 객체 시그니처가 출력됨

    //합친 배열.flatten()으로 평탄화하고 나면
    val flattenSimpleArray = simpleArray.flatten() //단일 배열로 변환하기
    println(flattenSimpleArray) //평탄화 후에 출력할 경우 2차원이 우리가 아는 실제 메모리처럼 1차원 배열로 펴져서 나온다
                                //다음행에 있어야할 문자열 배열이 이어져서 이런식으로 나옴 [1, 2, 3, one, two, three]
}