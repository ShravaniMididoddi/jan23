package Demo;

public class dem
	{
	    public static void main(String[] args) {
	    	int a =500,b=200,c=199;
	    	int big,small;
	    	
	    	if(a>b) {
	    		big=a;
	    		small=b;
	    	}
	    	else {
	    		big=b;
	    		small=a;
	    	}
	    	if (c>big) big=c;
	    	if(c<small) small=c;
	    System.out.println("big no--->"+big);
	    System.out.println("small no:"+small);
	    System.out.println("Program ends");
	}
}
