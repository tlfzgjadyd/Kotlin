package chap03

fun main() {
    var count=0
    var num:Int
    for(i in 1..99){
        count=0
        num=i%10
        if(num==3||num==6||num==9)
            count++

        num=i/10
        if(num==3||num==6||num==9)
            count++

        if(count==1)
            println("${i} 박수 짝")
        else if(count==2)
            println("${i} 박수 짝짝")
    }
}