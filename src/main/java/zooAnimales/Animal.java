package zooAnimales;
import gestion.*;
import java.util.ArrayList;
public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
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
	
	public Animal(String nombre,int edad,String habitat,String genero) {
	this.nombre=nombre;
	this.edad=edad;
	this.habitat=habitat;
	this.genero=genero;
	this.zona=new ArrayList<Zona>();
	}
	public String getNombre() {
		return nombre;
	}
	public String getHabitat() {
		return habitat;
	}
	public String getGenero() {
		return genero;
	}
	public int getEdad() {
		return edad;
	}
	public static String movimiento() {
	return "desplazarse";
	}
	public static String totalPorTipo() {
		return "Mamiferos: "+Animal.mamiferos+"\nAves: "+Animal.aves+"\nReptiles:"+Animal.reptiles+"\nPeces:" +Animal.peces+"\nAnfibios: "+Animal.anfibios;
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
	public int valor() {
		return this.zona.size;
	}
	public String getNombrezona(){
		return this.zona.getNombre;
	}
	public String getzoo(){
		return this.zona.getZoo.getNombre;
	}
	@Override
	public String toString() {
		if(this.valor()==0) {
			return "Mi nombre es"+this.getNombre()+", tengo una edad de "+this.getEdad()+", habito en "+this.getHabitat()+" y mi genero es "+this.getGenero();
					}
		else {return "Mi nombre es"+this.getNombre()+", tengo una edad de "+this.getEdad()+", habito en "+this.getHabitat()+" y mi genero es "+this.getGenero()+", la zona en la que me ubico es "+this.getNombrezona()+", en el "+this.getzoo();
				}
	}

	
}