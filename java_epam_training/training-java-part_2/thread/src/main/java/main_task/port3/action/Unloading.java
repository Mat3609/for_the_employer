package main_task.port3.action;


import main_task.port3.classes.Box;
import main_task.port3.classes.Port;
import main_task.port3.classes.Ship;




public class Unloading extends Port implements Runnable{
    String nameThread;


    public Unloading(String nameThread) {
        this.nameThread = nameThread;
    }

    @Override
    public void run() {
        System.out.println(nameThread + " start!\n");
        Box box = null;
        Ship ship = null;


        while (!super.getNotUnloadedShips().isEmpty()) {


            try {
                ship = super.getNotUnloadedShips().take();
                super.getUnloadedShips().add(ship);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Ship " + ship.getId() + "   " + nameThread);
            while (!ship.getBoxes().isEmpty()) {
                try {
                    box = ship.getBoxes().take();
                    System.out.println("Ship" + ship.getId() + " TAKE Box ID >> " + box.getId() + "   " + nameThread);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                super.getBoxes().add(box);
            }
            System.out.println();
        }
    }
}
