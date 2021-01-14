package chap06.section1

/* 이번엔 보조 프로퍼티에 대해 배울거임
* 만약 보조필드 field를 사용하지 않는 경우에는 임시로 사용할 프로퍼티 선언해놓고
* getter setter에서 사용하는 것이 가능하다
* 
* 아래 예제에서는 tempName이라는 보조 프로퍼티를 정의하고
* name의 getter에서 사용해볼거다
* 
* 이 보조 프로퍼티가 정확히 뭘 한단건진 잘 모르겠음
* 그냥 field 안쓰고 이렇게도 가능하다는데 정확히 어느부분 말하는건지 모르겠고 일단 알아두기만 한다*/

class User5(_id: Int, _name: String, _age: Int){
    val id: Int = _id
    private var tempName: String? =null //임시로 tempName이라는 변수를 선언
                                       // 임시로 쓸거라 다른곳에선 괜히 접근하지 못하게 private로 선언
    var name: String = _name
        get(){//name 변수의 getter 안에
            if(tempName==null) tempName="NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age: Int=_age
}