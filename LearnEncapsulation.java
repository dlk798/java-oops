// private : sirf usi class ke andr access hoga 
// default : pure package ke andr access hoga
// public : khiin se v access hoga
// protected : sirf us class ko or uske child ko access hoga






package javaOOPS2;

public class LearnEncapsulation {

	public static void main(String[] args) {
		
		Secret obj = new Secret();
//		obj.data = 4;
		
		obj.setData(103);
		
		obj.setData(4);
		
		System.out.println(obj.getData());
		
	}

}

class Secret {
	private int data;
	
	public void setData(int data) {
		if(data > 100) {
			this.data = data;
		} else {
			System.out.println("You are not allowed");
		}
	}
	
	public int getData() {
		return data;
	}
	
}
