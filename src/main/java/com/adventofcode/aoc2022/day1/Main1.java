package com.adventofcode.aoc2022.day1;

import com.adventofcode.InputHandler;

public class Main1 {
  public static void main(String[] args) {
    CalorieCounter cc = new CalorieCounter();
    final String input = InputHandler.readInputFromFile("inputs/aoc2022/day1/input.txt");

    System.out.println("Max calories: " + cc.calculateMaxCalories(input));
    System.out.println("Sum of top three calories: " + cc.calculateTopThreeSumCalories(input));
  }
}
