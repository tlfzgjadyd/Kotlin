package chap06.section3

/*다음을 보고 생성자에서 받은 인자(소문자 문자열)를 대문자로 변경한 다음 name 프로퍼티에 할당하는 세터를 작성해보세요
* class User(_name: String, _age: Int){
*   var name: String=_name
*       _______(value) {
*           println("The name was changed")
*           _________=value.toUpperCase()
*       }
*   var age: Int = _age
* }*/

 class User(_name: String, _age: Int){
       var name: String=_name
           set(value) {
                   println("The name was changed")
                   field=value.toUpperCase()
               }
       var age: Int = _age
 }
/* setter 설정하는 부분에 set(value) 해야하는데 setName(value)로 해서 틀렸었음
* */