import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1TestPriceTest {

    @Test
    public void testGetDiscount_YoungAge() {
        assertEquals(1.0, Main.getDiscount(5, "Warsaw", false));
    }

    @Test
    public void testGetDiscount_OlderAge() {
        assertEquals(0.55, Main.getDiscount(15, "Warsaw", false));
    }

    @Test
    public void testGetDiscount_Thursday() {
        assertEquals(1.0, Main.getDiscount(18, "Warsaw", true));
    }

    @Test
    public void testGetDiscount_Normal() {
        assertEquals(0.5, Main.getDiscount(18, "Krakow", false));
    }

    @Test
    public void testGetDiscount_NoDiscount() {
        assertEquals(0.0, Main.getDiscount(25, "Krakow", false));
    }
}
