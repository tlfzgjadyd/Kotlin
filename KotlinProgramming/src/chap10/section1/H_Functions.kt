package chap10.section1

/* < Functions >

[ 1. run() ]
2종류가 있음
- 인자 없는 익명함수처럼 동작하는 형태
- 객체에서 호출하는 형태

run함수와 apply함수의 차이점 : run함수도 객체를 this로 받아 변경 가능한점은 같지만
                            apply함수는 this 객체 반환하는 반면
                            run함수는 마지막 표현식을 반환한다 (마지막 표현식 없으면 Unit 반환됨)

[ 2. with() ]
1. with함수는 인자로 받는 객체를 이어지는 block의 receiver로 전달하며 결과값을 반환
2. 확장함수 형태가 아니라 단독으로 사용되는 함수이고
3. with는 세이프콜?. 지원하지 않기 때문에 let함수와 같이 사용하기도함
   근데 뭐 어짜피 null 아닌게 확실하면 with만 써도 상관없음
4. 기본적으로 Unit이 반환되지만 필요한 경우 마지막 표현식 반환 가능


with함수와 run함수의 차이점 : 기능은 거의 같은데
                           run함수는 receiver 없는 반면
                           with함수는 receiver로 전달할 객체 처리하므로 객체 위치 달라짐


[ 3. use() ]
1. 객체 사용된 후 닫아야하는 경우가 있는데 use() 사용시 close() 자동호출해줘서 따로 닫아주지 않아도됨
   오류 발생해도 close()호출해줌
2. Closable?로 block은 닫힐 수 있는 객체를 지정해야됨
   예를들면 파일객체가 대표적이다 사용 후에 닫아야하니까

[ 4. takeIf() & takeUnless() ]
takeIf : 람다식이 true면 결과 반환
takeUnless : 람다식이 false면 결과 반환
엘비스 연산자(?:) 사용해서 처리할수도 있음

[ 5. 시간측정 ]
앞에서는 시간측정함수 만들었었는데 표준 라이브러리에서도 제공됨
kotlin.system 패키지에 2종류의 함수가 있음
- measureTimeMillis
- measureNanoTime

측정하려는 코드를 measureTimeMillis 함수의 본문에 작성하면 측정시간 Long형으로 얻을 수 있음
함수의 성능 평가할때 유용하다

[ 6. 난수 생성하기 ]
난수 생성하려면 java.util.Random 사용할수도 있지만
이럴 경우 JVM에만 특화된 난수를 생성하기 때문에
코틀린에서는 멀티플랫폼에서도 사용 가능한 kotlin.random.Random 패키지 사용을 추천
사용방식은 이렇다
val number = Random.nextInt(100)//숫자는 난수 발생 범위
println(number)

이때 패키지는 random있는데도 또 점찍고 Random으로 import하니까
함수도 대문자로 Random 쓰는게 맞다고 외우면 됨
* */

import kotlin.random.Random;
fun main() {
    val num = Random.nextInt(100)
    println(num)
}