package javaOOPS;

class Person {
	String name;
	int age;
	
	static int count;

	// static keyword use krne se class ke lie constant rhega & object pe depend nhii krega .
	
	// static keyword : access ke lie object ki jarurat nhii h
	
	Person() {
		count++;
		System.out.println("person is being created");
	}

	// constructor propeerty ko initialize krta h
	// constructor overloading can be possible

	// this :  ek constructor se dusra constructor call krta h
	
	Person(String name, int age) {
		  this() ;    //  apni classs ke dusre constructor ko call  karo 
		this.name = name;
		this.age = age;   // same class ke dusre parameter ko access krta h
		walking(this);
	}
	
	void walking(Person obj) {
		System.out.println(name+" is walking");
		age += 10;
	}
}

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("Anuj", 25);
		
		System.out.println(p1.name+" "+p1.age);

		System.out.println(Person.count);
		
	}

}



