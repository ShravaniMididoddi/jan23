package Demo;

public class Exercise {

	public static void main(String[] args) {
		int num = 123456,d=1,t,r;
		t=num;
		while(num!=0){
			num= num/10;
			d=d*10;
	}
	d=d/10;
	num=t;
	System.out.println(d);
	System.out.println("num--->"+num);
	
	while(num!= 0) {
		r=num/d;
		num=num%d;
		d= d/10;
		System.out.println(r);
	}
	}
}