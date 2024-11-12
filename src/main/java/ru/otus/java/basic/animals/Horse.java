package ru.otus.java.basic.animals;

public class Horse extends Animal {

  public Horse(String name, int stamina, int runVelocity, int swimVelocity) {
    super(name, stamina, runVelocity, swimVelocity);

    animal = "Лошадь";
    this.runStaminaCost = 1;
    this.swimStaminaCost = 4;
  }
}
