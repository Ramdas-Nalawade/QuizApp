import java.util.Scanner;

public class QuestionService
{
    Question[] questions = new Question[5];
    String[] selectedAnswer = new String[5];

    public QuestionService() 
    {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void playQuiz()
    {
        int i = 0;

        for(Question q: questions)
        {
            System.out.println(q.getId()+". "+q.getQuestion());
            System.out.println(q.getOp1());
            System.out.println(q.getOp2());
            System.out.println(q.getOp3());
            System.out.println(q.getOp4());
            Scanner sc = new Scanner(System.in);
            selectedAnswer[i++] = sc.next();
        }

        // for(String s: selectedAnswer)
        // {
        //     System.out.println(s);
        // }
    }

    public void calculateAndPrintScore()
    {
        int score = 0;

        for(int i = 0; i < questions.length; i++)
        {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();

            String userAnswer = selectedAnswer[i];

            if(actualAnswer.equals(userAnswer))
                score++;
        }
        System.out.println("Your score is: "+score);
    }
}