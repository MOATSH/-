package algorithm;

import sun.awt.geom.AreaOp;
import userinterface.*;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Getrichsimulator {

    private final Gui1 gui1 = new Gui1();
    private final Gui2 gui2 = new Gui2();
    private final Gui3 gui3 = new Gui3();
    private final Gui4 gui4 = new Gui4();
    private final Gui5 gui5 = new Gui5();
    private User user;

    public Getrichsimulator(){
        super();
    }

    public void play (){
        gui1.setVisible(true);
        user = User.getSingletonInstance();
        gui2.setGui1(gui1);
        gui3.setGui1(gui1);
        gui1.setGui2(gui2);
        gui1.setGui3(gui3);
        gui1.setUser(user);
        gui2.setUser(user);
        gui3.setUser(user);
        gui3.setGui4(gui4);
        gui4.setUser(user);
        gui3.setGui5(gui5);
        gui5.setUser(user);

        gui1.update();
        gui3.update();
    }

    public static void main (String[] args){
        Getrichsimulator game = new Getrichsimulator();
        game.play();
    }
}
