package chap07.section1

/*인터페이스의 위임에 대해 알아볼거다
* 앞에서 썼던것처럼 by로 위임 가능함*/

interface A {
    fun functionA(){}
}
interface B{
    fun functionB(){}
}

//1. 이렇게 전달인자로 받은 a,b 변수를 직접 이용해서 메소드 사용하는 방법이 있음
//  이 방식으론 인터페이스 메소드에 접근하기 위해선 a, b 변수를 통해서 .점표기법 써서 가야됨
class C(val a: A, val b: B){
    fun functionC(){
        a.functionA()
        b.functionB()
    }
}

//2. by 위임자를 사용해서 소스코드를 더 간략화하면 위의 클래스 C는 이렇게 바뀜
//   이럴 경우 .점표기법 및 변수들을 거치지 않고 바로 함수를 사용할 수 있게 된다
class DelegatedC(a: A, b: B): A by a, B by b { //각각 a와 b를 인터페이스 A, B에 위임한것이라는데
    fun functionC(){                            //내가 이전에 썼던거 보면 A를 상속받는 a를 왼쪽의
        functionA()                             //변수에 할당할 예정이었는데 왼쪽에 클래스가 와버렸네
        functionB()
    }
}