package ru.otus.java.basic.animals;

import com.google.common.base.Joiner;

public abstract class Animal {

  String animal;
  String name;
  int stamina;
  boolean fatigue;
  int runVelocity;
  int swimVelocity;
  boolean canRun;
  boolean canSwim;
  int runStaminaCost;
  int swimStaminaCost;

  /**
   * Конструктор для создания животного. Отрицательные выносливость и скорости приводятся к значению
   * 0 в состоянии животного.
   *
   * @param name         имя
   * @param stamina      выносливость
   * @param runVelocity  скорость бега
   * @param swimVelocity скорость плавания
   */
  Animal(String name, int stamina, int runVelocity, int swimVelocity) {
    this.name = name;
    this.stamina = stamina;
    this.runVelocity = Math.max(runVelocity, 0);
    this.canRun = runVelocity > 0;
    this.swimVelocity = Math.max(swimVelocity, 0);
    this.canSwim = swimVelocity > 0;
  }

  /**
   * При скорости бега 0 животное не умеет бегать, при выносливости 0 животное отказывается бегать.
   * Если дистанция бега меньше нуля, то выводим соответствующее сообщение.
   *
   * @param distance дистанция для бега
   * @return время, необходимое для преодоления дистанции
   */
  public int run(int distance) {
    Joiner msg = Joiner.on(" ");

    if (distance <= 0) {
      System.out.println("Необходимо указать дистанцию больше 0");
      return -1;
    }

    if (!canRun) {
      System.out.println(msg.join(name, "не умеет бегать"));
      return -1;
    }

    if (stamina == 0) {
      System.out.println(msg.join(name, "имеет выносливость 0 и не может бегать"));
      return -1;
    }

    if (stamina < runStaminaCost * distance) {
      System.out.println(msg.join(
          name, "не имеет достаточно выносливости для бега на дистанцию", distance, "метров"));
      return -1;
    }

    stamina -= runStaminaCost * distance;
    System.out.println(
        msg.join(name, "пробежал дистанцию", distance, "метров", "за", distance / runStaminaCost,
            "секунд"));
    return distance / runVelocity;

  }

  /**
   * При скорости плавания 0 животное не умеет бегать, при выносливости 0 животное отказывается
   * плавать. Если дистанция плавания меньше нуля, то выводим соответствующее сообщение.
   *
   * @param distance дистанция для плавания
   * @return время, необходимое для преодоления дистанции
   */
  public int swim(int distance) {
    Joiner msg = Joiner.on(" ");

    if (distance <= 0) {
      System.out.println("Необходимо указать дистанцию больше 0");
      return -1;
    }

    if (!canSwim) {
      System.out.println(msg.join(name, "не умеет плавать"));
      return -1;
    }

    if (stamina == 0) {
      System.out.println(msg.join(name, "имеет выносливость 0 и не может плавать"));
      return -1;
    }

    if (stamina < swimStaminaCost * distance) {
      System.out.println(msg.join(
          name, "не имеет достаточно выносливости для плавания на дистанцию", distance, "метров"));
      return -1;
    }

    stamina -= swimStaminaCost * distance;
    System.out.println(stamina);

    System.out.println(
        msg.join(name, "проплыл дистанцию", distance, "метров", "за", distance / swimVelocity,
            "секунд"));
    return distance / swimVelocity;
  }

  /**
   * Выводит информацию о животном: имя и оставшуюся выносливость
   */
  public void printInfo() {
    Joiner info = Joiner.on(" ");
    System.out.println(info.join(animal, "по имени", name, "имеет выносливость", stamina));
  }
}
