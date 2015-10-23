package models;

import play.db.jpa.Model;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by davidmoll on 9/29/15.
 */

@Entity
public class Shout extends Model {
    @ManyToOne
    public Box box;
    public String name;
    public String text;
    public Date dateSent;

    public Shout(String name, String text, Box box) {
        this.name = name;
        this.text = text;
        this.dateSent = new Date();
        this.box = box;
    }
}
