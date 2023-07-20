package com.adventofcode.aoc2022.day4;

class CampCleanup {
  private String[] assignments = new String[2];
  private int[] sections = new int[4];  // list of section assignment pairs for each elf

  int findFullyAssignmentsOverlap(String input) {
    int count = 0;

    for (String pair : input.split("\n")) {
      assignments = pair.split(",");

      for (int i = 0, j = 0; i < 2; ++i) {
        for (String sectionId : assignments[i].split("-")) {
          sections[j] = Integer.parseInt(sectionId);
          j++;
        }
      }

      if (assignmentsFullyOverlaps())
        count++;
    }

    return count;
  }

  int findAssignmentsOverlap(String input) {
    int count = 0;

    for (String pair : input.split("\n")) {
      assignments = pair.split(",");

      for (int i = 0, j = 0; i < 2; ++i) {
        for (String sectionId : assignments[i].split("-")) {
          sections[j] = Integer.parseInt(sectionId);
          j++;
        }
      }

      if (assignmentsFullyOverlaps() || assignmentsOverlaps())
        count++;
    }

    return count;
  }

  private boolean assignmentsFullyOverlaps() {
    if ((sections[0] <= sections[2] && sections[3] <= sections[1]) ||
        (sections[2] <= sections[0] && sections[1] <= sections[3]))
      return true;
    return false;
  }

  private boolean assignmentsOverlaps() {
    if ((sections[0] >= sections[2] && sections[0] <= sections[3]) ||
        (sections[1] >= sections[2] && sections[1] <= sections[3]))
      return true;
    return false;
  }
}
