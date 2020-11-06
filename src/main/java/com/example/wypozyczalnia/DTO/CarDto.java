package com.example.wypozyczalnia.DTO;

/**
 * JSON/View Model
 */
public class CarDto {

    private Long id;
    private String make;
    private String model;
    private String body;
    private Integer year;
    private Integer status;
    private Integer available;
    private Double price;

    public CarDto() {
        System.out.println("carDto object created");
    }

    public CarDto(Long id, String make, String model, String body, Integer year, Integer status, Integer available, Double price) {
        this.setId(id);
        this.setMake(make);
        this.setModel(model);
        this.setBody(body);
        this.setYear(year);
        this.setStatus(status);
        this.setAvailable(available);
        this.setPrice(price);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        System.out.println("carDto id= "+id);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;System.out.println("carDto make= "+make);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
