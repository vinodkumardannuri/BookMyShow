package com.bookMyShow.model;

/**
 * Created by satheesh on 7/10/17.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="city_tbl")
public class City implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="city_id")
    private int cityId;
    @Column(name="city_name")
    private String name;

    /*@OneToMany(mappedBy = "event_tbl")
    private final List<Events> events = new ArrayList<Events>();
    public List<Events> getEvents() {
        return events;
    }*/

    @OneToMany(mappedBy = "location_tbl")
    private final List<Location> locatioNames = new ArrayList<Location>();
    public List<Location> getLocatioNames() {
        return locatioNames;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
/*@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="city_id")
    private int cityId;
    @Column(name="city_name")
    private String name;
    @Column(name="city_pincode")
    private String pincode;

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public int getCityId()
    {
        return cityId;
    }
    public void setCityId(int cityId)
    {
        this.cityId = cityId;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }*/
