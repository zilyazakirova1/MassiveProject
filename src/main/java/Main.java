import ru.netology.stats.SalesService;

public class Main {
    public static void main(String[] args) {

        int[] sales = {
                8,15,13,15,17,20,19,20,7,14,14,18
        };

        SalesService service=new SalesService();

        System.out.println("Сумма всех продаж: "+service.sumSales(sales));
        System.out.println("Средняя сумма всех продаж: "+service.averageSales(sales));
        System.out.println("Пик продаж: "+service.maxSales(sales));

    }
}
