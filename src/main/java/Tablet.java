import java.util.ArrayList;

public class Tablet extends Dispositivo {
    private String resolucion;
    private ArrayList<String> accesorios;

    public Tablet(String marca,String tipo , String modelo, double ram, double almacenamiento, String procesador, int año, double precio, int stock, String resolucion) {
        this.resolucion = resolucion;
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

    public void agregarAccesorio(String accesorio) {
        accesorios.add(accesorio);
    }

    public void verTablaEspecificaciones() {
        System.out.println("[Tablet]\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nRam: " + getRam() + " GBs" + "\nAlmacenamiento: " + getAlmacenamiento() + " GBs\nProcesador: "
                + getProcesador() + "\nAño: " + getAño() + "\nPrecio: " + getPrecio() + "\nStock: " + getStock() + "\nResolución: " + getResolucion() + "\nAccesorios: " + getAccesorios());
    }

    @Override
    public String toString() {
        return "[Tablet]\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nRam: " + getRam() + " GBs" + "\nAlmacenamiento: " + getAlmacenamiento() + " GBs\nProcesador: "
                + getProcesador() + "\nAño: " + getAño() + "\nPrecio: " + getPrecio() + "\nStock: " + getStock() + "\nResolución: " + getResolucion() + "\nAccesorios: " + getAccesorios();
    }
}