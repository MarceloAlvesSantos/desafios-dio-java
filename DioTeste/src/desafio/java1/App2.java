package desafio.java1;

//Abaixo segue um exemplo de c�digo que voc� pode ou n�o utilizar:

import java.util.Scanner; 

public class App2 {
 
 public static void main(String[] args){ 
	 Scanner leitor = new Scanner(System.in); 
	 	int t = 0;
		 do {
		   t = leitor.nextInt(); 
		 } while( t < 2 || t > 50);
		
		//TODO: Implemente uma condi��o onde possamos preencher o vetor de N.
		//Lembre-se a sequ�ncia de valores � de 0 at� T-1:
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
