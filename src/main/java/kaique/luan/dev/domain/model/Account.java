package kaique.luan.dev.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(precision = 13, scale = 2)
    private BigDecimal balance;

    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    public String getAgency() {
        return agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public String getNumber() {
        return number;
    }
}
