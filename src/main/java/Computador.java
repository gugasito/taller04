public class Computador extends Dispositivo {
	private String gpu;
	private String fuente;
	private String chasis;
	private Pantalla pantalla;

	public String getGpu() {
		return this.gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getFuente() {
		return this.fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public void verTablaEspecificaciones() {
		throw new UnsupportedOperationException();
	}
}