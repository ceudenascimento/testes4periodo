import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.example.Banco;

public class BancoTest {

    @Test
    public void testSaldoInicial() {
        Banco conta = new Banco("João", 1000.00);
        assertEquals(1000.00, conta.getBalance(), 0.001);
    }

    @Test
    public void testDepositoValido() {
        Banco conta = new Banco("Maria", 1000.00);
        conta.deposit(500.00);
        assertEquals(1500.00, conta.getBalance(), 0.001);
    }

    @Test
    public void testDepositoInvalido() {
        Banco conta = new Banco("Pedro", 1000.00);
        conta.deposit(-100.00);
        assertEquals(1000.00, conta.getBalance(), 0.001);
    }

    @Test
    public void testSaqueBemSucedido() {
        Banco conta = new Banco("Ana", 1000.00);
        boolean resultado = conta.withdraw(400.00);
        assertTrue(resultado);
        assertEquals(600.00, conta.getBalance(), 0.001);
    }

    @Test
    public void testSaqueSaldoInsuficiente() {
        Banco conta = new Banco("Lucas", 1000.00);
        boolean resultado = conta.withdraw(1500.00);
        assertFalse(resultado);
        assertEquals(1000.00, conta.getBalance(), 0.001);
    }

    @Test
    public void testSaqueInvalido() {
        Banco conta = new Banco("Carla", 1000.00);
        boolean resultado = conta.withdraw(-200.00);
        assertFalse(resultado);
        assertEquals(1000.00, conta.getBalance(), 0.001);
    }
}
