package fr.univaix.iut.pokebattle;
import java.util.Date;

import org.junit.Test;
<<<<<<< HEAD:PokeBotDemo/src/test/java/fr/univaix/iut/pokebattle/PokeBotTest.java
=======


>>>>>>> ac42c2523dc0d6e42e45f87f14b9d349620c6f4b:src/test/java/fr/univaix/iut/pokebattle/PokeBotTest.java
import static org.junit.Assert.assertEquals;

/**
 * Integration tests checking the PokeBot
 * behavior. We just test some cases to make sure that the
 * PokeBot is using SmartCells properly.
 */
public class PokeBotTest {
    PokeBot pokeBot = new PokeBot();
    
<<<<<<< HEAD:PokeBotDemo/src/test/java/fr/univaix/iut/pokebattle/PokeBotTest.java
    @Test
    public void testSalut() {
    	pokeStatus status = new pokeStatus();
    	status.setText("Salut");
=======
    
    @Test
    public void testSalut() {
    	pokeStatus status = new pokeStatus();
>>>>>>> ac42c2523dc0d6e42e45f87f14b9d349620c6f4b:src/test/java/fr/univaix/iut/pokebattle/PokeBotTest.java
        assertEquals("@PaulMista Pika pika", pokeBot.ask(status));
    }
    
}
