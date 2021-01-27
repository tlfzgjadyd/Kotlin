package chap08.section3

/* < 리터럴 문자열 >
    탈출문자 (escape character)를 사용할 수 있다
    다 아는것들임
    
    탈출문자 활용해서 유니코드를 사용할 수도 있는데 \u_ _ _ _ 이런식으로 사용하면됨
    저 \u_ _ _ _ 한개당 한문자씩 가리키게 되던데 아마 내가 쓸일은 없을것같긴함

    < 원본을 그대로 개행까지 살리기 >
    3중따옴표(큰따옴표 * 3개)""" 를 사용하면 탈출문자로 개행\n 안해줘도 원본문자열 그대로 개행 보존 가능하다

    < trimMargin() >
    3중 따옴표 사용했을때 trimMargin()를 사용하면 특정 문자(| : 파이프기호가 특정문자로 사용됨) 기준으로 공백 제거도 가능함
    기본적으론 파이프 기호가 특정문자로 사용되지만 만약 trimMargin("-")등으로 전달인자를 주면 특정문자 변경도 가능하다
 */
fun main() {
    //1. 3중따옴표 그냥 사용하기
    val text1 = """
        Tell me and I forget.
        Teach me and I remember
        Involve me and I learn
        (Benjamin Franklin)
    """
    println("1. 3중따옴표 그냥 사용하기 : "+text1)

    //2. trimMargin과 특정문자(파이프기호 | ) 기준으로 공백 제거하기
    val text2 = """
       | Tell me and I forget.
       | Teach me and I remember
       | Involve me and I learn
       | (Benjamin Franklin)
    """.trimMargin()
    println("2. trimMargin과 특정문자(파이프기호 | ) 기준으로 공백 제거하기 : \n"+text2)

    //3. 특정문자 바꿔서 trimMargin 사용하기
    val text3 = """
       - Tell me and I forget.
       - Teach me and I remember
       - Involve me and I learn
       - (Benjamin Franklin)
    """.trimMargin("-")
    println("\n3. 특정문자 바꿔서 trimMargin 사용하기 : \n"+text3)
}