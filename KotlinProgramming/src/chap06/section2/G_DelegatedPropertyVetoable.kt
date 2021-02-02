package chap06.section2

/* 아래는 vetoable() 함수 예제이다 
   vetoable()함수는 변수에 조건을 걸어서 특정 조건에 해당할 경우에만 값을 바꿔주는 열할을 한다
   이 함수는 컬렉션같은 큰 데이터를 다룰때 특히 유용함
   observable()과 다른점은 원하는 조건에 맞지 않을 경우 값을 변경하지 않을 권한이 있다는 점이다
  (import로 Delegates를 가져와야함에 주의)
 */

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0){ //1. 초기값은 0
        prop, old, new->
            new>old //2. 조건에 맞지 않으면 거부권 행사
     }
    
    println(max) //0
    max=10
    println(max) //10
    
    //여기서는 기존값이 새 값보다 크므로 false라 5를 재할당하지 않음
}