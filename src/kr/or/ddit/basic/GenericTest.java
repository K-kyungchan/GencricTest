package kr.or.ddit.basic;

//    제네릭을 사용하는 클래스 만드는 방법

//    형식)
//   class 클래스명<제네릭타입글자>{
//   제네릭타입 글자 변수명;     //변수선언에 제네릭을 사용 할 경우 
//   제네릭타입 글자 메서드명(매개변수들...){   // 메서드의 반환값으로 제네릭을 사용 할 경우
//     실행문들....
//     return  값; 
//  }
//  ....
//  반환값타입 메서드명(제네릭타입글자 변수명) {    // 메서드의 매개변수에 제네릭을 사용 할 경우
//  실행문들...
//  return 값..
//   }
//
//  제네릭 타입 글자로 사용하는 것들
//  T ==> Type
//  K ==> Key
//  V ==> Value
//  E ==> Element
//
// 제네릭을 사용하는 class

class GenericClass<T> {
	private T val;

	public void setVal(T val) {
		this.val = val;
	}

	public T getVal() {
		return val;

	}
}

class NonGenericClass {
	private Object val;

	public void setVal(Object val) {
		this.val = val;
	}

	public Object getval() {
		return val;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		NonGenericClass ng1 = new NonGenericClass();
		ng1.setVal("가나다라");

		NonGenericClass ng2 = new NonGenericClass();
		ng2.setVal(100);

		String str1 = (String) ng1.getval(); // 형변환을 반드시 해주어야 한다.
		System.out.println("문자열 반환값 str1 = " + str1);

		Integer num1 = (Integer) ng2.getval();
		System.out.println("정수형 반환값 num1 = " + num1);

		GenericClass<String> gc1 = new GenericClass();
		GenericClass<Integer> gc2 = new GenericClass();

		gc1.setVal("우리나라");
		// gc1.setVal(100); 제네릭 타입과 달라서 오류
		gc2.setVal(200);
		// gc2.equals("느그나라"); 제네릭 타입과 달라서 오류

		String str2 = gc1.getVal();
		int num2 = gc2.getVal();

		System.out.println("제네릭 문자열 반환값 : " + str2);
	}

}
