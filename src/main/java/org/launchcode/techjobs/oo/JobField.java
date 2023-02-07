package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    public int id;
    public static int nextId = 1;

    public String value;

    public JobField(String value) {
    this.value = value;
    }

    public void JobField() {
        this.id = nextId;
        nextId++;
    }



    public String toString() {
        return value;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id && Objects.equals(value, jobField.value);
    }

    public int hashCode() {
        return Objects.hash(id);
    }



    public int getId() {
        return id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;

    }
}
