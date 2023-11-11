package org.fasttrackit.won14.curs7.homework7;

public class Company {
    private String name;
    private Advertisement advertisement;

    public Company(String name, Advertisement advertisement){
        this.name = name;
        this.advertisement = advertisement;
    }

    public String getName() {
        return name;
    }

    public Advertisement getAdvertisement() {
        return advertisement;
    }
}
