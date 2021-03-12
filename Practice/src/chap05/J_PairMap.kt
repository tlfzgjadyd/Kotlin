package chap05

//여기서 맵 사용법 참고 내가 책에서 맵 뒷부분 안했었나
abstract class PairMap{
    protected var map = mutableMapOf<String, String>() //이부분이 중요 맨처음에 타입 지정하려 했더니
    //mutableMap이건 hashMap이건 다 타입에러 나는거임
    //그래서 Map이 유일한 타입이고 mutable hash는 생성 함수란걸 알았음
    //근데 난 처음부터 mutable로 만들어야했기에 저렇게 쓰니까 비어있는 맵 알아서 생성됐다
    //var map = mutableMapOf<타입, 타입>()
    //괄호를 비워두면 됨
    //뭔가 여태까지 쓰던 일반 함수랑 똑같은데 괜히 다르게 생각해서 어려웠던듯
    //당연하게도 전달인자 비워둔 함수 호출하면 되는거였는데 말이야
    
    abstract fun get(key:String):String//key값을 가진 value 리턴, 없으면 null 리턴
    abstract fun put(key:String, value:String)//key와 value를 쌍으로 저장, 기존 key
                                            //있으면 값을 수정
    abstract fun delete(key:String):String //key값 가진 아이템을 value와 함께 삭제,
                                            //삭제한 value의 값 리턴
    abstract fun length():Int //현재 저장된 아이템의 개수 리턴
}
class Dictionary(val num:Int):PairMap(){
    override fun get(key:String):String{
        if(map.contains(key))
        {
            return map.get(key)!!
        }
        else
            return "null"
    }//key값을 가진 value 리턴, 없으면 null 리턴
    override fun put(key:String, value:String){
        map.set(key, value)
    }//key와 value를 쌍으로 저장, 기존 key 있으면 값을 수정
    override fun delete(key:String):String{
        if(map.contains(key))
        {
            val value = map.get(key)
            map.remove(key)
            return value.toString()
        }
        else
            return "null"
    } //key값 가진 아이템을 value와 함께 삭제,삭제한 value의 값 리턴
    override fun length():Int{
        return map.size
    } //현재 저장된 아이템의 개수 리턴
}
fun main() {
    val dic = Dictionary(10)
    dic.put("황기태", "자바")
    dic.put("이재문", "파이선")
    dic.put("이재문", "C++") //이재문의 값을 C++로 수정
    println("이재문의 값은 ${dic.get("이재문")}")
    println("황기태의 값은 ${dic.get("황기태")}")
    dic.delete("황기태") //황기태 아이템 삭제
    println("황기태의 값은 ${dic.get("황기태")}") //삭제된 아이템 접근
}
