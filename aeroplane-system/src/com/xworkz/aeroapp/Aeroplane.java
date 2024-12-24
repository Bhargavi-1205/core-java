package com.xworkz.aeroapp;

public class Aeroplane {

    private int flightId;
    private String flightName;
    private String flightSource;
    private String flightDestination;

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightSource(String flightSource) {
        this.flightSource = flightSource;
    }

    public String getFlightSource() {
        return flightSource;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    @Override
    public String toString() {
        return "Aeroplane{" +
                "flightId=" + flightId +
                ", flightName='" + flightName + '\'' +
                ", flightSource='" + flightSource + '\'' +
                ", flightDestination='" + flightDestination + '\'' +
                '}';
    }
}
