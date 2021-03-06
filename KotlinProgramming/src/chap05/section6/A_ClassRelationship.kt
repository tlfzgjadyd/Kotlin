package chap05.section6

/*클래스간 관계에는 4가지 종류가 있음
  예시)
* 1. Doctor -연관-  Patient
*
* 2. Doctor 의존>   Patient
*
* 3. Pond  <집합    Duck
*      (has a 관계)
*
* 4. Car   <구성    Engine
*      (owns a 관계)
*
* 설명)
  1. 연관관계 Association; 2개의 서로 분리된 클래스가 연결을 가지는 것으로
     (실선)               단방향, 양방향 연결이 가능하고
                         두 요소가 서로 다른 생명주기를 가진다

                         < 증거 찾아내기 >
                        1. 객체 2개가 서로 따로 생성됨
                        2. 둘이 뭔가 상호작용을 한다

-------------------------------------------------------------------------------
  2. 의존관계 Dependency: 한 클래스가 다른 클래스에 의존되어 영향주는 경우로
     (점선)              예를들어 Doctor 클래스를 생성하려명 Patient 클래스부터 필요한 경우 의존관계가 된다

                        < 증거 찾아내기 >
                        1. 한 클래스 생성시에 다른 클래스를 인자로 받는다
                        2. 포함관계는 아니다

-------------------------------------------------------------------------------
  3. 집합관계 Aggregation: 한 클래스가 다른 클래스를 소유하는 것으로
     (하얀 다이아몬드)      연못이 오리를 소유하는 것을 예로 들 수 있다

                        < 증거 찾아내기 >
                        1. 객체 2개는 서로 따로 생성되며
                        2. 두 객체의 생명주기는 다름
                        3. 포함관계다

-------------------------------------------------------------------------------
  4. 구성관계 Composition: 한 클래스가 다른 클래스의 일부가 되는 것으로
     (검은 다이아몬드)      구성품이 되는 클래스는 생명주기가 소유자 클래스에 의존되어 있기에
                          전체클래스 삭제시 구성품 클래스도 같이 삭제된다
                          Car클래스와 Engine클래스를 예로 들 수 있다

                        < 증거 찾아내기 >
                        1. 객체 2개가 같이 생성되며
                        2. 두 객체의 생명주기가 같아 전체클래스 삭제시 부품클래스는 같이 삭제됨
                        3. 포함관계다
-------------------------------------------------------------------------------
   판별법)
   클래스의 참조 유지----N----> [ 2. 의존 (Dependency) ]
        |
        Y
        |
   포함관계이다------N---->  [ 1. 연관 (Association) ]
        |
        N
        |
   클래스의 생명주기 유지----N----> [ 4. 구성(Composition) ]
        |
        Y
        |
   [ 3. 집합 (Aggregation) ]
-------------------------------------------------------------------------------
   두 객체간의 메시지 전달은 주로 시퀀스 다이어그램으로 표현된다

* */

class A_ClassRelationship {
    
}