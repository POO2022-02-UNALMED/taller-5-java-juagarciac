import java.util.ArrayList;
import zooAnimales.*;
public class Reptil extends Animal{
	private static ArrayList<Reptil> listado=new ArrayList();
	public static int iguanas=0;
	public static int serpientes=0;
	private string colorEscamas;
	private int largoCola;
	
	public Reptil(string nombre,int edad,string habitat,string genero,string colorEscamas, int largoCola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		Animal.reptiles();
		this.listado.add(this);
	}
	public string getColorEscamas() {
		return colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public Reptil crearSerpiente(string nombre,int edad,string genero) {
		Reptil.serpientes+=1;
		return new Reptil(nombre,edad,"jungla",genero,"blanco",1);
	}
	public Reptil crearIguana(string nombre,int edad,string genero) {
		Reptil.iguanas+=1;
		return new Reptil(nombre,edad,"humedal",genero,"verde",3);
	}
	public static string movimiento() {
		return "reptar";
		}

}