package uno2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.pircbotx.Colors;

/**
 *
 * @author Michael Salerno
 */
public class CardTest {
    
    Card card1;
    Card card2;
    Card card3;
    Card card4;    
    
    public CardTest() {
        this.card1 = new Card(Card.Color.RED   , Card.Face.ZERO);
        this.card2 = new Card(Card.Color.RED   , Card.Face.ZERO);
        this.card3 = new Card(Card.Color.YELLOW, Card.Face.S   );
        this.card4 = new Card(Card.Color.WILD  , Card.Face.WILD);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("card toString test");
        assertEquals(card1.toString(), card1.color + " " + card1.face);
        assertEquals(card2.toString(), card2.color + " " + card2.face);
        assertEquals(card3.toString(), card3.color + " " + card3.face);
        assertEquals(card4.toString(), card4.color + " " + card4.face);
    }
    
    /**
     * Test of cardColor method, of class Card.
     */
    @Test
    public void testCardColor() {
        System.out.println("cardColor test");
        assertEquals(Colors.RED, card1.cardColor());
        assertEquals(Colors.RED, card2.cardColor());
        assertEquals(Colors.YELLOW, card3.cardColor());
        assertEquals(Colors.REVERSE, card4.cardColor());
    }

    /**
     * Test of equals method, of class Card.
     */
    @Test
    public void testEquals() {
        System.out.println("Card equals test");
        
        assertTrue(card1.equals(card2));
        assertTrue(card2.equals(card1));
        assertTrue(card1.equals(card1));
        
        assertFalse(card1.equals(card3));
        assertFalse(card4.equals(card3));
        assertFalse(card3.equals(card2));
    }

    /**
     * Test of valueForAI method, of class Card.
     */
    @Test
    public void testValueForAI() {
        System.out.println("valueForAI test");
        assertTrue(card1.valueForAI() == 112);
        assertTrue(card2.valueForAI() == 112);
        assertTrue(card3.valueForAI() == 402);
        assertTrue(card4.valueForAI() == 513);
    }
    
}