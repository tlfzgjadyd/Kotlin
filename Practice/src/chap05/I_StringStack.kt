package chap05

import java.util.Scanner
interface Stack{
    fun length():Int//현재 스택에 저장된 개수 리턴
    fun capacity():Int//스택의 전체 저장 가능한 개수 리턴
    fun pop():String//스택의 톱(top)에 실수 저장
    fun push(str:String):Boolean//스택의 톱(top)에 저장된 실수 리턴
}

class StackApp(): Stack {
    val sc = Scanner (System.`in`)
    var len:Int=0
    var cap:Int=0
    lateinit var arr:Array<String?>

    fun run(){
        print("총 스택 저장 공간의 크기 입력 >> ")
        cap=sc.nextInt()
        arr= arrayOfNulls<String>(cap)
        while(true)
        {
            print("문자열 입력 >> ")
            val content = sc.next()
            sc.nextLine()
            if(content=="그만")
            {
                print("스택에 저장된 모든 문자열 팝 : ")
                for(i in len-1 downTo 0)
                    print("${arr[i]} ")
                System.exit(0)
            }
            push(content)
        }
    }
    override fun length():Int{
        return len
    }//현재 스택에 저장된 개수 리턴
    override fun capacity():Int{
        return cap
    }//스택의 전체 저장 가능한 개수 리턴
    override fun pop():String{
        val temp = arr[len-1]
        arr[len-1]=""
        len--
        return temp!!
    }//스택의 톱(top)에 저장된 실수 리턴
    override fun push(str:String):Boolean{
        if(len<cap)
        {
            arr[len]=str
            len++
            return true
        }
        else
        {
            println("스택이 꽉 차서 푸시 불가!")
            return false
        }
    }//스택의 톱(top)에 실수 저장
}

fun main() {
    val sa = StackApp()
    sa.run()
}