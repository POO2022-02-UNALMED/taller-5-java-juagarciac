package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;
public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona(String nombre){
		this.nombre=nombre;
		this.animales=new ArrayList<Animal>();
		this.zoo=null;
	}
	public Zona(String nombre,Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
		this.animales=new ArrayList<Animal>();
	}
	public Zona() {
		this.nombre=null;
		this.animales=new ArrayList<Animal>();
		this.zoo=null;
	}
	
	public String getNombre() {
		return nombre;
	}
	public Zoologico getZoo() {
		return this.zoo;
	}
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
		animal.setzona(this);
	}
	public void agregarZoo(Zoologico zoo) {
		this.zoo=zoo;
	}
	public int cantidadAnimales() {
		return animales.size();
	}
	private void pp() {}

}
