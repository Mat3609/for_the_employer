package optional_task;


import java.util.concurrent.TimeUnit;

public class RunwayStrip extends Airport implements Runnable{


    @Override
    public void run() {

        Airplane airplane = null;
        while (!super.getAirplanes().isEmpty()) {
            try {
                airplane = super.getAirplanes().take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("1. The plane: " + airplane.getModel() + " started moving");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("2. The runway received the plane: " + airplane.getModel());
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("3. The plane: " + airplane.getModel() + " took off");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("4. Runway Strip is free " + airplane.getModel());
        }

    }
}
