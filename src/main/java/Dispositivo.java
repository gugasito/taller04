import java.util.ArrayList;
public abstract class Dispositivo {
	private String marca;
	private double ram;
	private double almacenamiento;
	private String procesador;
	private int año;
	private double precio;
	private int stock;


	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getRam() {
		return this.ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	public double getAlmacenamiento() {
		return this.almacenamiento;
	}

	public void setAlmacenamiento(double almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getAño() {
		return this.año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public abstract void verTablaEspecificaciones();

	public ArrayList<Object> buscarMarca(String marca) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Object> buscarModeloTipo(String modelo, String tipo) {
		throw new UnsupportedOperationException();
	}
}