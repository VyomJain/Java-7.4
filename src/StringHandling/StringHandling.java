package StringHandling;

import java.util.Scanner;

public class StringHandling {

	//defining method where the input date is feeded
	public static void dateFormat(String date){
		StringBuilder stringBuilder = new StringBuilder(); //Instantiating stringbuilder class for append function
		
		String regex= "\\s|\\,"; //Defining the regex
		String  []s=date.split(regex); //Feeded date is splitted as per regex
		
//Changing the date format to the final one
		int length = s.length;
		for(int i=(length-1);i>=0;i--){
			if(s[i]==" "|s[i]==","){
				continue;
			}
			stringBuilder.append(s[i]);
			if(i==0){
				break;
			}
			stringBuilder.append("-");
					
		}
//Displaying the final date format		
		String finalString = stringBuilder.toString();
		System.out.println(finalString);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) { //Defining the main method and passing the date

			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter date :");
			String s=scanner.nextLine();
		dateFormat(s);

	}

}
