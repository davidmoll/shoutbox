package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void createBox(String title) {
        Box box = new Box(title);
        box.save();
        viewBox(box.id);
    }

    public static void viewBox(Long boxId) {
        Box box = Box.findById(boxId);
        render(box);
    }

    public static void createShout(Long boxId, String name, String message) {
        Box box = Box.findById(boxId);
        Shout shout = new Shout(name, message, box);
        shout.save();
        viewBox(box.id);
    }

}
