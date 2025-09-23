package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Balanza {

	private int cantidadDeProducto;
	private double precioTotal;
	private double PesoTotal;
	
	
	public Ticket emitirTicket() {
		
		Ticket aux=new Ticket (LocalDate.now(),getCantidadDeProductos(),getPesoTotal(), getPrecioTotal());
		return aux;
	}
	
	public void agregarProducto(Producto producto) {
		
		setCantidadDeProducto(getCantidadDeProductos()+1);
		setPesoTotal(getPesoTotal()+producto.getPeso());
		setPrecioTotal(getPrecioTotal()+producto.getPrecio());
		
	}
	
	
	public void ponerEnCero() {
		
		setCantidadDeProducto(0);
		setPrecioTotal(0.0);
		setPesoTotal(0.0);
		
	}
	
	
	public Balanza() {
		
		setCantidadDeProducto(0);
		setPrecioTotal(0.0);
		setPesoTotal(0.0);
		
	}

	
	public int getCantidadDeProductos() {
		return cantidadDeProducto;
	}
	public void setCantidadDeProducto(int cantidadDeProducto) {
		this.cantidadDeProducto = cantidadDeProducto;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public double getPesoTotal() {
		return PesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		PesoTotal = pesoTotal;
	}
	
	
	
}
