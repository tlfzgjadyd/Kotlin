package chap05.section6

/*   2. 의존관계 Dependency: 한 클래스가 다른 클래스에 의존되어 영향주는 경우로
     (점선)              예를들어 Doctor 클래스를 생성하려명 Patient 클래스부터 필요한 경우 의존관계가 된다

    < 증거 찾아내기 >
    1. 한 클래스 생성시에 다른 클래스를 인자로 받는다
    2. 포함관계는 아니다
* */
class Patient2(val name: String, var id: Int){
    fun doctorLIst(d: Doctor2){
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor2(val name: String, val p: Patient2){
    val customerId: Int = p.id

    fun patientList(){
        println("Doctor2: $name, Patient2: ${p.name}")
        println("Patient2 ID: $customerId")
    }
}

fun main() {
    val patient2 = Patient2("Kildong", 1234)
    val doc2 = Doctor2("KimSabu", patient2) //이전 예제와는 달리 이번 Doctor클래스는 생성시 patient객체를
    doc2.patientList()                            //전달인자로 받고 있다 그렇기에 patient객체 먼저 생겨야
}                                                 //doctor객체를 만들 수 있어 의존관계다