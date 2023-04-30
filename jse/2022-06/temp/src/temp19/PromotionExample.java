package temp19;

public class PromotionExample {
	
	//상속 관계를 전제로, 부모타입이 참조 변수에는 자식 타입의 객체가 대입 가능
	//(다형성 -1)
	//왜 가능한가?? 자동형변환(Promotion) 때문에 대입 가능
	public static void main(String[] args) {
		B b = new B();	//Step.1 B 타입의 객체 생성
		C c = new C();	//Step.2 C 타입의 객체 생성
		D d = new D();	//Step.3 D 타입의 객체 생성
		E e = new E();	//Step.4 E 타입의 객체 생성
		
//		================
//		부모타입의 참조 변수에는 모든 자식 타입의 객체가 대입 가능하다(다형성 -1)(작은 타입의 객체의 주소가 들어가는 것임.)
//		================
		
		A a1 = b;	//조상타입인 A타입의 참조 변수에 자식 타입인 B 객체가 대입
		A a2 = c;	//조상타입인 A타입의 참조 변수에 자식 타입인 C 객체가 대입
		A a3 = d;	//조상타입인 A타입의 참조 변수에 자식 타입인 D 객체가 대입
		A a4 = e;	//조상타입인 A타입의 참조 변수에 자식 타입인 E 객체가 대입
		
		B b1 = d;	//조상타입인 B타입의 참조 변수에 자식 타입인 D 객체가 대입
		C c1 = e;	//조상타입인 C타입의 참조 변수에 자식 타입인 E 객체가 대입
		
//		B b3 = e;	//아무런 관계가 없다. => 대소 비교 못함. => 자동 형변환도 안 되고 강제 형변환도 안 됨.
//		C c2 = d;
		
	} //main
} //end class










