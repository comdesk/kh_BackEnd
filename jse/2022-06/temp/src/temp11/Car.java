package temp11;

//현실세계의 자동차란, 객체를 모델링해서 아래의 클래스를 선언한다.
//과연 자동차에는 어떤 속성(=> 이것이 클래스의 필드가 된다)들이
//필요할까?
public class Car {	//클래스 선언부
	//클래스의 구성멤버(3가지)
	//1. 필드: 클래스 블록에 선언된 변수
	//2. 생성자
	//3. 메소드
	
	//선언된 필드
	//필드는 변수 정의처럼 초기값을 처음부터 가질 수 있다.
	//초기값을 갖는 필드도 생성자에서 얼마든지 바꿀 수 있다.
	//대부분 필드는 생성자에 의해 초기화되도록 하는 게 좋음.
	
	//아래와 같이 필드 선언시, 초기값을 가질 수도 있지만,
	//거의 일반적으로는 초기값을 "하드코딩(Hardcolding)"하면 안 된다.
	//핵심은, 필드 초기화는 클래스의 2번째 구성 멤버인 "생성자(Constructor)"에서 해야 한다.
	String company = "현대자동차";
	String model = "그랜저";
	String color;
	
	int maxSpeed = 350;
	int speed;
	
	//개발자가 직접 기본 생성자를 만들어 보자
	//그래야 클래스에 생성자가 없을 때 자바 컴파일러가 어떻게 기본 생성자(default Constructor)를
	//만들어 내는지 이해할 수 있다.
	
	//클래스 선언시, 개발자가 생성자를 생략하면 아래와 같이 자바 컴파일러가
	//소위 "기본생성자(Default Constructor)"를 자동으로 생성해서 클래스 파일에 넣는다.
	//Step.1 생성자의 이름 == 클래스 이름 반드시 동일해야 한다.
	//Step.2 생성자의 이름 오른쪽에 소괄호() 블록을 생성
	//Step.3 Step.2까지 진행 후에 중괄호{} 블록을 생성
	//Step.4 위에 클래스 선언부에 public 키워드가 있으면 생성자에도 붙이고, 없으면 안 붙인다.
	//Step.5 중괄호 블록 안에는 단 한 개의 실행문장도 넣지 않는다.
//	public Car() {
//		//생성자나 메소드의 호출을 영어단어로 "invocation"(명사), "invoke"(동사)
//		System.out.println("Car() default constructor invoked.");
//	} //기본 생성자
	
//	=====================================
//	개발자가 직접 선언하는 생성자	
//	=====================================
	
	Car() {
		//같은 클래스내부에 선언된 필드를 사용하려면 아래와 같이 그저 필드명으로 사용하면 된다.
		//=> 그런데, 버그의 소지가 될 수 있음.
//		color = "흰색";
//		String color = "흰색";	//case 1) 필드 사용이 아니라, 지역 변수 정의
		
//		----------------------
		
		color = "흰색";			//color 필드에 "흰색" 값을 초기화(ok)
		
		//...
		String color = "검은색";	//case 2) 위에 필드와 지금 지역 변수 이름이 중복
		
	} //명시적인 2번째 생성자
	
//	=====================================
	
	//생성자 오버로딩 규칙에 위배
//	Car(int speed) {
//		this.speed = speed;
//	} //명시적인 3번째 생성자
	
	//생성자와 관련된 대전제1:
	//(1) 클래스 선언시, 개발자가 단 1개의 생성자라도 명시적으로 선언하면,
	//(2) 자바 컴파일러는 생성자와 관련해서 절대 개입하지 않는다.(기본 생성자 절대 안 만든다.)
	
	//생성자와 관련된 대전제2:
	//(1) 클래스 선언시, 하나의 클래스 안에는 1개 이상의 생성자를 선언할 수 있다.
	//(2) 이를, "생성자 오버로딩(Overloading)"이라고 한다.
	
	//생성자와 관련된 대전제3:
	//(1) 클래스 선언시, 설령 자바 컴파일러가 자동으로 만드러주는 "기본생성자"만 필요할지라도
	//	  직접 기본 생성자를 만들어 넣으라.
	//(2) 자바 컴파일러에 의존하지 말 것.
} //end class


















