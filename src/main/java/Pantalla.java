public class Pantalla {
    private String marca;
    private String modelo;
    private int año;

    public Pantalla(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "# Pantalla #" +
                "Marca: '" + marca + '\'' +
                ", Modelo: '" + modelo + '\'' +
                ", Año: " + año;
    }
}