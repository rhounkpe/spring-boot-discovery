package be.digitcom.discoversb.models;

public class Student extends Person {
    private String matr;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    @Override
    public String toString() {
        return this.getLastName() + " " + this.getFirstName();
    }
}
