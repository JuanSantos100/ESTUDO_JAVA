import java.util.Date;

public class  Order {
    private Integer id;
    private Date moment;
    private Enumeracoes status;


    public Order() {

    }

    public Order(Integer id, Date moment, Enumeracoes status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }
    
    public Integer getId() {
        return id;
    }

    public Date getMoment() {
        return moment;
    }

    public Enumeracoes getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setStatus(Enumeracoes status) {
        this.status = status;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Order [id= " + id + ", moment= " + moment + ", status= " + status + "]"; 
    }

}
