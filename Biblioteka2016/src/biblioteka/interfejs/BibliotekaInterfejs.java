package biblioteka.interfejs;

import java.util.ArrayList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaInterfejs 
{
	public void dodajKnjigu(Knjiga knjiga);
	public void obrisiKnjigu(Knjiga knjiga);
	public ArrayList<Knjiga> vratiSveKnjige();
	public ArrayList<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac);
}
