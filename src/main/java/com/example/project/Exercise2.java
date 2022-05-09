package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {

		int numSaltos = 0,puntos = 0;
		
		for(int i = a.length-1; i >= 0; i--) {
			if(i == 0) {
				
			}else {
				if(a[i]-a[i-1] <= 50) {
					//OKEY
				}else 
					return -1;
			}
		}
		
		for(int i = 0; i<a.length; i++) {
			if(puntos + 50 >= a[i] ) {
				if(i==6) {
					numSaltos++;
					puntos = a[i];
				}
			}else {
				numSaltos++;
				puntos = a[i-1];
				i--;
			}
		}
		return numSaltos;
	}
}
