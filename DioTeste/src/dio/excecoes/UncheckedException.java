package dio.excecoes;

import javax.swing.JOptionPane;

public class UncheckedException {

	public static void main(String[] args) {
		boolean respostaCorreta = false;
		do {
			
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador: ");
			
			try {
				int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
				System.out.println("Resultado: " + resultado);
				respostaCorreta = true;

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro!");
				//e.printStackTrace();
			} catch (ArithmeticException e){
				JOptionPane.showMessageDialog(null, "Impossível dividir por zero" + e.getMessage());
				//e.printStackTrace();
			}finally {
				System.out.println("Chegoun no finally!!");
			}
			
		} while(!respostaCorreta);
		
		System.out.println("Chegou até aqui!!");
	}
	
	public static int dividir(int a, int b) {
		return a / b;
	}

}