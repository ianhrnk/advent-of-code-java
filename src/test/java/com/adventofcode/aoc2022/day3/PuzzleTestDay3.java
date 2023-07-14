package com.adventofcode.aoc2022.day3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.adventofcode.BasePuzzleTest;

class PuzzleTestDay3 extends BasePuzzleTest {
  private final PrioritiesSum ps = new PrioritiesSum();

  @Test
  void partOneExampleTest() {
    final String input = readInputFromFile("inputs/aoc2022/day3/example.txt");
    final int prioritiesSum = ps.calculateSumOfPrioritiesOfEachRucksack(input);

    assertEquals(157, prioritiesSum);
  }

  @Test
  void partOneInputTest() {
    final String input = readInputFromFile("inputs/aoc2022/day3/input.txt");
    final int prioritiesSum = ps.calculateSumOfPrioritiesOfEachRucksack(input);

    assertEquals(7863, prioritiesSum);
  }

  @Test
  void partTwoExampleTest() {
    final String input = readInputFromFile("inputs/aoc2022/day3/example.txt");
    final int prioritiesSum = ps.calculateSumOfPrioritiesOfEachGroup(input);

    assertEquals(70, prioritiesSum);
  }

  @Test
  void partTwoInputTest() {
    final String input = readInputFromFile("inputs/aoc2022/day3/input.txt");
    final int prioritiesSum = ps.calculateSumOfPrioritiesOfEachGroup(input);

    assertEquals(2488, prioritiesSum);
  }
}
