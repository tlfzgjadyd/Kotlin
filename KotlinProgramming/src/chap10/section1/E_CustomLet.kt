package chap10.section1

/*< 1. 커스텀 뷰에서 let()함수 활용하기 >
* let()함수를 활용한 몇가지 예시를 살펴본다
* 우선 안드로이드 커스텀 뷰에 여백 지정하는 예시를 살펴본다
* 이때 여백 지정은
* 1. 값을 얻기
* 2. 패딩에 할당
* 이런 순서로 진행되는데 패딩 한번만 쓰는 경우에는 저렇게 2단계 거쳐서 변수할당하면
* 할당하느라 자원 낭비 된다 그럴떄 let을 쓰는것임
*
* let을 통해서 얻은값을 보내고
* let람다식 본문에서는 얻은 값을 지정하기 때문에 따로 변수를 할당할 필요가 없게되며
* 인자가 1개뿐이라 it으로 간략화도 가능하다
*
* < 2. null검사 let?.으로 대체하기 >
* let함수를 세이프콜?.과 함께 사용하면 if(null !=obj)같은 null검사 대체 가능하므로 직접 해볼거다
* 
* < 3. 메소드 체이닝을 사용할 때 let함수 활용하기 >
* let함수를 체이닝 기법으로 사용 가능하다
*
* */

fun main() { //아래 코드를 전부 막아둔 이유는 Toast 나오는걸 보니까 앱때 사용하는 코드이기 때문 지금은 여러가지 부족해서 에러남
    /*
}
    //1-1. 원래 여백 지정하는 방식
    val padding =TypedValue.applyDimension{
        TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics).toInt()

        setPadding(padding, 0, padding, 0) //왼쪽, 오른쪽 padding 설정
    }
    
    //1-2. let써서 여백 지정하는 방식
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16f,
                resources.displayMetrics).toInt().let{padding->
            setPadding(padding, 0, padding, 0) //계산된 값을 padding이라는 이름의 인자로 받음

    //1-3. let써서 여백 지정하고 변수도 1개라 it으로 간략화한 방식
        TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16f,
                resources.displayMetrics).toInt().let{
                    setPadding(it, 0, it, 0) //padding 대신 it 사용
        }
    
    //2-1. (기본방식) null검사 let?.으로 대체하기
        var obj: String? //null일 수 있는 변수 obj
        if(null!=obj){
            Toast.makeText(applixationContext, obj, Toast.LENGTH_LONG).show()
        } 
     //(2-2. 개선방식) obj?.let{
        Toast.makeText(ApplicationContext, it, Toast.LENGTH_LONG).show()
                
            //3. 메소드 체이닝을 사용할 때 let함수 활용하기
        var a = 1
        var b = 2
        
        a=a.let{it+2}.let{
            val i = it+b
            i//마지막 식 반환
        }
        println(a)
        
     */
}