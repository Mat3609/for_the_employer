package main_task.port3.action;



import main_task.port3.classes.Box;
import main_task.port3.classes.Port;
import main_task.port3.classes.Ship;




public class Loading extends Port implements Runnable {
    String nameThread;


    public Loading(String name) {
        this.nameThread = name;
    }

    @Override
    public void run() {

        System.out.println(nameThread + " start!");
        Box box = null;
        Ship ship = null;



        while (!super.getUnloadedShips().isEmpty()) {

            try {
                ship = super.getUnloadedShips().take();
                super.getLoadingShips().add(ship);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Ship " + ship.getId() + "   " + nameThread);
            while (ship.getBoxes().remainingCapacity() != 0) {
                try {
                    box = super.getBoxes().take();
                    ship.getBoxes().add(box);
                    System.out.println("Ship " + ship.getId() + " GET Box ID >> " + box.getId() + "   " + nameThread);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

            System.out.println();

    }





}
