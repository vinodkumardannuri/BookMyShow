package com.bookMyShow.model;

/**
 * Created by satheesh on 7/10/17.
 */

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by satheesh on 4/10/17.
 */
@Entity
@Table(name="event_tbl")
public class Event implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="event_id")
    private String event_id;
    @Column(name="event_name")
    private String name;

    private String nonsenseField = "";

    private List<Location> locationList = new ArrayList<Location>();

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String Id) {
        this.event_id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Transient
    public String getNonsenseField() {
        return nonsenseField;
    }

    public void setNonsenseField(String nonsenseField) {
        this.nonsenseField = nonsenseField;
    }

    @ManyToMany
    public List<Location> getLocation() {
        return this.locationList;
    }

    public void setJobList(List<Location> locations) {
        this.locationList = locations;
    }

}

/*@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="event_id")
    private int eventId;
    public int getEventId()
    {
        return eventId;
    }
    public void setEventId(int eventId)
    {
        this.eventId = eventId;
    }

    @Column(name="event_name")
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="location_id")
    private List<Location> location;
    public void setLocation(List<Location> location) {
        this.location = location;
    }
    public List<Location> getLocation()
    {
        return location;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="city_id")
    private List<City> city;
    public List<City> getCity() {
        return city;
    }
    public void setCity(List<City> city) {
        this.city = city;
    }*/

