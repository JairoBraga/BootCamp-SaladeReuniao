package com.dio.crud.saladereuniao.saladereuniao.model;

import javax.persistence.*;

@Table(name="meetingRoom")
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String date;
    private String startHour;
    private String endHour;

    public Room(Long id, String name, String date, String startHour, String endHour) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }
    public Room() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="date",nullable = false)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Column(name="startHour",nullable = false)
    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    @Column(name="endHour",nullable = false)
    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", startHour='" + startHour + '\'' +
                ", endHour='" + endHour + '\'' +
                '}';
    }
}
