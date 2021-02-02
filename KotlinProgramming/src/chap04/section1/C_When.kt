package chap04.section1

/* 조건이 많을때 when을 사용할 경우 코드를 간결하게 줄일 수 있다
   switch-case문과 똑같은 원리로 작동함
   차이점은 break는 필요 없다는것
   만약 break없이 흐르게 하던걸 하고싶으면
   0, 1->수행할 문장
   이런식으로 여러개의 조건을 한번에 처리할 수 있다
   when(변수){
     변수값1->수행할 문장
     변수값2->수행할 문당
     else ->수행할 문장
*/
import java.lang.Integer.parseInt

fun main() {

    val x=1

    //1. case 1개씩 거르기
    when(x){
        1->print("x==1")
        2->print("x==2")
        else -> {//블록 사용 가능
            print("x는 1, 2가 아닙니다.")
        }
    }

    //2. case 2개 묶어서 거르기
    when(x){
        0, 1->print("x==0 or x==1")
        else->print("기타")
    }

    //3. 한번에 여러숫자 거르기
    when(x){
        in 1..10->print("x는 1 이상 10 이하입니다.")
        !in 10..20->print("x는 10 이상 20 이하의 범위에 포함되지 않습니다.")
        else -> print("x는 어떤 범위에도 없습니다.")
    }

    //4. 자료형 변환한걸로 검사하기
    val s="1"
    when(x){
        parseInt(s)->print("일치함!")
        else ->print("기타")
    }

    //5. is 자료형과 함께 사용하기
    val str = "안녕하세요"
    val result = when(str){
        is String -> "문자열입니다."
        else ->false
    }
}