package singleinheritance;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		obj.method1();
		obj.method2();

	}
public void method2() {
	System.out.println("Child Class");
}
}
