package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado=new ArrayList();
	public static int ranas=0;
	public static int salamandras=0;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		Animal.anfibios();
		this.listado.add(this);
	}
	public Anfibio() {
		super();
		Animal.anfibios();
		this.colorPiel="";
		this.venenoso=false;
		this.listado.add(this);
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public static Anfibio crearRana(String nombre,int edad,String genero) {
		Anfibio.ranas+=1;
		return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
	}
	public static Anfibio crearSalamandra(String nombre,int edad,String genero) {
		Anfibio.salamandras+=1;
		return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
	}
	public static String movimiento() {
		return "saltar";
		}

}