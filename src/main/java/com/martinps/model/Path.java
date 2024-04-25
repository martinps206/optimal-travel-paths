package com.martinps.model;

public class Path {

    private int cost;
    private Station origin;
    private Station destination;

    public Path() {
    }

    public Path(int cost, Station origin, Station destination) {
        this.cost = cost;
        this.origin = origin;
        this.destination = destination;
    }

    // Getters y Setters (opcional)

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Station getOrigin() {
        return origin;
    }

    public void setOrigin(Station origin) {
        this.origin = origin;
    }

    public Station getDestination() {
        return destination;
    }

    public void setDestination(Station destination) {
        this.destination = destination;
    }
    
}
