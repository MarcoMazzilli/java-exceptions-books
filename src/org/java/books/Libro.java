package org.java.books;

public class Libro {
	
	private String titolo;
	private int numeroDiPagine;
	private String autore;
	private String editore;
	
	
	
	
	public Libro(String titolo, int numeroDiPagine, String autore, String editore) {
		
		this.titolo = titolo;
		this.numeroDiPagine = numeroDiPagine;
		this.autore = autore;
		this.editore = editore;
		
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	
	public int getNumeroDiPagine() {
		return numeroDiPagine;
	}
	public void setNumeroDiPagine(int numeroDiPagine) {
		this.numeroDiPagine = numeroDiPagine;
	}
	
	
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) {
		this.editore = editore;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titolo : " + titolo + " | " 
				+ "Numero pagine : " + numeroDiPagine + " | "
				+ "Autore : " + autore + " | "
				+ "Editore : " + editore + " | "
				;
	}
	
	
}
