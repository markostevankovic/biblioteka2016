package biblioteka;

import java.util.ArrayList;

public class Knjiga 
{
	private String naslov;
	private long isbn;
	private ArrayList<Autor> autori;
	private String izdavac;
	private int izdanje;
	
	public Knjiga(String naslov, long isbn, ArrayList<Autor> autori, String izdavac, int izdanje) 
	{
		super();
		this.naslov = naslov;
		this.isbn = isbn;
		this.autori = autori;
		this.izdavac = izdavac;
		this.izdanje = izdanje;
	}

	public String getNaslov() 
	{
		return naslov;
	}

	public void setNaslov(String naslov)
	{
		this.naslov = naslov;
	}

	public long getIsbn() 
	{
		return isbn;
	}

	public void setIsbn(long isbn) 
	{
		this.isbn = isbn;
	}
	
	public ArrayList<Autor> getAutori() 
	{
		return autori;
	}

	public void setAutori(ArrayList<Autor> autori) 
	{
		this.autori = autori;
	}

	public String getIzdavac() 
	{
		return izdavac;
	}

	public void setIzdavac(String izdavac) 
	{
		this.izdavac = izdavac;
	}

	public int getIzdanje() 
	{
		return izdanje;
	}

	public void setIzdanje(int izdanje) 
	{
		this.izdanje = izdanje;
	}
	
	
	
}
