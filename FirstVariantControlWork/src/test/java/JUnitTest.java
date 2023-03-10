import org.example.RandomArrayList;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class JUnitTest {
    @Test
    public void testGenerateRandomIntegers() {

        ArrayList<Integer> randomInts = RandomArrayList.createRandomArrayList();

        assertEquals(10, randomInts.size());

        for (int i : randomInts) {
            assertTrue(i >= -100 && i <= 100);
        }
    }
}
