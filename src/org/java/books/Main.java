package org.java.books;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Tot. libri da inserire : ");
		Scanner sc = new Scanner(System.in);
		
		Libro[] libri = new Libro[Integer.valueOf(sc.nextLine())];
		
		for (int i = 0; i < libri.length; i++) {
			
			String titolo;
			int nPagine;
			String autore;
			String editore;
			
			try {
				
				System.out.println("Inserisci il titolo : ");
				titolo = sc.nextLine();
				
				System.out.println("Inserisci il n. di pagine : ");
				nPagine = Integer.valueOf(sc.nextLine());
				
				System.out.println("Inserisci l'autore : ");
				 autore = sc.nextLine();
				
				System.out.println("Inserisci l'editore : ");
				editore = sc.nextLine();
				
				libri[i] = new Libro(titolo, nPagine, autore, editore);
				System.out.println(libri[i]);
				System.out.println("-----------------------");
				
			}catch (Exception e) {
				
				System.err.println("Messaggio di errore" + e.getMessage());
				i--;
				
			}
		}
		sc.close();
		

	}
	
}