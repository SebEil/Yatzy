import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    private YatzyGame yatzyGame = new YatzyGame();

    @Test
    void shouldScoreOnes(){
        assertEquals(4, yatzyGame.score(YatzyCategory.ONES, new int[] { 1, 1, 2, 1, 1 }));
        assertEquals(2, yatzyGame.score(YatzyCategory.ONES, new int[] { 3, 2, 2, 1, 1 }));
    }

    @Test
    void shouldScoreTwos(){
        assertEquals(4, yatzyGame.score(YatzyCategory.TWOS, new int[] {2,5,2,1,1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.TWOS, new int[] {1,1,2,1,1}));
    }

    @Test
    void shouldScorePairs(){
        assertEquals(10, yatzyGame.score(YatzyCategory.PAIR, new int[] { 5, 4, 5, 1, 6}));
        assertEquals(12, yatzyGame.score(YatzyCategory.PAIR, new int[] { 2, 6, 3, 1, 6}));
        assertEquals(12, yatzyGame.score(YatzyCategory.PAIR, new int[] { 2, 6, 3, 1, 6}));
    }

    @Test
    void shouldScoreThreeOfAKind(){
        assertEquals(12, yatzyGame.score(YatzyCategory.THREE_OF_A_KIND, new int[] { 4, 4, 4, 5, 6}));
        assertEquals(15, yatzyGame.score(YatzyCategory.THREE_OF_A_KIND, new int[] { 5, 5, 4, 5, 6}));
    }

}
