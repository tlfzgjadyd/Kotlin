package chap03
//2차원 배열 만들기가..매우..귀찮다..
fun main() {
    val arr1:Array<Int> = arrayOf<Int>(1)
    val arr2:Array<Int> = arrayOf<Int>(1, 2, 3)
    val arr3:Array<Int> = arrayOf<Int>(1)
    val arr4:Array<Int> = arrayOf<Int>(1, 2, 3, 4)
    val arr5:Array<Int> = arrayOf<Int>(1, 2)

    val arr:Array<Array<Int>> = arrayOf<Array<Int>>(arr1, arr2, arr3, arr4, arr5)
    for (i in arr){ //in으로 0..배열길이 하기엔 식이 복잡해진다 생각했는데 그냥 배열명으로 가능
        for(j in i)
            print("${j} ")//arr[i][j]가 아니라 그냥 j인 이유는 iterator in 배열명 하면
        println()         //그 배열 내의 index를 도는게 아니라 원소 자체를 돌기 때문에
                          //이미 j 자체가 arr[i][j]인 셈이다
    }
}