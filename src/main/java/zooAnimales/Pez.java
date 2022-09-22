import java.util.ArrayList;
import zooAnimales.Animal;
public class Pez extends Animal{
	private static ArrayList<Pez> listado=new ArrayList();
	public static int salmones=0;
	public static int bacalaos=0;
	private string colorEscamas;
	private int cantidadAletas;
	
	public Pez(string nombre,int edad,string habitat,string genero,string colorEscamas, int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		Animal.peces();
		this.listado.add(this));
	}
	public string getColorEscamas() {
		return colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public pez crearSalmon(string nombre,int edad,string genero) {
		Pez.salmones+=1;
		return new Pez(nombre,edad,"oceano",genero,"rojo",6);
	}
	public Mamifero crearBacalao(string nombre,int edad,string genero) {
		Pez.bacalaos+=1;
		return new Pez(nombre,edad,"oceano",genero,"gris",6);
	}
	public static string movimiento() {
		return "nadar"
		}

}
