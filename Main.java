public class Main
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Quiz app");
        QuestionService service = new QuestionService();
        service.displayQuestions();       
    }
}