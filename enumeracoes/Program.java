import java.util.Date;

public  class Program {
    public static void main(String[] args) {
       Order order = new Order(1080, new Date(), Enumeracoes.PENDING_PAYMENT); 

       System.out.print(order);
    }
}
