package object;

public class Test {
	public static void main(String[] args){
		
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber = "03-1234-5678";
		taro.address = "qaswedfr@wq.fdfs.jp";
		
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		
		Person jiro = new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber = "080-1145-1481";
		jiro.address = "19191111810@senpai.com";
		
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		
		
		Person hanako = new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber = "12-3456-4649";
		hanako.address = "wtf@yahoo.co.jp";
		
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		
		Person yuji = new Person();
		yuji.name="藤村勇治";
		yuji.age=22;
		yuji.phoneNumber="1111-1222-333";
		yuji.address="naisyodesuyo@himitsu.co.jp";
		
		
		System.out.println(yuji.name);
		System.out.println(yuji.age);
		System.out.println(yuji.phoneNumber);
		System.out.println(yuji.address);

		Robot aibo= new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo= new Robot();
		asimo.name="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper= new Robot();
		pepper.name="pepper君";
		pepper.talk();
		pepper.walk();
		pepper.run();
		
		
	}

}
