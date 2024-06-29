package quiz_app;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "oldest language", "Java", "C", "Python", "C_Sharp", "C");
        questions[1] = new Question(2, "easy language", "Java", "C", "Python", "C_Sharp", "Python");
        questions[2] = new Question(3, "Oracle language", "Java", "C", "Python", "C_Sharp", "Java");
        questions[3] = new Question(4, "fast language", "Java", "C", "Python", "C_Sharp", "C");
        questions[4] = new Question(5, "object-oriented language", "Java", "C", "Python", "C_Sharp", "Java");
    }

    public void playQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            System.out.println("Question no: " + question.getId());
            System.out.println(question.getQuestion());
            System.out.println("A: " + question.getOption1());
            System.out.println("B: " + question.getOption2());
            System.out.println("C: " + question.getOption3());
            System.out.println("D: " + question.getOption4());
            System.out.print("Your answer: ");

            String userAnswer = scanner.nextLine().trim();
            String correctAnswer = question.getCorrectAnswer();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                score++;
            }
        }

        System.out.println("Your score: " + score + "/" + questions.length);
        scanner.close();
    }
}
