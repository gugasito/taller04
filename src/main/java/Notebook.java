public class Notebook extends Dispositivo {
    private String resolucion;
    private String tipoTeclado;
    private int bateria;


    public Notebook(String tipo, String marca, String modelo, double ram, double almacenamiento, String procesador, int año, double precio, int stock, String resolucion, String tipoTeclado, int bateria) {
        this.resolucion = resolucion;
        this.tipoTeclado = tipoTeclado;
        this.bateria = bateria;
        this.setTipo(tipo);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setRam(ram);
        this.setAlmacenamiento(almacenamiento);
        this.setProcesador(procesador);
        this.setAño(año);
        this.setPrecio(precio);
        this.setStock(stock);
    }

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
        System.out.println("[Notebook]\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nRam: " + getRam() + " GBs" + "\nAlmacenamiento: " + getAlmacenamiento() + " GBs\nProcesador: "
                + getProcesador() + "\nAño: " + getAño() + "\nPrecio: " + getPrecio() + "\nStock: " + getStock() + "\nResolucion: " + getResolucion() + "\nTipo de teclado: " +
                getTipoTeclado() + "\nBatería: " + getBateria());
    }

    @Override
    public String toString() {
        return "[Notebook]\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nRam: " + getRam() + " GBs" + "\nAlmacenamiento: " + getAlmacenamiento() + " GBs\nProcesador: "
                + getProcesador() + "\nAño: " + getAño() + "\nPrecio: " + getPrecio() + "\nStock: " + getStock() + "\nResolucion: " + getResolucion() + "\nTipo de teclado: " +
                getTipoTeclado() + "\nBatería: " + getBateria();
    }
}