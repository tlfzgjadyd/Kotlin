package chap07.section1

//Thermosiphon이란 커피 추출 방법중 하나로
//열사이펀 클래스는 펌프 인터페이스를 구현하고 히터인터페이스 위임받음
//그렇게 Heater by heater 위임을 통해 isHot에 바로 접근해서 사용하고 있다
class Thermosiphon(heater: Heater) : Pump, Heater by heater {//위임의 사용
    override fun pump(){
        if(isHot()){
            println("[Thermosiphon] pumping,,,");
        }
    }
    
}