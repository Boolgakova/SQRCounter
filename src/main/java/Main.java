import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService number = new SQRService();
        System.out.println(number.counter(100, 1000));
    }
}
