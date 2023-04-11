package com.adventofcode.aoc2022.day2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.adventofcode.BasePuzzleTest;

class PuzzleTestDay2 extends BasePuzzleTest {
  private final ScoreCalculator sc = new ScoreCalculator();

  @Test
  void partOneExampleTest() {
    final String input = readInputFromFile("inputs/aoc2022/day2/example.txt");
    final int totalScore = sc.calculateTotalScorePartOne(input);

    assertEquals(15, totalScore);
  }

  @Test
  void partOneInputTest() {
    final String input = readInputFromFile("inputs/aoc2022/day2/input.txt");
    final int totalScore = sc.calculateTotalScorePartOne(input);

    assertEquals(11150, totalScore);
  }

  @Test
  void partTwoExampleTest() {
    final String input = readInputFromFile("inputs/aoc2022/day2/example.txt");
    final int totalScore = sc.calculateTotalScorePartTwo(input);

    assertEquals(12, totalScore);
  }

  @Test
  void partTwoInputTest() {
    final String input = readInputFromFile("inputs/aoc2022/day2/input.txt");
    final int totalScore = sc.calculateTotalScorePartOne(input);

    assertEquals(8295, totalScore);
  }
}
