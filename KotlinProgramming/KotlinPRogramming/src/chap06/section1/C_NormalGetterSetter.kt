package chap06.section1

/*원래는 이 코드와 같이 getter setter를 직접 만들면 
  역컴파일시 생기는 getter setter과 겹치기 때문에 삭제할것이 권장됨
  하지만 지금은 실험을 위해 그냥 써보겠음
  아래는 일단 직접 작성하는 예시다
  
  보조필드에 대한 설명
  field란 키워드는 보조필드라고도 함
  field는 현재 getter setter 만들고 있는 이 변수를 가리키는데 만약
  field=value부분에 field 대신 변수명을 써서
   set(value){
     name=value 
   }이런식으로 해버리면
  자바로 변환될떄 name=value부분이 this.setName(value)로 바뀌어서
  set(value){
    this.setName(value)
  } 한거나 다름없는 셈이 된다
  그래서 서로 무한호출하다가 스택 꽉차서 스택 오버플로우 발생함
  그렇기에 변수명 밑에다 setter자리에는 반드시 field, value라는 키워드로 채워넣어야 하며
  안에 변수명 또 넣게 되면 스택 오버플로우가 발생함에 주의해야한다*/

class User3(_id: Int, _name: String, _age: Int){
    //프로퍼티
    val id: Int = _id
        get()=field
    
    var name: String =_name
        get()=field
        set(value){
            field=value //만약 여기서 name=value
        }
    var age: Int = _age
        get()=field
        set(value){
            field=value
        }
}

fun main() {
    val user1 = User3(1, "Kildong", 30)
    //user1.id=2 //val 프로퍼티는 값 변경 불가
    user1.age=35 //세터
    println("user1.age=${user1.age}") //게터
}