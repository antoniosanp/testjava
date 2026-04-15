import org.example.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp(){
        calc = new Calculadora();
    }

    @Test
    void  deberiaSumarDosNumeros(){


        int resultado = calc.sumar(2,3);
        assertEquals(5, resultado);
    }


    @Test
    void retorna0alsumar3conSuInversoAditivo(){

        int res = calc.sumar(3,-3);
        assertEquals(0,res);
    }

}
