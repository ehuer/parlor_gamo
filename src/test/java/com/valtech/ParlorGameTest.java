package com.valtech;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.valtech.ParlorGame;

class ParlorGameTest {

    // private final Calculator calculator = new Calculator();

    @Test
    void score() {
        assertEquals(0, ParlorGame.score());
    }

}

