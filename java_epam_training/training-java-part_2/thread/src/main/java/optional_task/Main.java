package optional_task;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Airplane> airplanes = new LinkedBlockingQueue<>();
        airplanes.add(new Airplane("Airbus A380"));
        airplanes.add(new Airplane("Boeing 737-100"));
        airplanes.add(new Airplane("Embraer 175"));
        airplanes.add(new Airplane("Airbus A320"));
        airplanes.add(new Airplane("Airbus A330"));
        airplanes.add(new Airplane("Boeing 747-400"));
        airplanes.add(new Airplane("Boeing 777"));
        airplanes.add(new Airplane("Boeing 737-900"));
        airplanes.add(new Airplane("Embraer 190"));
        airplanes.add(new Airplane("An - 225 MRIYA"));

        Airport airport = new Airport(airplanes);

        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        RunwayStrip runwayStrip = new RunwayStrip();
        Thread thread1 = new Thread(runwayStrip);
        Thread thread2 = new Thread(runwayStrip);
        Thread thread3 = new Thread(runwayStrip);
        Thread thread4 = new Thread(runwayStrip);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();





    }
}
