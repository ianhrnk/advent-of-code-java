package com.adventofcode.aoc2022.day3;

import com.adventofcode.InputHandler;

public class Main3 {
  public static void main(String[] args) {
    final String input = InputHandler.readInputFromFile("inputs/aoc2022/day3/example.txt");
    PrioritiesSum ps = new PrioritiesSum();

    // Part one
    System.out.println(ps.calculateSumOfPrioritiesOfEachRucksack(input));

    // Part two
    System.out.println(ps.calculateSumOfPrioritiesOfEachGroup(input));
  }
}
