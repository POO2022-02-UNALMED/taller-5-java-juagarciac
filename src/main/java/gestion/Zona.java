import java.util.ArrayList;
import zooAnimales.*;
import gestion.Zoologico;
public class Zona {
	private string nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona(string nombre){
		this.nombre=nombre;
		this.animales=new ArrayList<Animal>();
		this.zoo=null;
	}
	public Zona(string nombre,Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
		this.animales=new ArrayList<Animal>();
	}
	public Zona() {
		this.nombre=null;
		this.animales=new ArrayList<Animal>();
		this.zoo=null;
	}
	
	public string getNombre() {
		return nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	public void agregarZoo(Zoologico zoo) {
		this.zoo=zoo;
	}
	public int cantidadAnimales() {
		return animales.size();
	}
	public Zoologico getZoo() {
		return zoo;
	}
	private void pp() {}

}
