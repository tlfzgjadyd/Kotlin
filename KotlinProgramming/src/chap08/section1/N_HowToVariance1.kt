package chap08.section1

/*< 가변성을 지정하는 2가지 방법 >
* 1. 선언 지점 변성 : 클래스 선언하면서 클래스 자체에 가변성을 지정하는 방식
*                   in/out 키워드 지정이 가능하다
*                   클래스 선언과 동시에 가변성을 지정하면 클래스 전체의 공변성을 지정하는게 돼서
*                   사용하는 곳에선 따로 지정해주지 않아도 돼서 편리하다
*
* 2. 스타 프로젝션 : 다음파일
* */

class Box3<T>(var item: T)

fun <T> printObj(box: Box3<out Animal>){
    val obj: Animal = box.item //item의 값을 얻음(get)
    println(obj)
}

fun <T> printObj2(box: Box3<out Animal>){
  //  box.item = Animal() //set하고싶은 경우 in이 지정돼야해서 에러
}