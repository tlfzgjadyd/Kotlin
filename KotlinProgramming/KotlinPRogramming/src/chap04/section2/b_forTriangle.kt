package chap04.section2

fun main() {
    print("Enter the lines: ")
    val n = readLine()!!.toInt() //콘솔 입력 및 변환

    for(line in 1..n){
        for (space in 1..(n - line)) print(" ") //공백 출력, space는 i대신 썼을뿐
        for (star in 1..(2*line-1)) print("*") //별표 출력, star는 j대신 썼을뿐
        println() //개행
    }
}