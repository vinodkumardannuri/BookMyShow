package com.bookMyShow.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by satheesh on 7/10/17.
 */
@Entity
@Table(name="location_tbl")
public class Location {
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
    @Column(name="location_id")
    private int locationId;
    public int getLocationId() {
        return locationId;
    }
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Column(name="location_name")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name="use_flag")
    private int useFlag;
    public int getUseFlag() {
        return useFlag;
    }
    public void setUseFlag(int useFlag) {
        this.useFlag = useFlag;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    private List<City> city;
    public List<City> getCity()
    {
        return city;
    }
    public void setCity(List<City> city) {
        this.city = city;
    }*/
