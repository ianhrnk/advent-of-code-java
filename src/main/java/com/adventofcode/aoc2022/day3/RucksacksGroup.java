package com.adventofcode.aoc2022.day3;

import java.util.ArrayList;

class RucksacksGroup {
  private ArrayList<Rucksack> rucksacks = new ArrayList<Rucksack>();

  void add(Rucksack rucksack) {
    rucksacks.add(rucksack);
  }

  char findBadgeOfGroup() {
    String firstRucksack = rucksacks.get(0).toString();
    String secondRucksack = rucksacks.get(1).toString();
    String thirdRucksack = rucksacks.get(2).toString();

    for (int i = 0; i < firstRucksack.length(); i++) {
      String item = firstRucksack.substring(i, i+1);

      if (secondRucksack.contains(item) && thirdRucksack.contains(item))
        return item.charAt(0); // Returns here because the puzzle always has solution
    }

    return 0;
  }
}
