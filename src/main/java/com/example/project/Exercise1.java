package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {

		int longNum = Integer.toString(a).length();
		//Arreglo con los digitos del número
		int arreglo[] = new int[longNum];
		
		//Relleno el arreglo con los digitos pero correspondientes a sus posiciones
		//Si es 1020, en el arreglo = [0,2,0,1]
		for(int i = longNum-1, j=0; i >= 0 && j<longNum; i--,j++) {
			String num = String.valueOf(Integer.toString(a).charAt(i));
			arreglo[j] = Integer.parseInt(num);
		}
		
		
		//Detectar en el arreglo que no tenga ningun numero diferente de 0 ,1 y 2 
		int contDos= 0, numDif =0;
		for (int i = 0; i < arreglo.length; i++) {
			if(arreglo[i] == 0 || arreglo[i] == 1 ||arreglo[i] == 2) {
				if(arreglo[i] == 2) { //contar cuantos numeros 2 hay
					contDos++;
				}
			}else {
				numDif++;
			}
		}
		//Si cumple
		int contUno = 0;
		if(contDos < 2 && numDif == 0 ) {
			if(contDos == 1) {
				int pos = BusquedaDeNumeroEnArreglo(arreglo,2);
				if(pos == 0) {
					//SI TODO SALE BIEN
					//SI TODO SALE BIEN----------
					//Convertir la base Gabriel a decimal
					int suma = 0;
					for (int i = 0; i < arreglo.length; i++) { 
						suma = suma + (int) (arreglo[i]*(Math.pow(2,i+1)-1));
					}
					
					return String.valueOf(suma);
				//----------------	
				}else {
					for(int i = pos-1; i >=0; i--) {
						if(arreglo[i]==1) {
							contUno++;
						}
					}
				}
			}else {
				//SI TODO SALE BIEN
				//Convertir la base Gabriel a decimal
				int suma = 0;
				for (int i = 0; i < arreglo.length; i++) { 
					suma = suma + (int) (arreglo[i]*(Math.pow(2,i+1)-1));
				}
				
				return String.valueOf(suma);
			//----------------	
			}
		}else {
			return "El numero proporcionado no esta en base Gabriel.";
		}
		
		if(contUno > 0) {
			return "El numero proporcionado no esta en base Gabriel.";
		}else {
			//SI TODO SALE BIEN----------
			//Convertir la base Gabriel a decimal
			int suma = 0;
			for (int i = 0; i < arreglo.length; i++) { 
				suma = suma + (int) (arreglo[i]*(Math.pow(2,i+1)-1));
			}
			
			return String.valueOf(suma);
		//----------------	
		}
		
		
	
		
		
		//return "El numero proporcionado no esta en base Gabriel.";
	}
	
	public static int BusquedaDeNumeroEnArreglo(int[] arreglo, int busqueda) { // busca a penas lo encuentre
		for (int x = 0; x < arreglo.length; x++) {
			if (arreglo[x] == busqueda)
				return x;
		}
		return -1;
	}
	
}
