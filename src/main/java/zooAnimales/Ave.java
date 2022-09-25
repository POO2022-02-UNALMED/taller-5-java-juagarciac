package zooAnimales;
import java.util.ArrayList;
public class Ave extends Animal{
	private static ArrayList<Ave> listado=new ArrayList();
	public static int halcones=0;
	public static int aguilas=0;
	private String colorPlumas;
	
	public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas=colorPlumas;
		Animal.anfibios();
		this.listado.add(this);
	}
	public Ave() {
		super();
		Animal.anfibios();
		this.colorPlumas="";
		this.listado.add(this);
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public static Ave crearHalcon(String nombre,int edad,String genero) {
		Ave.halcones+=1;
		return new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
	}
	public static Ave crearAguila(String nombre,int edad,String genero) {
		Ave.aguilas+=1;
		return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
	}
	public static String movimiento() {
		return "volar";
		}
}