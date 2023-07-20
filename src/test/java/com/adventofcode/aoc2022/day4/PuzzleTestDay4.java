package com.adventofcode.aoc2022.day4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.adventofcode.BasePuzzleTest;

class PuzzleTestDay4 extends BasePuzzleTest {
  private final CampCleanup cc = new CampCleanup();

  @Test
  void partOneExampleTest() {
    final String input = readInputFromFile("inputs/aoc2022/day4/example.txt");
    final int count = cc.findFullyAssignmentsOverlap(input);

    assertEquals(2, count);
  }

  @Test
  void partOneInputTest() {
    final String input = readInputFromFile("inputs/aoc2022/day4/input.txt");
    final int count = cc.findFullyAssignmentsOverlap(input);

    assertEquals(576, count);
  }

  @Test
  void partTwoExampleTest() {
    final String input = readInputFromFile("inputs/aoc2022/day4/example.txt");
    final int count = cc.findAssignmentsOverlap(input);

    assertEquals(4, count);
  }

  @Test
  void partTwoInputTest() {
    final String input = readInputFromFile("inputs/aoc2022/day4/input.txt");
    final int count = cc.findAssignmentsOverlap(input);

    assertEquals(905, count);
  }
}
