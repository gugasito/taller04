import java.util.ArrayList;
public class Tablet extends Dispositivo {
	private String resolucion;
	private ArrayList<String> accesorios;

	public String getResolucion() {
		return this.resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public ArrayList<String> getAccesorios() {
		throw new UnsupportedOperationException();
	}

	public void setAccesorios(ArrayList<String> accesorios) {
		throw new UnsupportedOperationException();
	}

	public void verTablaEspecificaciones() {
		throw new UnsupportedOperationException();
	}
}