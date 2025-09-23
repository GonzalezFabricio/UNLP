package ar.edu.unlp.info.oo1.ejercicio3_Presupuesto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {

	private LocalDate fecha;
	private String cliente;
	private List<Item> items;

	public Presupuesto(String cliente) {
		this.cliente = cliente;
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
	}

	public void agregarItem(Item item) {
		this.items.add(item);
	}

	public double calcularTotal() {
		//return this.items.stream().mapToDouble(Item -> Item.costo()).sum();
		double total = 0;
	    for (Item item : this.items) {
	        total += item.costo();
	    }
	    return total;
	}

	public String getCliente() {
		return this.cliente;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
}
