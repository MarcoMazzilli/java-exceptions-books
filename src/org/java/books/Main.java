package org.java.books;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Tot. libri da inserire : ");
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
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
//				System.out.println(libri[i]);
//				System.out.println("-----------------------");
				
			}catch (Exception e) {
				
				System.err.println("Messaggio di errore" + e.getMessage());
				i--;
				
			}
		}
		sc.close();
		// WRITING READING FILE 
		
		FileWriter myWriter = null;
		
		try {
			myWriter = new FileWriter("/Users/marcovittorio/Desktop/JAVA/Exercises/java.out",true);//aggiungere true come sec parametro
			
				for (int x=0;x<libri.length;x++) {
					
					myWriter.write(libri[x].toString());
					
//					System.out.println(libri[x]);
//					System.out.println("----------------");
					
				}
			} catch (IOException e) {
				
				System.err.println("Problema nella scrittura del file: " + e.getMessage());
			} finally {
				
				try {
					myWriter.close();
				} catch (IOException e) {
		
					e.getMessage();
				}
			}
	
	}
	
}