package chap09.section1
/* < 가변형 mutableListOf() 함수 >
* 코틀린의 MutableList 인터페이스를 사용하는 헬퍼함수 mutableListOf()를 통해 List 편집 가능
* 이때 반환 자료형은 역시나 list형이 아니라 MutableList<T> 형이므로 받아주는 변수 역시 그래야됨
*
* < 사용법 >
* 1. 같은 자료형들로 넣어서 만들기
* 그냥 뭐 다른 리스트들이랑 생성 방법은 똑같네
* val 받아주는 변수명 : MutableList<T> = mutableListOf<T> ("데이터1", "데이터2", "데이터3")
*
* 2. 여러 자료형 혼합하기
* 여러 자료형을 혼합해서 사용하고 싶을 경우 별도로 <T>를 지정해주지 않고 생략해버리면 된다
* <T>를 생략하기에 받아주는 변수명에도 자료형 따로 표시하지 않는다
* val 받아주는변수명 = mutableListOf("데이터1", 숫자2, '문자x')
* ex) val mutableListMixed = mutableListOf("Android", "Apple", 5, 6, 'X')
* 
* < 편집하는 함수들 >
* 1. add("내용")
* 2. removeAt(index)
* 3. 컬렉션명[index]="편집할 내용"
* 이런식으로 가능하다
* */
fun main() {
    //가변형 List의 생성 및 추가, 삭제, 변경
    val mutableList: MutableList<String> = mutableListOf<String> ("Kildong", "Dooly", "Chelsu")
    mutableList.add("Ben") //추가
    mutableList.removeAt(1) //인덱스 1번 삭제
    mutableList[0] = "Sean" //인덱스 0번을 변경, set(index: Int, element: E)와 같은 역할
    println(mutableList)
    
    //자료형의 혼합
    val mutableListMixed = mutableListOf("Android", "Apple", 5, 6, 'X')
    println(mutableListMixed)
}