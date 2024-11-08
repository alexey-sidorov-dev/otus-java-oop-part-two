# Домашнее задание курса [OTUS Java Developer. Basic](https://otus.ru/lessons/java-basic/)

## ООП в Java. Наследование и полиморфизм.

---
[![Actions Status](https://github.com/alexey-sidorov-dev/otus-java-oop-part-two/workflows/Build/badge.svg)](https://github.com/alexey-sidorov-dev/otus-java-oop-part-two/actions)
[![Actions Status](https://github.com/alexey-sidorov-dev/otus-java-oop-part-two/workflows/Check/badge.svg)](https://github.com/alexey-sidorov-dev/otus-java-oop-part-two/actions)
[![LICENSE](https://img.shields.io/badge/license-ISC-brightgreen.svg)](ISC)

### Цель

Научиться работать с наследованием и полиморфизмом в Java.

### Задания

1. Создать классы _Cat_, _Dog_ и _Horse_ с наследованием от класса Animal;
2. У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах);
3. Затраты выносливости:
    - Все животные на 1 метр бега тратят 1 единицы выносливости.
    - Собаки на 1 метр плавания тратят 2 единицы выносливости.
    - Лошади на 1 метр плавания тратят 4 единицы выносливости.
    - Кот плавать не умеет.

4. Реализовать методы _run(int distance)_ и _swim(int distance)_, которые должны возвращать время, затраченное на
   указанное
   действие, и понижать выносливость животного. Если выносливости не хватает, то возвращать время -1 и указывать, что у
   животного появилось состояние усталости. При выполнении действий писать сообщения в консоль.
5. Добавить метод _info()_, который выводит в консоль состояние животного.


