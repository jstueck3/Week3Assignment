package Yahtzee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YahtzeeTest {
    @Test
    void threeOfKind() {
        assertEquals ("threeKind", new YahtzeeHandGame(3));
    }
    @Test
    void fourOfKind() {
        assertEquals("fourKind", new YahtzeeHandGame(4));
    }

    private String convert(int i) {
        return null;
    }
    @Test
    void fullHouse() {
        assertEquals("fullHouse", new YahtzeeHandGame(3 + 3));
    }
    @Test
    void Yahtzee() {
        assertEquals("Yahtzee", new YahtzeeHandGame(5));
    }
    @Test
    void twoPair() {
        assertEquals("twoPair", new YahtzeeHandGame(2));
    }
    @Test
    void onePair() {
        assertEquals("onePair", new YahtzeeHandGame(1));
    }
    @Test
    void oneOfKind() {
        assertEquals("oneOfKind", new YahtzeeHandGame(1));
    }

}


