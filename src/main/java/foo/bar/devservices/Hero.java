package foo.bar.devservices;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Hero extends PanacheEntity{
    
    public Hero() {
        super();
    }

    public Hero(String name) {
        this.name = name;
    }

    public String name;

}
