package chap04

class ArrayUtil{
    companion object{ //코틀린에선 자바의 static 대신 컴패니언 객체를 사용한다
        fun concat(array1:Array<Int>, array2:Array<Int>): Array<Int?>{
            val array3=arrayOfNulls<Int>(array1.size+array2.size)
            for(i in 0..array1.size-1){
                    array3[i]=array1[i]
            }
            for(i in 0..array2.size-1){
                array3[i+array1.size]=array2[i]
            }
                return array3
        }
        fun print(array:Array<Int?>){
            for(i in array){
                print("${i} ")
            }
        }
    }
}
fun main() {
    val array1 = arrayOf(1, 5, 7, 9)
    val array2 = arrayOf(3, 6, -1, 100, 77)
    val array3 = ArrayUtil.concat(array1, array2)
    ArrayUtil.print(array3)
}