package desafio.java1;

//Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.Scanner; 

public class App2 {
 
 public static void main(String[] args){ 
	 Scanner leitor = new Scanner(System.in); 
	 	int t = 0;
		 do {
		   t = leitor.nextInt(); 
		 } while( t < 2 || t > 50);
		
		//TODO: Implemente uma condição onde possamos preencher o vetor de N.
		//Lembre-se a sequência de valores é de 0 até T-1:
		     int[]  N = new int[1000];
		     for(int i = 0 ; i < 1000; i++){
			       for(int j = 0; j < t; j++){
			    	   if(i == 1000) break;
			    	   N[i] = j;
			    	   i++;
			       }
			       i--;
			     }
		
		     for(int i = 0 ; i < 1000; i++){
		       for(int j = 0; j < t; j++){
		    	   if(i == 1000) break;
		           System.out.println("N[" + i  + "] = " + N[j]);
		           i++;
		       }
		       i--;
		     }
     leitor.close();    
 }
}
