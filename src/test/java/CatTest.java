import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.java.basic.animals.Cat;

public class CatTest {

  Cat normalCat = new Cat("Матроскин", 20, 1, 100);
  Cat zeroStaminaCat = new Cat("Матроскин", 0, 1, 100);
  Cat negativeVelocityCat = new Cat("Матроскин", 20, -10, 100);

  @Test
  public void testCat() {
    Assertions.assertDoesNotThrow(() -> new Cat("Каспер", 42, 2, 50));
    Assertions.assertDoesNotThrow(() -> new Cat("Масик", 0, 10, 50));
    Assertions.assertDoesNotThrow(() -> new Cat("Муська", 0, -10, 50));
    Assertions.assertDoesNotThrow(() -> new Cat("Басик", 42, 2, -50));

  }

  @Test
  public void testRunNormalCat() {
    Assertions.assertEquals(-1, normalCat.run(0));
    Assertions.assertEquals(-1, normalCat.run(-10));
    Assertions.assertEquals(-1, normalCat.run(100));
    Assertions.assertEquals(5, normalCat.run(5));
    Assertions.assertEquals(-1, normalCat.run(20));
    Assertions.assertEquals(15, normalCat.run(15));
    Assertions.assertEquals(-1, normalCat.run(1));
  }

  @Test
  public void testRunZeroStaminaCat() {
    Assertions.assertEquals(-1, zeroStaminaCat.run(0));
    Assertions.assertEquals(-1, zeroStaminaCat.run(-10));
    Assertions.assertEquals(-1, zeroStaminaCat.run(5));
    Assertions.assertEquals(-1, zeroStaminaCat.run(999));
  }

  @Test
  public void testRunNegativeVelocityCat() {
    Assertions.assertEquals(-1, negativeVelocityCat.run(0));
    Assertions.assertEquals(-1, negativeVelocityCat.run(-10));
    Assertions.assertEquals(-1, negativeVelocityCat.run(5));
    Assertions.assertEquals(-1, negativeVelocityCat.run(999));
  }

  @Test
  public void testSwim() {
    Assertions.assertEquals(-1, normalCat.swim(0));
    Assertions.assertEquals(-1, normalCat.swim(-5));
    Assertions.assertEquals(-1, normalCat.swim(5));
    Assertions.assertEquals(-1, zeroStaminaCat.swim(0));
    Assertions.assertEquals(-1, zeroStaminaCat.swim(-5));
    Assertions.assertEquals(-1, zeroStaminaCat.swim(5));
    Assertions.assertEquals(-1, negativeVelocityCat.swim(5));
    Assertions.assertEquals(-1, negativeVelocityCat.swim(5));
    Assertions.assertEquals(-1, negativeVelocityCat.swim(5));
  }

  @Test
  public void testInfo() {
    Assertions.assertDoesNotThrow(() -> normalCat.printInfo());
    Assertions.assertDoesNotThrow(() -> zeroStaminaCat.printInfo());
    Assertions.assertDoesNotThrow(() -> negativeVelocityCat.printInfo());
  }
}
