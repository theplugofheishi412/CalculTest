package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CalculTest {

    @Test
    void sum(){
        assertEquals(5,Calcul.sum(2,3));
    }
}