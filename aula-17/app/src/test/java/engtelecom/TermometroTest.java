package engtelecom;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TermometroTest {

    @Test
    public void validaConstrutor() {
        Termometro t = new Termometro('J', 50, 100, 0);
        assertEquals(new Termometro('C', 20, 100, 0), t);
    }

    @Test
    public void testaRetornaTemperaturas(){
        Termometro thermo = new Termometro('J', 50, 100, 0);
        //se eu passar a escala em Fahreinheit, os valores esperados devem ser já convertidos na escala fahreinheit
            //e assim sucessivamente
        assertEquals();

    }
}
