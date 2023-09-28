public class Calculator {
@FunctionalInterface
interface IntegerMath {
int operation(int a, int b);
}
public int operateBinary(int a, int b, IntegerMath op) {
// Your code goes here
	int result=op.operation(a, b);
	return result;
}
public static void main(String[] args) {
Calculator myApp = new Calculator();
int n1=10; int n2=20;
IntegerMath adder=(a,b)-> a+b;
IntegerMath subtraction=(a,b)->a-b;
IntegerMath multiplication=(a,b)->a*b;
System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, adder));
System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));
System.out.println(myApp.operateBinary(n1, n2, multiplication));
}
}
