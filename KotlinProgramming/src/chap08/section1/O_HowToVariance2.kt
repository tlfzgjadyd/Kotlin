package chap08.section1
/*< 가변성을 지정하는 2가지 방법 >
* 1. 선언 지점 변성 : 이전 파일
*
* 2. 스타 프로젝션 : Box<Int>같은 방식은 Int형만 담을 수 있는 반면 Box<*>는 모든 자료형을 담을 수 있다
*                   그렇기에 자료형이 결정되고 난 후에 그 자료형과 하위 자료형만 담을 수 있도록 제한할 수 있다
*                   이렇게 스타*를 동해 지정하는 방법을 스타 프로젝션이라고 한다
*  
* < in out과 * 의 주의사항 >
* in으로 정의된 형식 매개변수를 *로 받으면 in Nothing으로 간주하고
* out으로 정의된 형식 매개변수를 *로 받으면 out Any? 로 간주한다
* 따라서 * 사용 위치에 따라 메소드 호출이 제한될 수 있으며 이는 starTestFunc에서 확인할 수 있다
*
* < 자료형 프로젝션 정리하기 >
* 1. out 프로젝션 : (공변성, setter) 형식 매개변수는 세터를 통해 값을 설정하는 것이 제한된다
*                 ex) Box<out Cat>
* 2. in 프로젝션 : (반공변성, getter) 형식 매개변수는 게터를 통해 값을 읽거나 반환할 수 있다
*                 ex) Box<in Cat>
* 3. 스타 프로젝션 : 모든 인스턴스는 하위 형식이 될 수 있다, in과 out은 사용 방법에 따라 결정된다
*                 ex) Box<*>
* */
class InOutTest<in T, out U>(t: T, u: U){
    // val propT: T = t //전달인자 t는 in T 자료형으로 받아졌기 때문에 out 위치에 사용할 수 없어서 에러
    val propU: U = u //전달인자 u는 out U 자료형으로 받아졌기 때문에 out 위치에 사용할 수 있음
    
   // fun func1(u: U) //전달인자 u는 out U 자료형으로 받아졌기 때문에 in 위치에 사용할 수 없어서 에러
    fun func2(t: T){ //전달인자 t는 in T 자료형으로 받아졌기 때문에 T는 in 위치에 사용할 수 있음
        print(t)
    }
}

fun starTestFunc(v: InOutTest<*, *>){
    //v.func2(1) //in으로 정의된 형식 매개변수를 *로 받으면 in Nothing으로 간주하기에 Nothing으로 인자를 처리해서 에러
    print(v.propU)
}