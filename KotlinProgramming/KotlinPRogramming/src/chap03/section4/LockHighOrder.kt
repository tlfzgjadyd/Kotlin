package chap03.section4

import java.util.concurrent.locks.ReentrantLock

var sharable=1 //공유가 필요한 공유 자원

fun main() {
    val reLock = ReentrantLock()

    //1,2,3 표현식이 모두 동일
    lock(reLock, {criticalFunc()}) //1
    lock(reLock) {criticalFunc()}  //2
    lock(reLock, ::criticalFunc)   //3

    println(sharable)
}

fun criticalFunc() {
    //공유 자원 접근 코드 사용
    sharable+=1
}

fun <T> lock(reLock: ReentrantLock, body: ()->T) : T{ //lock함수를 fun <T> lock()형태인 제네릭 함수로 설계하여
    reLock.lock()                                     //반환 자료형으로 모든 타입이 가능해진다
    try {
        return body() //이부분의 실행이 보호되어야한다 중첩이 일어나선 안되는 작업을 try안에 쓰고 그 전후로 lock을 걸고 해제
    }finally {
        reLock.unlock()
    }
}//즉 lock함수의 순서는 잠금->수행->잠금해제 이며
 //수행하는 작업이 길면 읽기 힘드니까 수행부분을 함수로 뺐음
 //이에따라 기본제공되는 ReentrantLock형 reLock 뿐만이 아니라 수행할 함수도 인자로 받게된다
 //같이 접근하게 되는 변수를 공유자원이라 부르고 try 내부의 보호되는 영역은 critical section 임계영역이라 부름