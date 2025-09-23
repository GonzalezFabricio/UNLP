package ar.edu.unlp.info.oo1.ejercicio7_figurasYCuerpos;

public class Cuerpo3D {

	private Figura caraBasal;
	private double altura;
	
	public Cuerpo3D() {
		
	}
	
	public void setAltura(double altura) {
		this.altura=altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal(Figura cara) {
		this.caraBasal=cara;
	}
	
	public Figura getCaraBasal() {
		return this.caraBasal;
	}
	
	public double getSuperficieExterior() {
		return (2*getCaraBasal().getArea())+(getCaraBasal().getPerimetro()*getAltura());
	}
	
	public double getVolumen() {
		return getCaraBasal().getArea()*getAltura();
	}
	
	
	
}
