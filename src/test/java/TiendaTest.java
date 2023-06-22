import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TiendaTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testComprobarClientes() {
        Cliente cliente = new Cliente("Nombre","Apellido","abc@gmail.com",123456789,"Soltero","Temuco");
        Tienda tienda = new Tienda("Calle 123");
        tienda.agregarCliente(cliente);
        assertTrue(tienda.comprobarClientes(cliente));
    }
}