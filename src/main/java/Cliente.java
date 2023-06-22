public class Cliente {
	private String nombre;
	private String apellido;
	private String correo;
	private int contacto;
	private String estadoCivil;
	private String cuidad;

	public Cliente(String nombre, String apellido, String correo, int contacto, String estadoCivil, String cuidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contacto = contacto;
		this.estadoCivil = estadoCivil;
		this.cuidad = cuidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getContacto() {
		return this.contacto;
	}

	public void setContacto(int contacto) {
		this.contacto = contacto;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCuidad() {
		return this.cuidad;
	}

	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}
}