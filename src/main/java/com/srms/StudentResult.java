
package com.srms;

public class StudentResult {

    // Operation 1: Calculate total marks
    public int calculateTotal(int mark1, int mark2, int mark3) {
        validateMarks(mark1, mark2, mark3);
        return mark1 + mark2 + mark3;
    }

    // Operation 2: Calculate percentage
    public double calculatePercentage(int mark1, int mark2, int mark3) {
        int total = calculateTotal(mark1, mark2, mark3);
        return total / 3.0;
    }

    // Operation 3: Determine grade
    public String calculateGrade(int mark1, int mark2, int mark3) {
        double percentage = calculatePercentage(mark1, mark2, mark3);

        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        return "F";
    }

    private void validateMarks(int... marks) {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException(
                    "Marks must be between 0 and 100."
                );
            }
        }
    }
}
