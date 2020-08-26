import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {
    @Test
    void shouldScoreOnes(){
        assertEquals(5, new YatzyGame().score(YatzyCategory.ONES, new int[] {1,1,1,1,1}));

    }

}
