package ru.digitalleague.spacex.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "launches")
public class Launch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "mission")
    private String mission;

    @Column(name = "launch_date")
    private Date launchDate;

    @Column(name = "stackholder")
    private String stackholder;

    @ManyToOne(fetch = FetchType.LAZY)
    private Ship ship;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rocket rocket;

    public Launch() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public String getStackholder() {
        return stackholder;
    }

    public void setStackholder(String stackholder) {
        this.stackholder = stackholder;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }
}
