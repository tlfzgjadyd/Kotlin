package chap06

//자바 문제를 변형해서 코틀린으로 풀어볼거임
//근데 뭔가 생성자부터 객체생성 방식까지 다 달라서 만들때 헷갈린다
//이거 되게 생각보다 너무 많이다른데
//1단원부터 해야할듯
class A_MyPoint constructor (val x:Int, val y:Int){
    override fun equals(other: Any?): Boolean {
        if((other!=null)&&other is A_MyPoint)
        {
            if((this.x.equals(other.x))&&(this.y.equals(other.y)))
                return true;
            else
                return false
        };
        else
            return false;
    }
}

fun main() {
    val p: A_MyPoint = A_MyPoint(3, 50)
    val q: A_MyPoint = A_MyPoint(4, 50)
    println(p)
    if(p.equals(q))
        println("같은점")
    else
        println("다른점")
}