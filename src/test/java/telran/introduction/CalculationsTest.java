package telran.introduction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static telran.introduction.Calculations.*;

import org.junit.jupiter.api.Test;

public class CalculationsTest {
@Test
void sumTest() {
assertEquals(4, sum(2, 2));
}
@Test
void multTest() {
    assertEquals(25, multiply(5, 5));
    }
@Test
void divTest() {
    assertEquals(4, divide(8, 2));
    }   
@Test
void subsTest() {
    assertEquals(4, substract(6, 2));
    }   
 @Test
void sumOfDigTest() {
    assertEquals(9, sumOfDigits(162));
    } 
 @Test
void maxDigTest() {
    assertEquals(9, maxDigit(659));
    } 
@Test
void isDivideTest() {
    assertEquals(true, isDivideOn(6, 3));
    } 
}
