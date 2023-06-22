public class Notebook extends Dispositivo {
	private String resolucion;
	private String tipoTeclado;
	private int bateria;

	public String getResolucion() {
		return this.resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public int getBateria() {
		return this.bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public void verTablaEspecificaciones() {
		throw new UnsupportedOperationException();
	}
}