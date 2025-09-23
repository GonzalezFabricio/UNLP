package ar.edu.unlp.info.oo1.ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Balanza {

	private List<Producto> productos;
	
	
	public Ticket emitirTicket() {
		
		Ticket aux=new Ticket (LocalDate.now(),getCantidadDeProductos(),getPesoTotal(), getPrecioTotal());
		this.ponerEnCero();
		return aux;
	}
	
	public void agregarProducto(Producto producto) {
		
		this.productos.add(producto);
	}
	
	
	public void ponerEnCero() {
		
		this.productos= new ArrayList<Producto>();
	}
	
	
	public Balanza() {
		
		this.ponerEnCero();
	}

	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	
	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(Producto -> Producto.getPrecio()).sum();
	}
	
	
	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(Producto -> Producto.getPeso()).sum();
	}
	
	public List<Producto> getProductos() {
		return this.productos;
	}
	
	
}
