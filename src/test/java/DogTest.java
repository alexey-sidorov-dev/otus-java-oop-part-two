import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.java.basic.animals.Dog;

public class DogTest {

  Dog normalDog = new Dog("Мухтар", 20, 2, 1);
  Dog zeroStaminaDog = new Dog("Шарик", 0, 1, 100);
  Dog negativeVelocityDog = new Dog("Барбос>", 20, -10, -100);

  @Test
  public void testDog() {
    Assertions.assertDoesNotThrow(() -> new Dog("Трезор", 37, 3, 2));
    Assertions.assertDoesNotThrow(() -> new Dog("Белка", -37, 3, 2));
    Assertions.assertDoesNotThrow(() -> new Dog("Туман", 37, -3, -2));
  }

  @Test
  public void testRunNormalDog() {
    Assertions.assertEquals(-1, normalDog.run(0));
    Assertions.assertEquals(-1, normalDog.run(-10));
    Assertions.assertEquals(-1, normalDog.run(100));
    Assertions.assertEquals(4, normalDog.run(8));
    Assertions.assertEquals(-1, normalDog.run(20));
    Assertions.assertEquals(6, normalDog.run(12));
    Assertions.assertEquals(-1, normalDog.run(1));
  }

  @Test
  public void testRunZeroStaminaDog() {
    Assertions.assertEquals(-1, zeroStaminaDog.run(0));
    Assertions.assertEquals(-1, zeroStaminaDog.run(-10));
    Assertions.assertEquals(-1, zeroStaminaDog.run(5));
    Assertions.assertEquals(-1, zeroStaminaDog.run(999));
  }

  @Test
  public void testRunNegativeVelocityDog() {
    Assertions.assertEquals(-1, negativeVelocityDog.run(0));
    Assertions.assertEquals(-1, negativeVelocityDog.run(-10));
    Assertions.assertEquals(-1, negativeVelocityDog.run(5));
    Assertions.assertEquals(-1, negativeVelocityDog.run(999));
  }

  @Test
  public void testSwimNormalDog() {
    Assertions.assertEquals(-1, normalDog.swim(0));
    Assertions.assertEquals(-1, normalDog.swim(-10));
    Assertions.assertEquals(-1, normalDog.swim(100));
    Assertions.assertEquals(8, normalDog.swim(8));
    Assertions.assertEquals(-1, normalDog.swim(20));
    Assertions.assertEquals(2, normalDog.swim(2));
    Assertions.assertEquals(-1, normalDog.swim(1));
  }

  @Test
  public void testSwimZeroStaminaDog() {
    Assertions.assertEquals(-1, zeroStaminaDog.swim(0));
    Assertions.assertEquals(-1, zeroStaminaDog.swim(-10));
    Assertions.assertEquals(-1, zeroStaminaDog.swim(5));
    Assertions.assertEquals(-1, zeroStaminaDog.swim(999));
  }

  @Test
  public void testSwimNegativeVelocityDog() {
    Assertions.assertEquals(-1, negativeVelocityDog.swim(0));
    Assertions.assertEquals(-1, negativeVelocityDog.swim(-10));
    Assertions.assertEquals(-1, negativeVelocityDog.swim(10));
    Assertions.assertEquals(-1, negativeVelocityDog.swim(999));
  }

  @Test
  public void testInfo() {
    Assertions.assertDoesNotThrow(() -> normalDog.printInfo());
    Assertions.assertDoesNotThrow(() -> zeroStaminaDog.printInfo());
    Assertions.assertDoesNotThrow(() -> negativeVelocityDog.printInfo());
  }
}
