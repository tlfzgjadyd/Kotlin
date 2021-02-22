package chap04

class Tv(val company:String, val year:Int, val inch:Int){
    fun show(){
        println("${company}에서 만든 ${year}년형 ${inch}인치 Tv")
    }
}
fun main() {
    val myTV = Tv("LG", 2017, 32)
    myTV.show()
}