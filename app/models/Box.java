package models;

import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidmoll on 9/29/15.
 */


@Entity
public class Box extends Model {
    public String title;
    @OneToMany(mappedBy = "box", cascade = CascadeType.ALL)
    public List<Shout> shouts;


    public Box(String title) {
        this.title = title;
        this.shouts = new ArrayList<Shout>();
    }






}
