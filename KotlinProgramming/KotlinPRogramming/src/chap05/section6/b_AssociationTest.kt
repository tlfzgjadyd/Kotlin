package chap05.section6

/*   1. 연관관계 Association; 2개의 서로 분리된 클래스가 연결을 가지는 것으로
     (실선)               단방향, 양방향 연결이 가능하고
                         두 요소가 서로 다른 생명주기를 가진다

     < 증거 찾아내기 >
     1. 객체 2개가 서로 따로 생성됨
     2. 둘이 뭔가 상호작용을 한다
* */
class Patient(val name: String){
    fun doctorList(d:Doctor){//인잘 참조
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String){
    fun patientList(p: Patient){ //인자로 참조
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main() {
    val doc1=Doctor("KimSabu")//객체가 따로 생성됨
    val patient1 = Patient("Kildong")//객체가 따로 생성됨
    doc1.patientList(patient1) //둘이 뭔가 상호작용을 한다
    patient1.doctorList(doc1)
}