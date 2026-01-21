package superkeyword;

public class SuperinstanceChildclass extends SuperinstanceParentclass {
int x=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperinstanceChildclass obj=new SuperinstanceChildclass();
		obj.display();

	}
	public void display() {
		System.out.println(x);  
		System.out.println(super.x); 
	}

}
