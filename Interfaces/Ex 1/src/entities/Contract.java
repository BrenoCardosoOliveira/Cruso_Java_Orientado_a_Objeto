package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    
   private Integer id;
    private Double totalValue;
    private LocalDate date; 

    private List<Installment> installments = new ArrayList<>();
    
    public Contract(Integer id, Double totalValue, LocalDate date) {
        this.id = id;
        this.totalValue = totalValue;
        this.date = date;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public List<Installment> getInstallments() {
        return installments;
    }

    
    
}
