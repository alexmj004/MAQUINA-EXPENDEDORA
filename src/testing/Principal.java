package testing;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javabeans.Bebida;

public class Principal {
	
	public static void main(String[] args) {
		//Atributos:
		int opcion=0;
		double acumulación=0;
		List<Bebida>bebidas = new ArrayList<Bebida>();
		
		//Objetos de la máquina expendedora:
		Bebida bebida1=new Bebida("Coca Cola", 1.3);
		Bebida bebida2=new Bebida("Fanta Naranja", 1.2);
		Bebida bebida3=new Bebida("Fanta Limón", 1.2);
		Bebida bebida4=new Bebida("Agua", 1.00);
		
		
		//Preguntamos por la opción de la máquina expendedora:
		Scanner literal = new Scanner (System.in);
		System.out.println("¿Qué opción elige?");
		//MÁQUINA EXPENDEDORA
		System.out.println("MÁQUINA DE BEBIDAS");
		System.out.println("------------------------------");
		System.out.println("1. Coca Cola ------ 1,30€");
		System.out.println("2. Fanta Naranja -- 1,20€");
		System.out.println("3. Fanta Limón ---- 1,20€");
		System.out.println("4. Agua ----------- 1,00€");
		System.out.println("5. Apagar Máquina");
		System.out.println("------------------------------");
		
		opcion = literal.nextInt();

		while(opcion!=5) {
			switch(opcion) {
			case 1:
				bebidas.add(bebida1);
				System.out.println("Su Coca Cola Gracias");
				break;
			case 2:
				bebidas.add(bebida2);
				System.out.println("Su Fanta Naranja Gracias");
				break;
			case 3:
				bebidas.add(bebida3);
				System.out.println("Su Fanta Limón Gracias");
				break;
			case 4:
				bebidas.add(bebida4);
				System.out.println("Su Agua Gracias");
				break;
			default:
				System.out.println("Opción incorrecta");
			
				
			}
			System.out.println("¿Qué opción elige?");
			System.out.println("MÁQUINA DE BEBIDAS");
			System.out.println("------------------------------");
			System.out.println("1. Coca Cola ------ 1,30€");
			System.out.println("2. Fanta Naranja -- 1,20€");
			System.out.println("3. Fanta Limón ---- 1,20€");
			System.out.println("4. Agua ----------- 1,00€");
			System.out.println("5. Apagar Máquina");
			System.out.println("------------------------------");
			opcion = literal.nextInt();
		}
		
		
		System.out.println("HASTA PRONTO");
		System.out.println("INFORMA DE VENTAS");
		for(Bebida bebida:bebidas) {
			System.out.println(bebida);
			acumulación+=bebida.getPrecio();
			
		}
		System.out.println("RECAUDACIÓN: "+acumulación);
		
		
	}

}
