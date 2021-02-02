package chap07.section2

/*< 객체 디스트럭처링 >
* 객체 디스트럭처링 : 객체가 가진 프로퍼티들을 개별 변수로 분해하여 할당하는것
*
* < 디스트럭처링 일반 사용법 >
* val(name,email)=cus1하면 cus1의 프로퍼티 2개를 각각 name, email변수에 가져올 수 있다
*
* < 특정 프로퍼티 제외하고 가져오기 >
* 만약 특정 프로퍼티는 제외하고 가져오고 싶은 경우 언더스코어로 제외한다
* val(_,email)=cus1 하면 첫번째 프로퍼티는 제외하고 email 프로퍼티만 가져오게 된다
* myFunc()라는 함수가 Customer클래스 객체를 반환하는 경우에는 이런식으로 쓸 수 있다
* val(myName, myEmail)=myFunc()
*
* < componentN으로 개별적으로 프로퍼티 가져오기 >
* 만약 전체 가져오기에서 일부 제외하는거 말고
* 개별적으로 프로퍼티 하나씩 가져오고 싶을 경우 그때 componentN을 사용한다
* N에는 몇번째 프로퍼티인지 숫자를 가리키는게 오게됨
* val name2 = cus1.component1()하면 cus1의 첫번째 프로퍼티를 가져오게 되고
* val email2 = cus1.component2()하면 cus2의 두번째 프로퍼티를 가져오게 된다
* */

fun main() {
    val cus1=Customer("Sean", "sean@mail.com")
    
    val(name, email)=cus1 //cus1의 프로퍼티 2개를 각각 name, email 변수에 가져온다, 이때 name, email변수는 
    // 이 문장에서 선언이 같이 이뤄지기 때문에 따로 선언하면 안됨, 같은 이유로 이름 겹치는 변수 있어서도 안됨

    val(_,email2)=cus1//cus1의 첫번쨰 프로퍼티는 제외하고 두번째 프로퍼티만 email에 가져온다
    val(myName, myEmail)=myFunc() //myFunc함수가 Customer클래스인 객체를 반환하는 경우 이런식으로 사용 가능
    
    val name3=cus1.component1() //cus1의 첫번째 프로퍼티를 가져오게 되고
    val email3 = cus1.component2() //cus2의 두번째 프로퍼티를 가져오게 된다
}

fun myFunc():Customer{
    return Customer("Mickey", "mic@abc.com")
}