package org.launchcode.techjobs.oo;

import javax.naming.Name;
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

    public Job(String name, Employer Employer, Location Location, PositionType PositionType,
            CoreCompetency CoreCompetency) {
        this();

        this.name = name;
        this.employer = Employer;
        this.location = Location;
        this.positionType = PositionType;
        this.coreCompetency = CoreCompetency;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer)
                && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType)
                && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    // setters
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String result = "\nID: " + id + "\n";
        result += "Name: " + (name == null || name.equals("") ? "Data not available" : name) + "\n";
        result += "Employer: "
                + (employer == null || this.employer.toString().equals("") ? "Data not available" : employer.toString())
                + "\n";
        result += "Location: "
                + (location == null || this.location.toString().equals("") ? "Data not available" : location.toString())
                + "\n";
        result += "Position Type: "
                + (positionType == null || this.positionType.toString().equals("") ? "Data not available"
                        : positionType.toString())
                + "\n";
        result += "Core Competency: "
                + (coreCompetency == null || this.coreCompetency.toString().equals("") ? "Data not available"
                        : coreCompetency.toString())
                + "\n";
        return result + "\n";
    }
}
