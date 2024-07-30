package engtelecom;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {
    @Test
    public void validarConstrutor(){
        Carro c = new Carro();
        assertEquals(0, c.getVelocidadeAtual());
    }

    @Test
    public void testarAcelerar(){
        //valor esperado, valor obtido
        Carro c = new Carro();
        assertEquals(0, c.acelerar(-10));
        assertEquals(10, c.acelerar(10));
        assertEquals(20, c.acelerar(10));
        assertEquals(10, c.acelerar(0));
        assertEquals(120, c.acelerar(400));
    }

    @Test
    public void testarFrear(){
        Carro c = new Carro();
        assertEquals(20, c.acelerar(20));
        assertEquals(10, c.frear(10));
        assertEquals(10, c.frear(0));
        assertEquals(10, c.frear(-1));
        assertEquals(0, c.frear(20));
    }

}