package logger;

public class EmailLogger implements  ILoggerService{
    @Override
    public void add() {
        System.out.println("Email gönderildi");
    }

    @Override
    public void delete() {
        System.out.println("Email iptal edildi");
    }

    @Override
    public void update() {
        System.out.println("Email tekrar gönderildi");
    }
}
