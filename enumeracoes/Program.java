import java.util.Date;

public  class Program {
    public static void main(String[] args) {
       Order order = new Order(1080, new Date(), Enumeracoes.PENDING_PAYMENT); 

       System.out.println(order);

       Enumeracoes enum1 = Enumeracoes.DELIVERED;

       Enumeracoes enum2 = Enumeracoes.valueOf("DELIVERED");

       System.out.println(enum1);
       System.out.println(enum2);

        
    }
}
