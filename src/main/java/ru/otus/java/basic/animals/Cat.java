package ru.otus.java.basic.animals;

public class Cat extends Animal {

  public Cat(String name, int stamina, int runVelocity, int swimVelocity) {
    super(name, stamina, runVelocity, 0);

    animal = "Кот";
    this.runStaminaCost = 1;
  }
}
