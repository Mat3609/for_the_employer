package main_task.port3.classes;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class Port {
    private static BlockingQueue<Box> BOXES;
    private static BlockingQueue<Ship> NOT_UNLOADED_SHIPS;
    private static BlockingQueue<Ship> UNLOADED_SHIPS;
    private static BlockingQueue<Ship> LOADING_SHIPS;


    public Port(BlockingQueue<Box> boxes, BlockingQueue<Ship> ships) {
        this.BOXES = boxes;
        this.NOT_UNLOADED_SHIPS = ships;
        UNLOADED_SHIPS = new LinkedBlockingQueue<>(NOT_UNLOADED_SHIPS.size());
        LOADING_SHIPS = new LinkedBlockingQueue<>();
    }

    public Port() {
    }


    public BlockingQueue<Ship> getUnloadedShips() {
        return UNLOADED_SHIPS;
    }

    public BlockingQueue<Box> getBoxes() {
        return BOXES;
    }

    public BlockingQueue<Ship> getNotUnloadedShips() {
        return NOT_UNLOADED_SHIPS;
    }

    public BlockingQueue<Ship> getLoadingShips() {
        return LOADING_SHIPS;
    }
}
