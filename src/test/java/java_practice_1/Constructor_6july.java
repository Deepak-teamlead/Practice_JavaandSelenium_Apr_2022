package java_practice_1;
public class Constructor_6july {
//Constructor---A constructor is used to pass data to variables using objects
int a;
int b;
public Constructor_6july() {
	a=10;
	b=20;
}
public Constructor_6july(int x, int y) {
	a=x;
	b=y;
}
public static void main(String[] args) {
	Constructor_6july o=new Constructor_6july();
	System.out.println("Constructor value of a : "+ o.a);
	System.out.println("Constructor value of b : "+ o.b);
    //*****************************************
//Parameterized constructor
	Constructor_6july o1=new Constructor_6july(100,200);
	System.out.println("Parameterized Constructor value of a : "+ o1.a);
	System.out.println("Parameterized Constructor value of b : "+ o1.b);
	}

}
