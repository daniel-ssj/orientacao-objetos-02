package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CorrentistaTeste {
    private Correntista correntista;

    @BeforeEach
    public void beforeEach() {
        Correntista correntista = new Correntista();
        correntista.setCodigo(1);
        correntista.setEmail("correntista@email.com");
        correntista.setNome("Correntista");
        correntista.setTelefone("(12) 34567-8912");
    }

    @AfterEach
    public void afterEach() {
        correntista = null;
    }

    @Test
    public void criarObjetoCorrentista() {
        assertNotNull(correntista);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(correntista.getCodigo());
        assertNotNull(correntista.getEmail());
        assertNotNull(correntista.getNome());
        assertNotNull(correntista.getTelefone());
    }

}
