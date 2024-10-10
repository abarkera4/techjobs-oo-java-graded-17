package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    @Override
    public String toString() {

        if (name.isBlank() && employer.toString().isBlank() && location.toString().isBlank() && positionType.toString().isBlank() && coreCompetency.toString().isBlank()) {
            return "OOPS! This job does not seem to exist.";
        }
        if (name.isBlank()) {
            setName("Data not available");
        }
        if (employer.toString().isBlank()) {
            getEmployer().setValue("Data not available");
        }
        if (location.toString().isBlank()) {
            getLocation().setValue("Data not available");
        }
        if (positionType.toString().isBlank()) {
            getPositionType().setValue("Data not available");
        }
        if (coreCompetency.toString().isBlank()) {
            getCoreCompetency().setValue("Data not available");
        }

        return System.lineSeparator() +
                "ID: " + getId() + System.lineSeparator() +
                "Name: " + getName() + System.lineSeparator() +
                "Employer: " + getEmployer() + System.lineSeparator() +
                "Location: " + getLocation() + System.lineSeparator() +
                "Position Type: " + getPositionType() + System.lineSeparator() +
                "Core Competency: " + getCoreCompetency() +
                System.lineSeparator();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
