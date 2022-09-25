package zooAnimales;
import java.util.ArrayList;
public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado=new ArrayList();
	public static int caballos=0;
	public static int leones=0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje, int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje=pelaje;
		this.patas=patas;
		Animal.mamiferos();
		this.listado.add(this);
	}
	public Mamifero() {
		super();
		Animal.mamiferos();
		this.patas=0;
		this.pelaje=false;
		this.listado.add(this);
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public Mamifero crearCaballo(String nombre,int edad,String genero) {
		Mamifero.caballos+=1;
		return new Mamifero(nombre,edad,"pradera",genero,true,4);
	}
	public Mamifero crearLeon(String nombre,int edad,String genero) {
		Mamifero.leones+=1;
		return new Mamifero(nombre,edad,"selva",genero,true,4);
	}
	
	
}
