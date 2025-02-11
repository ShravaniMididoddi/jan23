package Demo;

public class NumberPattern5 {
	static void Arr(int[]x) {  //x=num
		int len=x.length;//5
		int arrLen = len-1;
		int t =x[arrLen];
		//num[4]= num[3]
		//num[3]= num[2]
		//num[2]= num[1]
		//num[1]= num[0]
		for(int i= arrLen; i>=1;i--) {
			x[i]=x[i-1];
		}
		x[0]=t;
		System.out.print("\n After Right Rotation\n");
		for (int i=0;i<= arrLen; i++) {
			System.out.print(x[i]+ " ");
		}
	}
	public static void main(String[] args) {
		//Right side rotation
		//0 1 2 3 4
		//10 20 30 40 50
		//len--5
		//arrLen=len -1
		//3--4
		//2--3
		//1--2
		//0--1
		//50 10 20 30 40--1
		int[]num= {10,20,30,40,50};
		System.out.println("Before Right Rotation");
		for (int i=0;i<num.length; i++) {
			System.out.print(num[i]+ " ");
		}
		Arr(num);
		Arr(num);
		Arr(num);
		Arr(num);
	}

}
