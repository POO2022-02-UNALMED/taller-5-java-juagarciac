package zooAnimales;
import java.util.ArrayList;
public class Reptil extends Animal{
	private static ArrayList<Reptil> listado=new ArrayList();
	public static int iguanas=0;
	public static int serpientes=0;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas, int largoCola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		Animal.reptiles();
		this.listado.add(this);
	}
	public Reptil() {
		super();
		Animal.reptiles();
		this.colorEscamas="";
		this.largoCola=0;
		this.listado.add(this);
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public static  Reptil crearSerpiente(String nombre,int edad,String genero) {
		Reptil.serpientes+=1;
		return new Reptil(nombre,edad,"jungla",genero,"blanco",1);
	}
	public static Reptil crearIguana(String nombre,int edad,String genero) {
		Reptil.iguanas+=1;
		return new Reptil(nombre,edad,"humedal",genero,"verde",3);
	}
	public static String movimiento() {
		return "reptar";
		}

}