package kaitlyn.sandbox.domain_external_separate.domainB;

import javax.persistence.Entity;

@Entity
class ESEntityB {
    private int id;
    private String description;
    private Object thing;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getThing() {
        return thing;
    }

    public void setThing(Object thing) {
        this.thing = thing;
    }
}
