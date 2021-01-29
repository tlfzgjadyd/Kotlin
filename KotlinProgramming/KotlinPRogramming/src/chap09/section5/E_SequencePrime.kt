package chap09.section5

/*< 시퀀스를 이용한 소수 >
* Pair를 사용해서 소수를 구현해볼거다
* 근데 이번에도 시퀀스에 사용한 방식이 다름
* 시드에 또다시 generateSequence를 한번 더 넣었음
* Pair라서 그런게 아니라 Pair의 타입이 <Int, Sequence<Int>>이기 때문이다
* 그래서  2 to generateSequence(3)을 시드로 전달한것
* */

fun main() {
    val primes = generateSequence(2 to generateSequence(3) {it+2}){
        val currSeq = it.second.iterator()
        val nextPrime = currSeq.next()
        nextPrime to currSeq.asSequence().filter{ it%nextPrime !=0 }
    }.map{it.first}
    println(primes.take(10).toList())
}