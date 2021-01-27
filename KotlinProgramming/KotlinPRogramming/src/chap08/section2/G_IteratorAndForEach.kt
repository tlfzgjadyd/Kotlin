package chap08.section2

/*11:00~11:30
* < 배열 순환법 >
* 1. for문
* 2. forEach() : 요소 개수만큼 지정한 구문을 반복 실행
* 3. forEachIndexed() : forEach와 같은데 차이점이 있다면 얘는 index까지 같이 출력함
* 4. iterator 사용하기
* 
* < iterator 사용하는 방법 >
* 1. 우선 배열로부터 반복자를 얻어내야됨
*       val iter: Iterator<Int> = arr.iterator()
*       위와 같이
*       val 반복자 변수명: Iterator<내부자료형> = 배열명.iterator()
*       이렇게 해서 반복자 변수명을 얻어내고 그것을 사용해서 돈다
* 
* 2. while문 돌리기
*       while(iter.hasNext(){
*       위와 같이 hasNext함수를 이용해서 아직 요소가 남아있다면 계속 돌려준다
* 
* 3. 다음 요소를 얻어가며 출력하기
*       while(~){
*           val e = iter.next()
*           print("$e")
*       }
*       위와 같이 while문 내부에 next함수를 이용하여 다음 요소를 얻은 후 그것을 사용한다
*       여기서는 val 다음요소명 = 반복자변수명.next()를 통해 다음 요소 e를 얻어낸 후
*       print("$e")를 통해 그것을 출력하고 있다
* 
* */

fun main() {
    val arr = arrayOf(1, 2, 3, 4)

    //2. forEach()에 의한 요소 순환
    arr.forEach{element -> print("$element ")}
    //3. forEachIndexed에 의한 요소 순환
    arr.forEachIndexed({i, e ->println("arr[$i]=$e")}) //이때 index는 i, 요소는 e다
    //4. iterator()를 사용한 요소 순환
    val iter: Iterator<Int> = arr.iterator()
    while(iter.hasNext()) { //hasNext는 배열에서 참조할 다음 요소가 있는지 확인
        val e = iter.next() //next는 다음 요소를 반환하는 메소드이다
        print("$e ")
    }
}