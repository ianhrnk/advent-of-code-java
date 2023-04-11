package com.adventofcode.aoc2022.day2;

import java.util.HashMap;

class ScoreCalculator {
  int totalScore = 0;
  HashMap<String, Integer> possibleResults = new HashMap<>();
  HashMap<String, Character> shapeIndications = new HashMap<>();
  HashMap<Character, Integer> shapeValues = new HashMap<>();
  HashMap<Character, Integer> scoreOutcome = new HashMap<>();

  ScoreCalculator() {
    initPossibleResults();
    initShapeIndications();
    initShapeValues();
    initScoreOutcome();
  }

  private void initPossibleResults() {
    possibleResults.put("A X", 3);
    possibleResults.put("A Y", 6);
    possibleResults.put("A Z", 0);
    possibleResults.put("B X", 0);
    possibleResults.put("B Y", 3);
    possibleResults.put("B Z", 6);
    possibleResults.put("C X", 6);
    possibleResults.put("C Y", 0);
    possibleResults.put("C Z", 3);
  }

  private void initShapeIndications() {
    shapeIndications.put("A X", 'Z');
    shapeIndications.put("A Y", 'X');
    shapeIndications.put("A Z", 'Y');
    shapeIndications.put("B X", 'X');
    shapeIndications.put("B Y", 'Y');
    shapeIndications.put("B Z", 'Z');
    shapeIndications.put("C X", 'Y');
    shapeIndications.put("C Y", 'Z');
    shapeIndications.put("C Z", 'X');
  }

  private void initShapeValues() {
    shapeValues.put('X', 1);
    shapeValues.put('Y', 2);
    shapeValues.put('Z', 3);
  }

  private void initScoreOutcome() {
    scoreOutcome.put('X', 0);
    scoreOutcome.put('Y', 3);
    scoreOutcome.put('Z', 6);
  }

  int calculateTotalScorePartOne(String input) {
    for (String round : input.split("\n"))
      totalScore += possibleResults.get(round) + shapeValues.get(round.charAt(2));

    return totalScore;
  }

  int calculateTotalScorePartTwo(String input) {
    for (String round : input.split("\n"))
      totalScore += scoreOutcome.get(round.charAt(2)) + shapeValues.get(shapeIndications.get(round));

    return totalScore;
  }
}
