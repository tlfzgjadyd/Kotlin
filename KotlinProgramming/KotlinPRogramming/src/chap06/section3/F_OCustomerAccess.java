package chap06.section3;

/*자바에서 코틀린의 object 인스턴스에 접근하려면 INSTANCE를 사용한다
* 검색해봤는데 object로 만드는건 클래스가 맞음
* 결국 여기서 INSTANCE를 사용하는 방식은
* object클래스명.INSTANCE.메소드면() 이런식이란 것이다
*
* 왜 이런 방식으로 사용하냐면 역컴파일된 자바 코드 보면 object로 선언된 OCustomer 클래스는
* public static final OCustomer INSTANCE
* 즉 INSTANCE란 이름으로 생성되어 있기 때문이다
* 그래서 OCustomer 클래스에 접근하기 위해 그 변수명인 INSTANCE에 접근해줘야 했던것* */

public class F_OCustomerAccess {
    public static void main(String[] args) {
        //코틀린의 object객체에 접근하기 위해 OCustomer과 getName 사이에 INSTANCE 사용
        String name = OCustomer.INSTANCE.getName();
        System.out.println(name);
    }
}
