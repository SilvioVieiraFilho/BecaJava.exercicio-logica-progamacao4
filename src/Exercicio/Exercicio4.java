


package Exercicio;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		
		
		double delta;
		double  x1;
		double x2;
		
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("Digite o numero letra A");
		double a = s.nextDouble();
		System.out.println("Digite o numero letra B");
		double b = s.nextDouble();
		System.out.println("Digite o numero letra C");
		double c = s.nextDouble();
		
		 delta = (b * b) -(4 * (a * c)) ; 
		System.out.println( "valor delta:"+delta);
		
		if(delta < 0) {
		System.out.println(" o Valor de delta é zero ");
		}
		else{
			
			x1 =  (-b  + Math.sqrt(delta)) / (2. * a );
			
			x2 = (-b  - Math.sqrt(delta)) / (2. * a );
			
			System.out.println("valor x1:"+ x1 +" "+"valor x2:"+ x2);
		}
			
		

	
		
	
		

				
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
