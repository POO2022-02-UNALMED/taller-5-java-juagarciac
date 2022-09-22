import java.util.ArrayList;
public class Zoologico {
	private string nombre;
	private string ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico(string nombre,string ubicacion){
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		this.zonas=new ArrayList<Zona>();
		}
	public Zoologico() {
		this.nombre=null;
		this.ubicacion=null;
	}
	
	public string getNombre() {
		return nombre;
	}
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
		zona.agregarZoo(this);
	}
	public int cantidadTotalAnimales() {
		int p=0;
		for(Zona cadena: zonas) {
			p=p+cadena.cantidadAnimales;
		}
		return p;
	}
}
