package com.adventofcode.aoc2022.day2;

import com.adventofcode.InputHandler;

public class Main2 {
  public static void main(String[] args) {
    final String input = InputHandler.readInputFromFile("inputs/aoc2022/day2/input.txt");
    ScoreCalculator sc = new ScoreCalculator();

    System.out.println("Total score: " + sc.calculateTotalScorePartTwo(input));
  }
}
