import ru.netology.CalcSQRNumbers.services.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrs(200, 300));

    }
}