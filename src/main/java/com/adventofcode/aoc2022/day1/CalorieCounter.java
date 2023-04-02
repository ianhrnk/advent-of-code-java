package com.adventofcode.aoc2022.day1;

class CalorieCounter {
  int sum;

  int calculateMaxCalories(String input) {
    int maxCalories = 0;

    for (String caloriesByElf : input.split("\n\n")) {
      sum = 0;

      for (String calory : caloriesByElf.split("\n"))
        sum += Integer.parseInt(calory);

      if (sum > maxCalories)
        maxCalories = sum;
    }

    return maxCalories;
  }

  int calculateTopThreeSumCalories(String input) {
    Integer[] topThree = { 0, 0, 0 };
    int sum;

    for (String caloriesByElf : input.split("\n\n")) {
      sum = 0;

      for (String calory : caloriesByElf.split("\n"))
        sum += Integer.parseInt(calory);

      for (int i = 2; i >= 0; i--) {
        if (sum > topThree[i]) {
          if (i == 2) {
            topThree[0] = topThree[1];
            topThree[1] = topThree[2];
            topThree[2] = sum;
            break;
          } else if (i == 1) {
            topThree[0] = topThree[1];
            topThree[1] = sum;
            break;
          } else {
            topThree[0] = sum;
          }
        }
      }
    }

    return topThree[0] + topThree[1] + topThree[2];
  }
}
