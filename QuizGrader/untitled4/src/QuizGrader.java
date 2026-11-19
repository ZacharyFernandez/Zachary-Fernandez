// Gumagawa ng class na may pangalang QuizGrader (dapat kapareho ng filename).
class QuizGrader {
    // Nagsisimula rito ang programa kapag ni-run mo ito.
    public static void main(String[] args) {

        // Tamang sagot para sa 10 tanong.
        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};
        // Mga sagot ng estudyante para sa 10 tanong.
        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};

        // Bilang ng mga tamang sagot; nagsisimula sa 0.
        int correctCount = 0;

        // I-check ang bawat tanong mula index 0 hanggang 9.
        for (int i = 0; i < answerKey.length; i++) {
            // Kung pareho ang sagot ng estudyante at ang answer key:
            if (studentAnswers[i] == answerKey[i]) {
                // Magdadagdag ng 1 sa correctCount.
                correctCount++;
            }
        }

        // Kinukuha ang porsyento: (tamang sagot / 10) * 100.
        double scorePercentage = ((double) correctCount / answerKey.length) * 100;

        // Ipi-print ang bilang ng tamang sagot at ang porsyento.
        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);
        // Ipi-print ang scorePercentage.
        System.out.println("Score Percentage: " + scorePercentage + "%");

        // Kung 70.0 o pataas ang porsyento, PASS; kung hindi, FAIL.
        if (scorePercentage >= 70.0) {
            // Ipi-print na pasado ang estudyante.
            System.out.println("Result: PASS");
        } else {
            // Ipi-print na bagsak ang estudyante.
            System.out.println("Result: FAIL");
        }
    }
}
