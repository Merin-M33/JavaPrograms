package methodoverloading;

public class Methodoverloadexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloadexample obj=new Methodoverloadexample();
		obj.display();
		obj.display(2,3);
		obj.display("Merin");

	}
	public  void display(){
		System.out.println("Method Overloading");
		
	}
	public void display(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
		
	}
	public void display(String s) {
		System.out.println(s);
	}

}
