package chap03

import kotlin.random.Random
fun main() {
    val arr1 = arrayOf<Int>(Random.nextInt(10)+1, Random.nextInt(10)+1, Random.nextInt(10)+1, Random.nextInt(10)+1)
    val arr2 = arrayOf<Int>(Random.nextInt(10)+1, Random.nextInt(10)+1, Random.nextInt(10)+1, Random.nextInt(10)+1)
    val arr3 = arrayOf<Int>(Random.nextInt(10)+1, Random.nextInt(10)+1, Random.nextInt(10)+1, Random.nextInt(10)+1)
    val arr4 = arrayOf<Int>(Random.nextInt(10)+1, Random.nextInt(10)+1, Random.nextInt(10)+1, Random.nextInt(10)+1)
    val arr2cha = arrayOf<Array<Int>>(arr1, arr2, arr3, arr4)
    for (i in arr2cha){
        for(j in i){
            print("${j}    ")
        }
       println()
    }
}