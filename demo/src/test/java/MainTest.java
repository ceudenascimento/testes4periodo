import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.example.Main;

public class MainTest {
    
    @Test //método de teste, tem essa anotação e o método não é declarado com o adjetivo Static. nesse caso vou testar o arquivo Main
    public void imprimeTest(){
        Main m = new Main(); //vamos criar um objeto com o mesmo nome da classe que estamos testando. nesse caso como  o método imprime
        //é da classe main o objeto vai ser do tipo Main
        String resultado = m.imprime();
        assertEquals("Hello World", resultado);
    }
    @Test
    public void somaTest(){
        Main m1 = new Main();
        int resultado1 = m1.soma();
        assertEquals(4, resultado1);
    }
    @Test
    public void eParTrueTest(){
        Main m2 = new Main();
        assertTrue(m2.ePar(8));
    }
    @Test
    public void eParFalseTest(){
        Main m2 = new Main();
        assertFalse(m2.ePar(3));
    }
}
