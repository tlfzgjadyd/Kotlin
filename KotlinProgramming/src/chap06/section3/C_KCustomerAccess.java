package chap06.section3;

/*코틀린에 있는 컴패니언 객체를 자바에서 사용하려고 하는 경우
* 코틀린측에는 @JvmStatic 애노테이션을 사용해야하지만
* 자바측에서는 그냥 평소처럼 갖다쓰면됨
*
* 그다음 JOB말인데 이 JOB는 코틀린측에서는 클래스 생성해서 할당받은 변수임
* 그 할당한 클래스 내에는 프로퍼티가 하나 있고 프로퍼티명은 title이다
* 이에 따라 자동으로 getter setter가 생성되었고
* 아래의 코드에서는 코틀린 클래스.변수명.setTitle("...") 등으로 그 클래스에 접근이 가능하다*/

public class C_KCustomerAccess {
    public static void main(String[] args) {
        //1. 코틀린 클래스의 컴패니언 객체에 접근 (const val)
        System.out.println(c_KCustomer.LEVEL);

        //2. 코틀린 클래스의 컴패니언 객체에 접근 (@JvmStatic)
        c_KCustomer.login(); //애노테이션을 사용할 때 접근 방법, 자바 정적변수를 코틀린에서 쓸때랑 똑같다
        c_KCustomer.Companion.login(); //위와 동일한 결과로 애노테이션을 사용하지 않을 때 접근 방법

        //3. 클래스를 할당받은 변수인 JOB에 접근하여 그 할당받은 클래스의 프로퍼티를 수정, 갖다쓰기 (@JvmField)
        //KJob에 대한 객체 생성 후 접근
        KJob kjob = c_KCustomer.JOB;
        System.out.println(kjob.getTitle());
        
        //KCustomer를 통한 접근
        c_KCustomer.JOB.setTitle("Accountant"); //c_Kustomer.JOB.setTitle을 통해 title 프로퍼티를 설정
        System.out.println(c_KCustomer.JOB.getTitle()); //가져다씀
    }
}
