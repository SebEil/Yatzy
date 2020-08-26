import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    private YatzyGame yatzyGame = new YatzyGame();

    @Test
    void shouldScoreOnes(){
        assertEquals(5, yatzyGame.score(YatzyCategory.ONES, new int[] {1,1,2,1,1}));
        assertEquals(5, yatzyGame.score(YatzyCategory.ONES, new int[] {1,1,2,1,1}));
    }

}
