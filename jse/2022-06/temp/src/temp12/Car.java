package temp12;

//현실 세계의 모델링 대상 객체: 자동차 => 객체모델링(속성, 행위) => 클래스로 바꾸는 것
public class Car {
	//===================
	//1. 필드
	//===================
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//===================
	//2. 생성자: 현재 우리의 초점 => 생성자 오버로딩(Overloading)
	//===================
	
	//생성자 오버로딩 시, 자주 발생하는 문제점:
	//(1) 필드 초기화 실행문장의 중복발생 => 중복된 코드는 버그의 원천이 된다.
	//(2) 그럼 이 중복된 코드(실행문장)을 어떻게 줄일 수 있을까
	//=> 매개변수가 그 다음으로 많은, 다른 생성자를 호출해주자
	//=> 그런데, 어떻게 한 생성자에서 다른 생성자를 호출가능할까
	//=> this();
	//*this란 키워드의 원래 의미: 이 클래스에서 생성도리 객체의 주소(참조)를 가짐
	//*그러나 다른 생성자 호출방법인 this();로 사용되면, 이때부터는 원래의 의미는 사라지고
	// 같은 클래스 내부에 선언된 "다른 생성자를 호출하겠다"라는 의미로 바뀐다.
	
	Car() {			//기본생성자는 굳이 this(); 안 써도 됨.
//		두번째생성자"호출"(null);
		this(null);		//매개변수의 개수,타입,순서가 맞는 다른 생성자를 부름.
	} //기본 생성자(Default Constructor): 매개변수가 없는 생성자
	//중괄호 안에 실행문장을 넣어놓아도 매개변수가 없으면 기본 생성자(자바 컴파일러가 만드는 것과는 다르지만)
	//자바컴파일러가 자동으로 만들 때 public을 따지긴 하는데 개발자가 직접 만들 때 public 안 붙여도 기본 생성자 맞음.
	
	Car(String model) {
//		세번째생성자호출(model, null); //값을 받지 않아서 초기화할 수 없으므로
		this(model, null);	//this는 생성자를 선언하는 게 아니고, 호출하는 것이기 때문에 소괄호 안이 매개변수가 아니라 전달인자이다. => 타입을 안 써주는 것.
	} //생성자2
	
	Car(String model, String color) {
//		마지막생성자호출(model, color, 0);	//초기화시키지 않으면 기본값 가지므로 기본값 주면 됨.
		this(model, color, 0);
	} //생성자3
	
	//매개변수가 가장 많은 생성자 내부에서 필드의 초기화 수행코드를 몰아 넣자. --- (1)
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} //생성자4
} //end class














