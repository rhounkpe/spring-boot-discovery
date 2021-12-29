package be.digitcom.discoversb.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher extends Person {
    private String buro;

    public String getBuro() {
        return buro;
    }

    public void setBuro(String buro) {
        this.buro = buro;
    }
}
