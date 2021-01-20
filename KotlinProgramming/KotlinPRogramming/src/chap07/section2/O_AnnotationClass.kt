package chap07.section2

/*< Annotation 애노테이션 클래스 >
* 애노테이션은 코드에 부가 정보를 추가, 런타임 사전처리에 쓰인다
* 예를들면 @Test는 유닛 테스트를 위해 사용하고
* @JvmStatic은 자바 코드에서 컴패니언 객체를 접근 가능하게 한다
* 
* 프레임워크 만드는거 아닌이상 애노테이션 클래스를 직접 만드는 경우는 드물고
* 대부분 프레임워크에서 제공하는 애노테이션을 사용함 
* 그래도 일단 만드는법 정도는 알려주겠다
* 
* < 애노테이션 클래스 사용법 >
* annotation class 애노테이션클래스명 이렇게 선언해놓고 밑에서
* @애노테이션클래스명  class 클래스명{} 이렇게 사용한다
* 
* < 애노테이션을 몇가지 속성으로 정의하기 >
* 만약 애노테이션 클래스를 직접 만들게 되는 경우 그 클래스 위에도 또 애노테이션을 붙여서 정보를 저장하게됨
* 그것들은 다음과 같다
* 1. @Target : 애노테이션이 지정되어 사용할 종류를 정의한다 (클래스, 함수, 프로퍼티등)
* 2. @Rentention : 애노테이션을 컴파일된 클래스 파일에 저장할건지 런타임에 반영할건지 겨렂ㅇ
* 3. @Repeatable : 애노테이션을 같은 요소에 여러번 사용하는걸 허용할지 결정
* 4. @MustBeDocumented : 애노테이션이 API의 일부분으로 문서화하기 위해 사용 (이문장은 뭔소리임대체 )
* 이렇게 있는것들을 써서 Fancy라는 애노테이션 클래스를 정의해보겠다
* */
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
        AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE) //애노테이션 처리방법중 하나인 SOURCE를 사용
                                        //SOURCE방식을 사용하면 컴파일타임에 애노테이션이 제거되어 클래스파일에 포함되지 않음
                                        //BINARY방식을 사용하면 클래스 파일에 포함되지만 리플렉션할때 나타나지 않는다
                                        //RUNTIME방식을 사용하면 클래스 파일에도 포함되고 리플렉션할떄도 나타난다
                                        //이때 리플렉션이란 프로그램의 특정 구조를 분석해내는 기법이다 (메타정보 출력같은것인듯)
                                        //이거 바로 다음 파일에서 리플렉션 실험 해볼거임
@MustBeDocumented
annotation class Fancy