package main_task.port3;



import main_task.port3.action.Loading;
import main_task.port3.action.Unloading;
import main_task.port3.classes.*;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        GenerateBoxes createBoxes = new GenerateBoxes();

        Ship ship1 = new Ship(1, createBoxes.generateBoxes(25, 30));
        Ship ship2 = new Ship(2, createBoxes.generateBoxes(25, 30));
        Ship ship3 = new Ship(3, createBoxes.generateBoxes(25, 25));
        Ship ship4 = new Ship(4, createBoxes.generateBoxes(25, 25));
        Ship ship5 = new Ship(5, createBoxes.generateBoxes(25, 30));
        Ship ship6 = new Ship(6, createBoxes.generateBoxes(25, 50));
        Ship ship7 = new Ship(7, createBoxes.generateBoxes(25, 50));
        Ship ship8 = new Ship(8, createBoxes.generateBoxes(25, 50));

        BlockingQueue<Ship> ships = new LinkedBlockingQueue<>();
        ships.add(ship1);
        ships.add(ship2);
        ships.add(ship3);
        ships.add(ship4);
        ships.add(ship5);
        ships.add(ship6);
        ships.add(ship7);
        ships.add(ship8);

        BlockingQueue<Box> portBoxes = createBoxes.generateBoxes(25, 300);


        Port port = new Port(portBoxes, ships);


        Dock dockUnloading1 = new Dock("DOCK1_UNLOAD", new Unloading("Unloading 1 "));
        Dock dockUnloading2 = new Dock("DOCK2_UNLOAD", new Unloading("Unloading 2 "));
        Dock dockLoading1 = new Dock("DOCK1_LOAD", new Loading("Loading1"));
        Dock dockLoading2 = new Dock("DOCK2_LOAD", new Loading("Loading2"));


        dockUnloading1.startWorking();
        dockUnloading2.startWorking();

        dockLoading1.startWorking();
        dockLoading2.startWorking();

        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//
//        System.out.println(port.getBoxes().size());
//        for (Ship s : port.getLoadingShips()) {
//            System.out.println(s.getBoxes().size());
//        }
//






    }
}
