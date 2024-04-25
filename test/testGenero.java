import filterGeneros.Pessoas;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class testGenero {
    @Test
    public void TestGenero(){
        Pessoas pessoas = new Pessoas();

        TestMasculino(pessoas.getMasculino());
        TestFeminino(pessoas.getFeminino());

    }

    private void TestFeminino(List<List<String>> testFeminino) {
        testFeminino.forEach(elemento -> {
            Assert.assertEquals("F",elemento.get(1));
        });
    }

    private void TestMasculino(List<List<String>> testMasculino) {
        testMasculino.forEach(elemento -> {
            Assert.assertEquals("M",elemento.get(1));
        });
    }
}
