package zooAnimales;
import java.util.ArrayList;
public class Pez extends Animal{
	private static ArrayList<Pez> listado=new ArrayList();
	public static int salmones=0;
	public static int bacalaos=0;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas, int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		Animal.peces();
		this.listado.add(this);
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public Pez crearSalmon(String nombre,int edad,String genero) {
		Pez.salmones+=1;
		return new Pez(nombre,edad,"oceano",genero,"rojo",6);
	}
	public Pez crearBacalao(String nombre,int edad,String genero) {
		Pez.bacalaos+=1;
		return new Pez(nombre,edad,"oceano",genero,"gris",6);
	}
	public static String movimiento() {
		return "nadar";
		}

}
