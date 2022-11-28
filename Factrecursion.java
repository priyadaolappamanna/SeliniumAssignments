
public class Factrecursion
{
	
	    public static int factorial(int n){      
	          if (n == 1) //statement 1     
	            return 1;    //statement 2  
	          else      
	            return(n * factorial(n-1));//statement 3      
	    }      
	  
	public static void main(String[] args) {  
	System.out.println("Factorial of 5 is: "+factorial(5));  
	}  
	}

//s1 n==5 s2 false s3 factorial= 5*factorial (4)    5*24
// n==4 factorial =4*factorial (3)      4*6
// n==3 factorial(3)=3*factorial(2)     3*2
//n==2 factorial (2)=2*factorial(1)     2*1
//n==1 statement 2 true factorial(1)=1
