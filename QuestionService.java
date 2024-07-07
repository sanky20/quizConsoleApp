import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");

    }

    public void playQuiz() {

        for (Question q : questions) {
            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("-> " + q.getOpt1());
            System.out.println("-> " + q.getOpt2());
            System.out.println("-> " + q.getOpt3());
            System.out.println("-> " + q.getOpt4());
            System.out.println("Enter your answer");
            Scanner sc = new Scanner(System.in);
            selection[q.getId() - 1] = sc.nextLine();
        }
        System.out.println("Your answers are ");
        for (String s : selection) {

            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;

        // for(Question q: questions)
        // {
        // if(q.getAnswer().equals(selection[q.getId()-1]) )
        // {
        // score++;
        // }
        // }

        for (int i = 0; i < 5; i++) {
            if (questions[i].getAnswer().equals(selection[i])) {
                score++;
            }
        }
        System.out.println("Your score is: " + score);

    }

}
