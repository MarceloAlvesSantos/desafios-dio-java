package desafio.java2;


// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;
public class Program
{
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
    	boolean somenteInteiro = false;
    	int num = -1;
    	do {
    		try {
    			num = Integer.parseInt(new Scanner(System.in).nextLine());
    			somenteInteiro = true;
    		} catch(NumberFormatException e) {
    			//System.out.println("Entrada inválida, informe um número inteiro!");
    		}
    		
    	}while(!somenteInteiro);
        
        var step = 0;

// TODO: Implemente uma condição onde seja possível reduzir o número até 0:

        while (num >  0 )
        {
            if ((num % 2) == 1)
            {
            	num -= 1;
                step++;
            }
            if(num != 0) {
            	num /= 2;
                step++;
            }
            
        }
        System.out.println(step);
    }
}

