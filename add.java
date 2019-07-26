package recurive;

import java.util.Scanner;

public class add {

	//int[] add = { 5, 3, 2, 6 };
	int [] add= new int[50];
	int j = 0;
	int i = 0;
	int temp = 0;
	int n;
	Scanner scan = new Scanner(System.in);
	public void size()
	{
		
		System.out.println("Enter a limit");
		n = scan.nextInt();
	}
	public void input()
	{
		
		if(j<n)
		{
			j++;
			System.out.println("Enter a "+j+"value" );
			add[j]=scan.nextInt();
			//System.out.println(add[j]);
			input();
		}
	}

	public void in() {

		if (i <= n) {
			temp = temp + add[i];
			i++;
			// System.out.println(temp);
			in();
		}

	}

	public void display() {
		System.out.println("Answer is" + temp);
	}

}
