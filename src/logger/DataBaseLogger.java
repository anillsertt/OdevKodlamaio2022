package logger;

public class DataBaseLogger implements ILoggerService {

    @Override
    public void add() {
        System.out.println("Veri tabanına eklendi");
    }

    @Override
    public void delete() {
        System.out.println("Veri tabanına eklendi");
    }

    @Override
    public void update() {
        System.out.println("Veri tabanına eklendi");
    }
}
