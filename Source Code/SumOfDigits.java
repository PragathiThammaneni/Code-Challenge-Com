/**
 * 
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author pragathi thammaneni
 *
 */
public class SumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* intialized the required parameters*/
		
		int sum =0;
		Scanner scan = new Scanner(System.in);
		String str="";
		
		/* reading the user input from console*/
		
		String input =null;
		System.out.println("Please Enter -f if you want to input file else just press s");
		input =scan.next();
		/*logic that will  iterate over the input,
		 *  adding the digits, and returning the result
		 */
		if((input).equals("-f")) {
			File temp;
			try {

				String line ;
				String path;
				System.out.println("Enter the file path");
				path=scan.next();
				BufferedReader br = new BufferedReader(new FileReader(path)); 
				while((line = br.readLine()) != null) {
					str=line;
					System.out.println("String in the File is:"+str);
					break;
				} 
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception=="+e.getMessage());
				return;
			} 
		}

		if((input).equals("s")) {
			System.out.println("Enter the String");
			str=scan.next();
		}

		System.out.println("Please Enter -x if you want to handle hex values else just press n");
		String temp= scan.next();
		if(str!=null)
			for(char c:str.toLowerCase().toCharArray()) {
				if(temp.equals("-x")&&c>96&&c<103) {
					sum=sum+c-'a'+10;

				}
				if(c>47&&c<58) {
					sum=sum+c-'0';
				}
			}
		System.out.println("Total Sum: "+sum);
	}

}
