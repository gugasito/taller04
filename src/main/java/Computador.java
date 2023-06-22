public class Computador extends Dispositivo {
    private String gpu;
    private String fuente;
    private String chasis;
    private Pantalla pantalla;


    public Computador(String tipo, String marca, String modelo, double ram, double almacenamiento, String procesador, int año, double precio, int stock, String gpu, String fuente, String chasis, Pantalla pantalla) {
        this.gpu = gpu;
        this.fuente = fuente;
        this.chasis = chasis;
        this.pantalla = pantalla;
        this.setTipo(tipo);
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setRam(ram);
        this.setAlmacenamiento(almacenamiento);
        this.setProcesador(procesador);
        this.setAño(año);
        this.setPrecio(precio);
        this.setStock(stock);
    }

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

    public Pantalla getPantalla() {
        return pantalla;
    }

    @Override
    public String toString() {
        return "[Computador]\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nRam: " + getRam() + " GBs" + "\nAlmacenamiento: " + getAlmacenamiento() + " GBs\nProcesador: "
                + getProcesador() + "\nAño: " + getAño() + "\nPrecio: " + getPrecio() + "\nStock: " + getStock() + "\nGpu: " + getGpu() + "\nFuente: " + getFuente()
                + "\nChasis: " + getChasis() + "\nPantalla: " + getPantalla();
    }

    public void verTablaEspecificaciones() {
        System.out.println("[Computador]\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nRam: " + getRam() + " GBs" + "\nAlmacenamiento: " + getAlmacenamiento() + " GBs\nProcesador: "
                + getProcesador() + "\nAño: " + getAño() + "\nPrecio: " + getPrecio() + "\nStock: " + getStock() + "\nGpu: " + getGpu() + "\nFuente: " + getFuente()
                + "\nChasis: " + getChasis() + "\nPantalla: " + getPantalla());
    }
}