package chapter12;

import java.util.HashMap;
import java.util.Map;

public class TestFinalScores extends TestResults {

    public static void main(String[] args) {
        Map<String, Integer> highestGrade = getHighestGrades();
        System.out.println("Highest Grades: " + highestGrade);
    }

    public static Map<String, Integer> getHighestGrades() {

        Map<String, Integer> originalGrades = getOriginalGrades();
        Map<String, Integer> makeUpGrades = getMakeUpGrades();
        Map<String, Integer> highestGrades = new HashMap<>();

        for (String name : originalGrades.keySet()) {
            int grade1 = originalGrades.get(name);
            int grade2 = makeUpGrades.get(name);

            highestGrades.put(name, Math.max(grade1, grade2));
        }

        return highestGrades;
    }
}
