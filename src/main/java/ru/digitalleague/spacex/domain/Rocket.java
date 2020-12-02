package ru.digitalleague.spacex.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rockets")
public class Rocket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "model")
    private String model;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "rocket", cascade = CascadeType.ALL)
    private List<Launch> launches;

    public Rocket() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public List<Launch> getLaunches() {
        return launches;
    }

    public void setLaunches(List<Launch> launches) {
        this.launches = launches;
    }

    public void setStatus(String status) {
        this.status = status;


    }
}
