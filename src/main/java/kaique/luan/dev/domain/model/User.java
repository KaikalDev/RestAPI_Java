package kaique.luan.dev.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public Account getAccount() {
        return account;
    }

    public Card getCard() {
        return card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<News> getNews() {
        return news;
    }
}
