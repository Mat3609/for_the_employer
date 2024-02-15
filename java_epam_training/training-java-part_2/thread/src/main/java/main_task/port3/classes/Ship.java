package main_task.port3.classes;



import java.util.concurrent.BlockingQueue;


public class Ship {
    private int id;
    private BlockingQueue<Box> boxes;

    public Ship(int id, BlockingQueue<Box> boxes) {
        this.id = id;
        this.boxes = boxes;
    }


    public BlockingQueue<Box> getBoxes() {
        return boxes;
    }

    public int getId() {
        return id;
    }
}
