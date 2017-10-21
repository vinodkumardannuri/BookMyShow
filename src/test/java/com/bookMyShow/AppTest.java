package com.bookMyShow;

import com.bookMyShow.model.City;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
   /* public void testApp()
    {
        assertTrue( true );
    }
    public void getCityById() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/user/city/{id}";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<City> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, City.class, 1);
        City city = responseEntity.getBody();
        System.out.println("Id:"+city.getCityId()+", Title:"+city.getName()
                +", Category:"+city.getPincode());
    }
    public void getAllCities() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/city/cities";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<City[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, City[].class);
        City[] cities = responseEntity.getBody();
        for(City city : cities) {
            System.out.println("Id:"+city.getCityId()+", Title:"+city.getName()
                    +", PinCode: "+city.getPincode());
        }
    }
    public void addCity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/city/";
        City objCity = new City();
        objCity.setName("Spring REST Security using Hibernate");
        objCity.setPincode("Spring");
        HttpEntity<City> requestEntity = new HttpEntity<City>(objCity, headers);
        URI uri = restTemplate.postForLocation(url, requestEntity);
        System.out.println(uri.getPath());
    }
    public void updateCity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/city/{id}";
        City objCity = new City();
        objCity.setCityId(1);
        objCity.setName("Update:Java Concurrency");
        objCity.setPincode("Java");
        HttpEntity<City> requestEntity = new HttpEntity<City>(objCity, headers);
        restTemplate.put(url, requestEntity);
    }
    public void deleteCity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/city/{id}";
        HttpEntity<City> requestEntity = new HttpEntity<City>(headers);
        restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, Void.class, 4);
    }
    public static void main(String args[]) {
        AppTest util= new AppTest("Unit");
        //util.getCityById();
        util.getAllCities();
        //util.addCity();
        //util.updateCity();
        //util.deleteCity();
    }*/
}
