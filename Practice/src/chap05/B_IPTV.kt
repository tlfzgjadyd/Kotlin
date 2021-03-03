package chap05

class IPTV(val ip:String, size:Int, color:Int) :ColorTv(size, color){
    override fun printProperty(){
        print("나의 IPTV는 ${ip} 주소의 ")
        super.printProperty()//전부다 오버라이딩하지 않고 겹치는 부분은 부모의 내용을 불러 해결해줬다
    }
}

fun main() {
    val iptv = IPTV("192.1.1.2", 32, 2048)
    iptv.printProperty()
}