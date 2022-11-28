import java.util.Scanner;

public class StringComp {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner input= new Scanner(System.in);
		String firstString= input.next();
		System.out.println("Enter the second string");
		String secondString=input.next();
	StringCompare(firstString,secondString);
	}

	private static void StringCompare(String firstString, String secondString) {
	
		String latestVersion="";
		String [] firstArrayarray= firstString.split("[.]");
		String [] secondArray=secondString.split("[.]");
		// Same Version
		if(firstString.equals(secondString))
		{
			System.out.println("Same Version");
			return;
		}
		
		// Latest version is first string
		for(int i=0;i<firstArrayarray.length;i++) 
		{
			if((Integer.parseInt(firstArrayarray[i]))>(Integer.parseInt(secondArray[i]))) 
			{
				latestVersion= firstString;
				break;
			}
		}
		
		// Second string is latest.
		if(latestVersion=="") 
		{
			latestVersion=secondString;
		}
		System.out.println("LatestVersion : "+latestVersion);
	}
}
	

