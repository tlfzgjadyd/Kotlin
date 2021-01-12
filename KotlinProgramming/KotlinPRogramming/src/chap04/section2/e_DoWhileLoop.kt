package chap04.section2

/*최소 한번은 실행되는게 보장돼야할 때 사용*/

fun main() {
    do{
        print("Enter an integer: ")
        val input=readLine()!!.toInt()

        for (i in 0..(input-1)){
            for (j in 0..(input-1)) print((i+j) %input+1)
            println()
        }
    }while(input!=0)
}