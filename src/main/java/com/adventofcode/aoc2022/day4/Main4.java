package com.adventofcode.aoc2022.day4;

import com.adventofcode.InputHandler;

public class Main4 {
  public static void main(String[] args) {
    final String input = InputHandler.readInputFromFile("inputs/aoc2022/day4/input.txt");
    CampCleanup cc = new CampCleanup();

    // Part one
    System.out.println(cc.findFullyAssignmentsOverlap(input));

    // Part two
    System.out.println(cc.findAssignmentsOverlap(input));
  }
}
