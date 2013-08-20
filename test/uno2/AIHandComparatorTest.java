package uno2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael Salerno
 */
public class AIHandComparatorTest {
    
    Card card1;
    Card card2;
    Card card3;
    Card card4;
    
    public AIHandComparatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.card1 = new Card(Card.Color.RED, Card.Face.ZERO);
        this.card2 = new Card(Card.Color.GREEN, Card.Face.SEVEN);
        this.card3 = new Card(Card.Color.YELLOW, Card.Face.R);
        this.card4 = new Card(Card.Color.WILD, Card.Face.WD4);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of compare method, of class AIHandComparator.
     */
    @Test
    public void testCompare() {
        System.out.println("compare for AI");        
        AIHandComparator instance = new AIHandComparator();
        
        int expResult = this.card1.valueForAI() - this.card2.valueForAI();
        int result = instance.compare(card1, card2);
        assertEquals(expResult, result);
        
        expResult = this.card2.valueForAI() - this.card3.valueForAI();
        result = instance.compare(card2, card3);
        assertEquals(expResult, result);
        
        expResult = this.card3.valueForAI() - this.card4.valueForAI();
        result = instance.compare(card3, card4);
        assertEquals(expResult, result);
        
        expResult = this.card4.valueForAI() - this.card1.valueForAI();
        result = instance.compare(card4, card1);
        assertEquals(expResult, result);
    }
}