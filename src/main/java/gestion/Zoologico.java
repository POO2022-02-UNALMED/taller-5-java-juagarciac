package gestion;
import java.util.ArrayList;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico(String nombre,String ubicacion){
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		this.zonas=new ArrayList<Zona>();
		}
	public Zoologico() {
		this.nombre=null;
		this.ubicacion=null;
		this.zonas=new ArrayList<Zona>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
		zona.agregarZoo(this);
	}
	public int cantidadTotalAnimales() {
		int p=0;
		for(int i=0;i<this.zonas.size();i++) {
			p=p+zonas.get(i).cantidadAnimales();
		}
		return p;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
}
