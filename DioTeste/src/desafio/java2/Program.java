package desafio.java2;


// Abaixo segue um exemplo de c�digo que voc� pode ou n�o utilizar
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
    			//System.out.println("Entrada inv�lida, informe um n�mero inteiro!");
    		}
    		
    	}while(!somenteInteiro);
        
        var step = 0;

// TODO: Implemente uma condi��o onde seja poss�vel reduzir o n�mero at� 0:

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

