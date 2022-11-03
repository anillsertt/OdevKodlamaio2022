package logger;

public class FileLogger implements ILoggerService{
    @Override
    public void add() {
        System.out.println("Dosyaya eklendi");
    }

    @Override
    public void delete() {
        System.out.println("Dosyaya silindi");
    }

    @Override
    public void update() {
        System.out.println("Dosyaya güncellendi");
    }
}
