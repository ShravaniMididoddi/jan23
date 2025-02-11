package Demo;
class A{
	static B out = new B();
}
class B{
	void myPrint(String data) {
		System.out.println(data);
	}
}
public class SysPrint {

	public static void main(String[] args) {
		System.out.println("Hello");
		A.out.myPrint("Welcome");

	}

}
