package ar.edu.unlp.info.oo1.ejercicio4;
import java.time.LocalDate;

public class Ticket {

	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double PrecioTotal;
	
	
	public double impuesto() {
		
		double aux=(getPrecioTotal()*21)/100;
		return aux;
		
	}
	
	public Ticket(LocalDate fecha, int cantidadDeProductos, double pesoTotal, double precioTotal) {
		this.fecha = fecha;
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		PrecioTotal = precioTotal;
	}
	
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}
	
	public double getPrecioTotal() {
		return PrecioTotal;
	}
	
	//no se puede hacer que ticket conozca public List<Producto> getProductos() {
	//return this.productos;
	//
}
	

