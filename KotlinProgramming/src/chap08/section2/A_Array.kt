package chap08.section2

/*< 1. 기본적인 배열 생성법 >
* 평소에는 별도의 import 없이 아래의 함수들 사용 가능함
* 배열을 다룰때 특정 함수 불러오기 위해서만 import 사용하며 그게 언제인지는 이후의 파일에 나올거임
* 1. arrayOf()
* 2. Array()
* 3. arrayOfNulls() : 비어있는 배열 선언
* 아래 예제에선 배열을 만들어볼거임
* 
* < 2. 2차원 배열 생성법 >
* 여러 1차원 배열 생성 후
* 다시 arrayof(array1, array2, array3) 등으로 취합함
*
* < 3. 3차원 배열 생성법 >
* 같은 원리로 arrayOf(arrayOf(arrayOf( ... 이런식으로 하면 된다
* 다차원 배열은 다 이런식으로 만들음
* 
* < 출력방식 >
* 1. 1차원 배열은 for문 1개
* 2. 2차원 배열은 2중for문에 내부에 쓰는걸 잘 봐야됨
* for (e1 in arr2ver){ //이렇게 한 후
    for (e2 in e1){ //여기서 이렇게 하는게 포인트
        print(e2)
    }
     println()
  }
* */

fun main() {
    
    //1. 기본적인 배열 생성법
    val numbers = arrayOf(1, 2, 3, 4)
    val animals = arrayOf("Cat", "Dog", "Lion")
    
    //기본배열 돌며 출력하기 (for문 1개)
    for( element in numbers){
        println(element)
    }
    
    //2. 다차원 배열 생성법 - 우선 1차원 배열 여러개를 생성
    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(4, 5, 6)
    val array3 = arrayOf(7, 8, 9)
    //다차원 배열 생성법 - 그런다음 그 배열들을 또다시 arrayOf 함수를 통해 2차원 배열로 취합
    val arr2ver = arrayOf(array1, array2, array3)
    //2차원 배열 돌며 출력하기 (2중 for문)
    for (e1 in arr2ver){ //이렇게 한 후
        for (e2 in e1){ //여기서 이렇게 하는게 포인트
            print(e2)
        }
        println()
    }
}