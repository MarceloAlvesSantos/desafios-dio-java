package desafio.java2;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		
		 @SuppressWarnings("resource")
		String movimentos = new Scanner(System.in).nextLine();
		 
	        var x = 0;
	        var y = 0;

	 // TODO: Implemente os movimentos do Rob� e verifique sua posi��o: 

	        for (int i = 0; i < movimentos.length(); i++)
	        {
	            char ch = movimentos.charAt(i);
	            if (ch == 'W')
	            {
	                    x++;
	            }
	                if (ch == 'S')
	                {
	                    x--;
	                }
	                if (ch == 'D')
	                {
	                    y++;
	                }
	                if (ch == 'A')
	                {
	                    y--;
	                }
	        }
	 
	            if (x == 0 && y == 0)
	            {
	                System.out.print("true");
	            }
	            else
	            {
	                System.out.print("false");
	            }
	 
	}
}