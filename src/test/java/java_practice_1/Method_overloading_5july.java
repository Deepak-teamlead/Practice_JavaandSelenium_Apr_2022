package java_practice_1;
public class Method_overloading_5july {
//Method Overloading
public void m1(int a, int b) {
	int c=a+b;
	System.out.println(c);
}
public void m1(String x, String y) {
	String z=x.concat(y);
	System.out.println(z);
}
public static void main(String[] args) {
	Method_overloading_5july o=new Method_overloading_5july();
	o.m1(1,2);
	o.m1("rock","brock");
	o.m1(5,5);
	o.m1("cake","snake");

	}

}
