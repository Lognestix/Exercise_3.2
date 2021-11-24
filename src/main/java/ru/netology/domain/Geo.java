package ru.netology.domain;

public class Geo {
    private String type;                        //Тип места
    private String coordinates;                 //Координаты места
    private String place;                       //Описание места

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
