package chap07.section3

/*다음은 위임을 통해 메소드에 접근하는 코드다 빈칸을 참고하여 코드를 완성해봐라
* 제공되는 코드는 다음과 같음
* interface A{
*   fun functionA(){}
* }
* interface B{
*   fun functionB(){}
* }
* class DelegatedC(a: A, b: B): ___________________{
*   fun functionC(){
*       functionA()
*       functionB()
*   }
* }
* */

interface A{
    fun functionA(){}
}

interface B{
    fun functionB(){}
}
class DelegatedC(a: A, b: B): A, B{
        fun functionC(){
            functionA()
            functionB()
        }
}
//뭐야 걍 인터페이스 여러개 상속하는 문제였잖아 코딩안해놔도 됐겠네