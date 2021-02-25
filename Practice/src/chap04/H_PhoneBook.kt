package chap04

import java.util.Scanner
class Phone(var name:String?, var tel:String?){

}
class PhoneBook(var book:Array<Phone?>){
    fun input(sc:Scanner){
        var name="";
        var tel="";
        for(i in 0..book.size-1)
        {
            print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>")
            name=sc.next() //여기서 book[i]?.name=sc.next()하니까 저장이 안됐다
                     //지난 예제 +이번 예제에서 알 수 있는건 null포함 클래스를
            tel=sc.next()  //전달인자로 받아 생성한 관리자 클래스의 경우
            book[i]=Phone(name, tel) //값 지정할때 새 객체를 생성해야한다는 것이다
        }
        println("저장되었습니다...")
    }
    fun find(sc:Scanner){
        while(true) {
            sc.nextLine()
            print("검색할 이름>>")
            val searchName = sc.next()
            if (searchName == "그만")
                System.exit(0) //정상종료 시키는건 자바랑 똑같음
            var index = -1;
            for (i in 0..book.size - 1) {
                if (book[i]?.name == searchName)
                    index = i;
            }
            if (index == -1)
                println("${searchName} 이 없습니다.")
            else
                println("${searchName}의 번호는 ${book[index]?.tel} 입니다.")
        }
    }
}
fun main() {
    val sc = Scanner (System.`in`)
    print("인원수>>")
    val num = sc.nextInt()
    sc.nextLine();
    val p = arrayOfNulls<Phone?>(num)
    val pb = PhoneBook(p)
    pb.input(sc)
    pb.find(sc)

    print("검색할 이름")
}