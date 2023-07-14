package com.adventofcode.aoc2022.day3;

import java.util.ArrayList;
import java.util.Arrays;

class PrioritiesSum {
  private int getPriorityOfItemType(char itemType) {
    return Character.isUpperCase(itemType) ? (int) itemType - 38 : (int) itemType - 96;
  }

  int calculateSumOfPrioritiesOfEachRucksack(String input) {
    int sum = 0;

    for (String line : input.split("\n")) {
      Rucksack rucksack = new Rucksack(line);
      char commonItemType = rucksack.findCommonItemTypeBetweenCompartments();
      sum += getPriorityOfItemType(commonItemType);
    }

    return sum;
  }

  int calculateSumOfPrioritiesOfEachGroup(String input) {
    ArrayList<String> inputLines = new ArrayList<>(Arrays.asList(input.split("\n")));
    int sum = 0;

    while (!inputLines.isEmpty()) {
      RucksacksGroup rucksacksGroup = new RucksacksGroup();

      for (int i = 0; i < 3; i++) {
        String line = inputLines.remove(0);
        rucksacksGroup.add(new Rucksack(line));
      }

      sum += getPriorityOfItemType(rucksacksGroup.findBadgeOfGroup());
    }

    return sum;
  }
}
