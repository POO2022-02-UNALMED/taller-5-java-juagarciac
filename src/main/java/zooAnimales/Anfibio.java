import java.util.ArrayList;
import zooAnimales.Animal;
public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado=new ArrayList();
	public static int ranas=0;
	public static int salamandras=0;
	private string colorPiel;
	private boolean venenoso;
	
	public Anfibio(string nombre,int edad,string habitat,string genero,string colorPiel,boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		Animal.anfibios();
		this.listado.add(this);
	}
	public string getColorPiel() {
		return colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public Anfibio crearRana(string nombre,int edad,string genero) {
		Anfibio.ranas+=1;
		return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
	}
	public Anfibio crearSalamandra(string nombre,int edad,string genero) {
		Anfibio.salamandras+=1;
		return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
	}
	public static string movimiento() {
		return "saltar";
		}

}