package chap03.section3

fun main() {
    //매개변수 없는 람다식
    noParam({"Hello World!"}) //람다식 특유의 ->화살표->가 없는 상태이지만 그건 매개변수가 없어서 그런거고 {}만으로도 람다식됨
    noParam{"Hello World!"}//매개변수로 넘기는 람다식이 1개뿐이므로 ()를 생략해도됨 여러개면 쉼표 구분떄문에 ()필요함

    //매개변수가 1개 있는 람다식
    oneParam({a->"Hello World! $a"})//->만 잘 써주면 ()를 생략해도됨
    oneParam{a->"Hello World! $a"}
    oneParam{"Hello World! $it"}//화살표 표기를 생략하고싶을때 매개변수가 1개인 경우 $it으로 대체 가능
    
    //매개변수가 2개 있는 람다식
    moreParam { a,b->"Hello World! $a $b"} //이때는it으로 대체 불가능하고 매개변수 2개인데도 ()괄호 안친게 신기
    moreParam { _,b->"Hello World! $b"} //특정 매개변수는 안쓸 예정이면 _로 생략해도됨

    //다른 일반 인자들과 함께 람다 인자 사용하기
    withArgs("Arg1", "Arg2", { a,b->"Hello World! $a $b"})
    //이때 람다인자가 마지막 인자라면 이렇게 분리할수도 있다
    withArgs("Arg1", "Arg2"){ a,b->"Hello World! $a $b"} //두 분리된것들 사이에는 쉼표 없는게 포인트임 무슨 함수처럼 생겼네
}

fun noParam(out: ()->String) = println(out())

fun oneParam(out: (String)->String) { //매개변수가 1개 있는 람다식을 out이라는 인자로 받음
    println(out("OneParam"))
}

fun moreParam(out:(String, String)->String){
    println(out("OneParam", "TwoParam"))
}

fun withArgs(a:String, b:String, out:(String, String)->String){
    println(out(a,b))
}