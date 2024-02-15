package optional_task;


import java.util.concurrent.BlockingQueue;

public class Airport {
    private static BlockingQueue<Airplane> airplanes;

    public Airport() {
    }

    public Airport(BlockingQueue<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public BlockingQueue<Airplane> getAirplanes() {
        return airplanes;
    }
}
