package com.juven.domain;

import java.time.LocalDate;

public class Bunker {
    private String bunkerName;
    private LocalDate createDt;
    private Location location;

    public Bunker() {
    }

    public Bunker(String bunkerName, LocalDate createDt, Location location) {
        this.bunkerName = bunkerName;
        this.createDt = createDt;
        this.location = location;
    }

    public String getBunkerName() {
        return bunkerName;
    }

    public void setBunkerName(String bunkerName) {
        this.bunkerName = bunkerName;
    }

    public LocalDate getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDate createDt) {
        this.createDt = createDt;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "All bunkers are the same.";
    }
}
