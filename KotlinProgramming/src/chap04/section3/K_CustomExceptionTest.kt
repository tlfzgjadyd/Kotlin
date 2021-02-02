package chap04.section3

/*특정 조건에서 예외를 인위적으로 throw하고 그 던져진 에러는 내가 만든 특정 예외처리 클래스에서 처리되도록 만들거임*/

class InvalidNameException(message: String) : Exception(message) //사용자 지정 예외 클래스

fun main() {
    var name = "Kildong123" //숫자가 포함된 이름

    try{
        validateName(name)
    }catch(e: InvalidNameException) { //숫자가 포함된 특정 예외처리
        println(e.message)
    }catch(e:Exception){ //그 외의 기타 예외 처리
        println(e.message)
    }
}

fun validateName(name: String){
    if(name.matches(Regex(".*\\d+.*"))){ //이름에 숫자가 포함되어 있을 경우 예외를 throw
        throw InvalidNameException("Your name : $name : contains numerals.") //이때 Regex 내부에는 정규표현식
    }
}