import java.util.ArrayList;
import zooAnimales.*;
public class Ave extends Animal{
	private static ArrayList<Ave> listado=new ArrayList();
	public static int halcones=0;
	public static int aguilas=0;
	private string colorPlumas;
	
	public Ave(string nombre,int edad,string habitat,string genero,string colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas=colorPlumas;
		Animal.anfibios();
		this.listado.add(this);
	}
	public string getColorPlumas() {
		return colorPlumas;
	}
	public Ave crearHalcon(string nombre,int edad,string genero) {
		Ave.halcones+=1;
		return new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
	}
	public Ave crearAguila(string nombre,int edad,string genero) {
		Ave.aguilas+=1;
		return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
	}
	public static string movimiento() {
		return "volar";
		}
}