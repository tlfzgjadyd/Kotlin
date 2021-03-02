package chap04

import java.util.Scanner
class Type(val rank: String, var arr:Array<String?>){//arrayOfNulls로 보내니까 ?로 타입 맞춰줬음
    fun reserve(sc:Scanner){
        show()
        print("이름>>")
        val name=sc.next()
        sc.nextLine() //위에서 sc.next()썼기에 버퍼한번 비워줌
        print("번호>>")
        val num=sc.nextInt()
        if(1<=num&&num<=10)
            arr[num-1]= "$name"//비교연산자가 계속 안먹힌 이유가 이거였음ㅠ 출력떄문에 빈칸 넣어서 저장했더니 공백때문에 다르게 인식된거지 출력해도 똑같은 내용이고
                                //그래서 공백 지워버리고 출력할때 스스로 공백 만들도록 바꿨다
        else
            println("없는 번호입니다")
    }
    fun cancel(sc:Scanner){
        show()
        print("이름>>")
        var name:String?=sc.next()//여기도 val로 돼있었음, 타입다르면 다르다 나오니까 String?로 맞춰줌
        sc.nextLine() //위에서 sc.next()썼기에 버퍼한번 비워줌
        var index:Int=-1
        for(i in 0..arr.size-1){
            if(arr[i]==name)
            {
                index=i
                break
            }
        }
        if (index==-1){
            println("없는 이름입니다")
        }
        else{
            arr[index]="---"
        }
    }
    fun show(){
        print("${rank}>> ")
        for(i in 0..arr.size-1){
            if(arr[i]==null)
                print("--- ")
            else
                print("${arr[i]} ")
        }
        println()
    }
}
class Reservation(){
    val sc = Scanner (System.`in`)
    var seats = arrayListOf(Type("S", arrayOfNulls<String>(10)),Type("B", arrayOfNulls<String>(10)), Type("A", arrayOfNulls<String>(10)))
    fun run(){
        println("명품콘서트홀 예약 시스템입니다.")
        var select=0
        while(true) {
            print("예약:1, 조회:2, 취소:3, 끝내기:4>>")
            select = sc.nextInt()
            when (select){
                1 -> {
                    print("좌석 구분 S(1), A(2), B(3)>>")
                    select=sc.nextInt()
                    if(1<=select&&select<=3)
                        seats[select-1].reserve(sc)
                    else
                        println("없는 번호입니다")
                }
                2 -> {
                    for(i in 2 downTo 0) //downTo 오랜만에 썼다 arrayOf 만드는 순서가 예상과 반대로 들어가버려서 이래야했음
                        seats[select-i].show()
                    println("<<<조회를 완료하였습니다.>>>")
                }
                3 -> {
                    print("좌석 구분 S(1), A(2), B(3)>>")
                    select=sc.nextInt()
                    if(1<=select&&select<=3)
                        seats[select-1].cancel(sc)
                    else
                        println("없는 번호입니다")
                }
                4 -> {
                    System.exit(0)
                }
                else -> {println("없는 메뉴입니다")}
            }
        }
    }
}
fun main() {
    val reservation = Reservation()
    reservation.run()

}