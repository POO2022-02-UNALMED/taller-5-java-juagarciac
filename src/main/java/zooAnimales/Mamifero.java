import java.util.ArrayList;
import zooAnimales.Animal;
public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado=new ArrayList();
	public static int caballos=0;
	public static int leones=0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(string nombre,int edad,string habitat,string genero,boolean pelaje, int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje=pelaje;
		this.patas=patas;
		Animal.mamiferos();
		this.listado.add(this))
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public Mamifero crearCaballo(string nombre,int edad,string genero) {
		Mamifero.caballos+=1;
		return new Mamifero(nombre,edad,"pradera",genero,true,4);
	}
	public Mamifero crearLeon(string nombre,int edad,string genero) {
		Mamifero.leones+=1;
		return new Mamifero(nombre,edad,"selva",genero,true,4);
	}
	
	
}
