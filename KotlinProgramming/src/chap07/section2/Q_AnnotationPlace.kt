package chap07.section2

/*이번엔 애노테이션 위치에 대해 알아볼거임
* 애노테이션이 들어갈 수 있는 모든 위치는 다음과 같다
* 1. 클래스명 앞
* 2. 메소드명 앞
* 3. 전달인자 각각의 앞
* 4. 리턴값 앞
* 5. 생성자 앞 (생성자에 애노테이션 쓸 경우 constructor 키워드 생략 불가
* 6. getter setter앞*/

@Fancy class MyClass{
    @Fancy fun myMethod(@Fancy myProperty: Int): Int{
        return(@Fancy 1)
    }
}

//class Foo1 @Fancy constructor(dependency: Int){;} //책에선 잘되는데 여기선 에러나더라

class Foo2{
    var x : Int? = null
    //@Fancy set  //여기도 에러남
}