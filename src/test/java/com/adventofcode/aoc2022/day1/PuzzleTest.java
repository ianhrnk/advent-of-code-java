package com.adventofcode.aoc2022.day1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.adventofcode.BasePuzzleTest;

class Day1PuzzleTest extends BasePuzzleTest {
  private final CalorieCounter counter = new CalorieCounter();

  @Test
  void partOneExampleTest() {
    final String input = readInputFromFile("inputs/aoc2022/day1/example.txt");
    final int maxCalories = counter.calculateMaxCalories(input);

    assertEquals(24000, maxCalories);
  }

  @Test
  void partOneInputTest() {
    final String input = readInputFromFile("inputs/aoc2022/day1/input.txt");
    final int maxCalories = counter.calculateMaxCalories(input);

    assertEquals(69289, maxCalories);
  }

  @Test
  void partTwoExampleTest() {
    final String input = readInputFromFile("inputs/aoc2022/day1/example.txt");
    final int sumCalories = counter.calculateTopThreeSumCalories(input);

    assertEquals(45000, sumCalories);
  }

  @Test
  void partTwoInputTest() {
    final String input = readInputFromFile("inputs/aoc2022/day1/input.txt");
    final int sumCalories = counter.calculateTopThreeSumCalories(input);

    assertEquals(205615, sumCalories);
  }
}
