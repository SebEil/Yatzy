import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    private YatzyGame yatzyGame = new YatzyGame();

    @Test
    void shouldScoreOnes(){
        assertEquals(4, yatzyGame.score(YatzyCategory.ONES, new int[] { 1, 1, 2, 1, 1 }));
        assertEquals(2, yatzyGame.score(YatzyCategory.ONES, new int[] { 1, 2, 2, 7, 1 }));
    }

    @Test
    void shouldScoreTwos(){
        assertEquals(3, yatzyGame.score(YatzyCategory.TWOS, new int[] {2,2,2,1,1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.TWOS, new int[] {2,1,2,1,1}));
    }

}
