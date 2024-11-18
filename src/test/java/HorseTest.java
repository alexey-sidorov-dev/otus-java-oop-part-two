import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.java.basic.animals.Horse;

public class HorseTest {

  Horse normalHorse = new Horse("Абсент", 30, 3, 1);
  Horse zeroStaminaHorse = new Horse("Маренго", 0, 1, 100);
  Horse negativeVelocityHorse = new Horse("Цинциннати", 20, -10, -100);

  @Test
  public void testHorse() {
    Assertions.assertDoesNotThrow(() -> new Horse("Росинант", 37, 3, 2));
    Assertions.assertDoesNotThrow(() -> new Horse("Буцефал", -37, 3, 2));
    Assertions.assertDoesNotThrow(() -> new Horse("Лизетта", 37, -3, -2));
  }

  @Test
  public void testNormalHorse() {
    Assertions.assertEquals(-1, normalHorse.run(0));
    Assertions.assertEquals(-1, normalHorse.run(-10));
    Assertions.assertEquals(-1, normalHorse.run(100));
    Assertions.assertEquals(5, normalHorse.run(15));
    Assertions.assertEquals(-1, normalHorse.run(20));
    Assertions.assertEquals(5, normalHorse.run(15));
    Assertions.assertEquals(-1, normalHorse.run(1));
  }

  @Test
  public void testRunZeroStaminaHorse() {
    Assertions.assertEquals(-1, zeroStaminaHorse.run(0));
    Assertions.assertEquals(-1, zeroStaminaHorse.run(-10));
    Assertions.assertEquals(-1, zeroStaminaHorse.run(5));
    Assertions.assertEquals(-1, zeroStaminaHorse.run(999));
  }

  @Test
  public void testRunNegativeVelocityHorse() {
    Assertions.assertEquals(-1, negativeVelocityHorse.run(0));
    Assertions.assertEquals(-1, negativeVelocityHorse.run(-10));
    Assertions.assertEquals(-1, negativeVelocityHorse.run(5));
    Assertions.assertEquals(-1, negativeVelocityHorse.run(999));
  }

  @Test
  public void testSwimNormalHorse() {
    Assertions.assertEquals(-1, normalHorse.swim(0));
    Assertions.assertEquals(-1, normalHorse.swim(-10));
    Assertions.assertEquals(-1, normalHorse.swim(100));
    Assertions.assertEquals(5, normalHorse.swim(5));
    Assertions.assertEquals(-1, normalHorse.swim(20));
    Assertions.assertEquals(2, normalHorse.swim(2));
    Assertions.assertEquals(-1, normalHorse.swim(1));
  }

  @Test
  public void testSwimZeroStaminaHorse() {
    Assertions.assertEquals(-1, zeroStaminaHorse.swim(0));
    Assertions.assertEquals(-1, zeroStaminaHorse.swim(-10));
    Assertions.assertEquals(-1, zeroStaminaHorse.swim(5));
    Assertions.assertEquals(-1, zeroStaminaHorse.swim(999));
  }

  @Test
  public void testSwimNegativeVelocityHorse() {
    Assertions.assertEquals(-1, negativeVelocityHorse.swim(0));
    Assertions.assertEquals(-1, negativeVelocityHorse.swim(-10));
    Assertions.assertEquals(-1, negativeVelocityHorse.swim(10));
    Assertions.assertEquals(-1, negativeVelocityHorse.swim(999));
  }

  @Test
  public void testInfo() {
    Assertions.assertDoesNotThrow(() -> normalHorse.printInfo());
    Assertions.assertDoesNotThrow(() -> zeroStaminaHorse.printInfo());
    Assertions.assertDoesNotThrow(() -> negativeVelocityHorse.printInfo());
  }
}