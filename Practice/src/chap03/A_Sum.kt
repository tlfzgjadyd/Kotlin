package chap03

fun main() {
    var sum = 0;
    var i = 0;
    while(i<100){
        sum = sum + i;
        i+=2;
    }
    println(sum);
}