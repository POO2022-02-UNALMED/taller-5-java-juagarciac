import java.util.ArrayList;
import gestion.*;
public class Animal {
	private static int totalAnimales;
	private string nombre;
	private int edad;
	private string habitat;
	private string genero;
	private ArrayList<Zona> zona;
	
	private static int mamiferos=0;
	private static int aves=0;
	private static int reptiles=0;
	private static int peces=0;
	private static int anfibios=0;
	
	public static void mamiferos() {
		Animal.mamiferos+=1;
	}
	public static void aves() {
		Animal.aves+=1;
	}
	public static void reptiles() {
		Animal.reptiles+=1;
	}
	public static void peces() {
		Animal.peces+=1;
	}
	public static void anfibios() {
		Animal.anfibios+=1;
	}
	
	public Animal(string nombre,int edad, string habitat,string genero) {
	this.nombre=nombre;
	this.edad=edad;
	this.habitat=habitat;
	this.genero=genero;
	this.zona=new ArrayList<Animal>();
	}
	public string getNombre() {
		return nombre;
	}
	public string getHabitat() {
		return habitat;
	}
	public string getGenero() {
		return genero;
	}
	public int getEdad() {
		return edad;
	}
	public static string movimiento() {
	return "desplazarse";
	}
	public static string totalPorTipo() {
		return "Mamiferos: "+this.mamiferos+"\nAves: "+this.aves+"\nReptiles:"+this.reptiles+"\nPeces:" +this.peces+"\nAnfibios: "+this.anfibios;
	}
	
	public static int cantidaMamiferos() {
		return Animal.mamiferos;
	}
	public static int cantidaAves() {
		return Animal.aves;
	}
	public static int cantidadReptiles() {
		return Animal.reptiles;
	}
	public static int cantidadPeces() {
		return Animal.peces;
	}
	public static int cantidadAnfibios() {
		return Animal.anfibios;
	}
	@Override
	public string toString() {
		if(this.zona.size==0) {
			return "Mi nombre es"+this.getNombre()+", tengo una edad de "+this.getEdad()+", habito en "+this.getHabitat()+" y mi genero es "+this.getGenero();
					}
		else {return "Mi nombre es"+this.getNombre()+", tengo una edad de "+this.getEdad()+", habito en "+this.getHabitat()+" y mi genero es "+this.getGenero()+", la zona en la que me ubico es "+this.zona+", en el "+this.zona().getZoo().getNombre();
				}
	}

	
}