package org.java.books;

public class Libro {
	
	private String titolo;
	private int numeroDiPagine;
	private String autore;
	private String editore;
	
	
	
	
	public Libro(String titolo, int numeroDiPagine, String autore, String editore) throws Exception {
		
		setTitolo(titolo);
		setNumeroDiPagine(numeroDiPagine);
		setAutore(autore);
		setEditore(editore);
		
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) throws Exception {
		if(titolo.isBlank()) {
			throw new Exception("Il titolo non puo essere una stringa vuota");
		}
		this.titolo = titolo;
	}
	
	
	public int getNumeroDiPagine() {
		return numeroDiPagine;
	}
	public void setNumeroDiPagine(int numeroDiPagine) throws Exception {
		if(numeroDiPagine < 1) {
			throw new Exception("Il libro deve avere almeno una pagina");
		}
		this.numeroDiPagine = numeroDiPagine;
	}
	
	
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) throws Exception {
		if(autore.isBlank()) {
			throw new Exception("l'autore non puo essere una stringa vuota");
		}
		this.autore = autore;
	}
	
	
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) throws Exception {
		if(editore.isBlank()) {
			throw new Exception("L'editore non puo essere una stringa vuota");
		}
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
