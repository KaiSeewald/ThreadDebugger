package Monitor;

import ObservableThreads.Observable;

import javax.swing.*;
import java.util.ArrayList;

public class Monitor extends JFrame{
    //TODO: ALL THE THINGS!
    private ArrayList<Observable> agents = new ArrayList<>();

    public Monitor(){
        super("Monitor");
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void add(Observable o){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                agents.add(o);
            }
        });
    }
}