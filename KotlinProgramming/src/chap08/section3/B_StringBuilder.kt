package chap08.section3

/* < StringBuilder >
* String 작동원리에서 봤듯이 문자열 수정은 실제 수정이 아니라 새로 할당하는 방식임
* 그러나 StringBuilder를 사용할 경우 처음부터 공간 좀더 크게 잡고 그 남는 부분을 요소 변경에 사용하기에 문자열 변경이 진짜 변경에 의해 이뤄짐
* 
* < StringBuilder 단점 >
* 1. 기존 문자열 String보다는 처리속도가 느리다
* 2. 변경 없이 사용하게 될 경우 기껏 추가로 확보해둔 메모리를 사용하지 않는 것이 되어 메모리낭비
* => 그러므로 StringBuilder는 문자열이 자주 변경되는 경우에 사용하는게 좋다
* 
* < StringBuilder 관련 메소드들 >
* 1. 포함 append : append는 뒤에 붙이는걸로 +기호와 같은 기능을 하지만 버퍼를 사용하기에 +보다 좋은 방식이다
* 2. 추가 insert : append는 그냥 꼬리에 붙이는 것인 반면 insert는 특정 위치를 지정해서 가능하다 insert(10, "add content") 이런방식
* 3. 삭제 delete : delete역시 삭제할 위치를 지정해줘야됨, 어떤 인덱스부터 어떤 인덱스까지 삭제할건지 지정해준다 delete(5, 10)
*                  그리고 이때의 경우 5..10표현이 아니라 5, 10이기 때문에 다른 언어들에서처럼 끝인덱스는 포함되지 않는다
* */

fun main() {
    //StringBuilder 기본 사용법
    var s = StringBuilder("Hello")
    s[2]='x' //허용되지 않았던 요소의 변경이 가능함, 결과는 Hello->Hexio로 바뀜
             // 원본이 수정되는거라 s는 이후로도 Hexio인 상태다
    
    //StringBuilder 관련 메소드들 실험해보기
    s.append("World") //문자열이 추가되어 HexioWorld됨
    s.insert(10, "Added") //인덱스 10번부터 추가되어 HexioWorldAdded, 딱 10번자리부터 새로운 문자열이됨
    s.delete(5, 10) //인덱스 5번<=x< 인덱스 10번 전까지 삭제되어 HexioAdded
}