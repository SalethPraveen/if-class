package recurive;

import java.util.Scanner;

public class mulitiplicationPro {
	
	Scanner scan = new Scanner(System.in);
	
	int i=0, input  ;
	void in()
	{
		System.out.print("enter the value");
		input=scan.nextInt();
	}
	
	void table()
	{
		if(i<10)
			
		{
			i++;
			System.out.println(i+ "*" + input + "=" + (i*input));
		   table();
			
		}
		
	
	}
}
