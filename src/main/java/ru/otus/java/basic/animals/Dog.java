package ru.otus.java.basic.animals;

public class Dog extends Animal {

  public Dog(String name, int stamina, int runVelocity, int swimVelocity) {
    super(name, stamina, runVelocity, swimVelocity);

    animal = "Собака";
    this.runStaminaCost = 1;
    this.swimStaminaCost = 2;
  }
}
