package superkeyword;

public class SupermethodChildclass extends SupermethodParentclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupermethodChildclass obj=new SupermethodChildclass();
		obj.display();

	}
	public void display() {
		super.display();
		System.out.println("Child Class");

	}


}
