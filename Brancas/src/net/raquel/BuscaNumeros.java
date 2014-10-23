package net.raquel;

import java.util.Scanner;
//MODIFICADO otra vez modificado!!!!!!
public class BuscaNumeros {
	public static void main(final String[] args) {
	long TInicio, TFin, tiempo;
	TInicio = System.currentTimeMillis();
	Scanner lector = new Scanner(System.in);
	System.out.print("ELIGE NUMERO: ");
	int numero = lector.nextInt();
	boolean encontrado = false;
	int i = 0;

	while( i < 500000 ){
		if (numero == i){
			encontrado = true;
			break;
		}
		i++;
	}
	
	if (encontrado == true){
		System.out.print("ENCONTRADO!");
	}else{
		System.out.print("NO ENCONTRADO!");
	}
	TFin = System.currentTimeMillis();
	tiempo = TFin - TInicio;
	System.out.println("Tiempo de ejecución en milisegundos: " + tiempo + " milisegundos.");
}
}