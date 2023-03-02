package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    @Test
    void testReturnFizz() {
        assertThat(someService.fizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    void testReturnBuzz() {
        assertThat(someService.fizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    void testReturnFizzBuzz() {
        assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void testReturnEcho() {
        assertThat(someService.fizzBuzz(14)).isEqualTo("" + 14);
    }

    @Test
    void first6Element() {
        assertTrue(someService.firstLast6(new int[]{6, 1, 2, 3}));
    }

    @Test
    void last6Element() {
        assertTrue(someService.firstLast6(new int[]{1, 2, 3, 6}));
    }

    @Test
    void firstLastNo6Element() {
        assertFalse(someService.firstLast6(new int[]{1, 2, 3}));
    }

    // HW3.start Task1
    @Test
    void testDiscount50Percentages() {
        System.out.println(SomeService.calculatingDiscount(2000.0, 10));
        assertThat(SomeService.calculatingDiscount(2000.0, 50))
                .isEqualTo(1000); // обычная скидка
    }

    @Test
    void testDiscount0Percentages() {
        System.out.println(SomeService.calculatingDiscount(2000.0, 10));
        assertThat(SomeService.calculatingDiscount(2000.0, 0))
                .isEqualTo(2000); // обычная скидка
    }

    @Test
    void testDiscount100Percentages() {
        System.out.println(SomeService.calculatingDiscount(2000.0, 10));
        assertThat(SomeService.calculatingDiscount(2000.0, 100))
                .isEqualTo(0); // обычная скидка
    }

    @Test
    void testDiscountPercentageOver100(){
        System.out.println(SomeService.calculatingDiscount(2000.0, 10));
        assertThatThrownBy(() ->
                SomeService.calculatingDiscount(2000.0, 110))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%
    }

    @Test
    void testDiscountPercentageIsNegative(){
        System.out.println(SomeService.calculatingDiscount(2000.0, 10));

        assertThatThrownBy(() ->
                SomeService.calculatingDiscount(2000.0, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
    }

    @Test
    void testNegativeOrderSum(){
        assertThatThrownBy(() ->
                SomeService.calculatingDiscount(-2000.0, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной"); // процент скидки меньше 0
    }
    // HW3.end Task1

    @Test
    void luckySumA() {
        assertThat(someService.luckySum(13, 2, 3)).isEqualTo(5);
    }

    @Test
    void luckySumB() {
        assertThat(someService.luckySum(2, 13, 4)).isEqualTo(6);
    }

    @Test
    void luckySumC() {
        assertThat(someService.luckySum(2, 5, 13)).isEqualTo(7);
    }

    @Test
    void luckySumNot13(){
        assertThat(someService.luckySum(2, 4, 6)).isEqualTo(12);
    }

}