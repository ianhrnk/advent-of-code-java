package com.adventofcode.aoc2022.day3;

import java.util.HashSet;

class Rucksack {
  private String firstCompartment;
  private String secondCompartment;

  Rucksack(String input) {
    int length = input.length();
    firstCompartment = input.substring(0, length / 2);
    secondCompartment = input.substring(length / 2, length);
  }

  char findCommonItemTypeBetweenCompartments() {
    HashSet<Character> h1 = new HashSet<Character>(), h2 = new HashSet<Character>();

    for (int i = 0; i < firstCompartment.length(); i++) {
      h1.add(firstCompartment.charAt(i));
      h2.add(secondCompartment.charAt(i));
    }

    h1.retainAll(h2);
    return h1.toString().charAt(1);
  }

  @Override
  public String toString() {
    return firstCompartment + secondCompartment;
  }
}
