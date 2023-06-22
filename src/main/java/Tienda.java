import java.util.ArrayList;

public class Tienda {
	private String direccion;
	private ArrayList<Object> catalogo;
	private ArrayList<Object> dispositivos = new ArrayList<Object>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Object> getCatalogo() {
		throw new UnsupportedOperationException();
	}

	public void setCatalogo(ArrayList<Object> catalogo) {
		throw new UnsupportedOperationException();
	}

	public void agregarCliente(Cliente cliente) {
		if(comprobarClientes(cliente)){
			this.clientes.add(cliente);
		}
	}

	public boolean comprobarClientes(Cliente cliente) {
		boolean existe = false;
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getNombre().equals(cliente.getNombre())||clientes.get(i).getNombre().equals(cliente.getApellido()) ){
				existe=true;
			}
		}
		return existe;
	}
}