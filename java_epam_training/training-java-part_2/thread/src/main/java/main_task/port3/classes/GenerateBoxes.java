package main_task.port3.classes;



import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class GenerateBoxes {

    public BlockingQueue<Box> generateBoxes(int amount, int size) {
        BlockingQueue<Box> boxes = new LinkedBlockingQueue<>(size);
        for (int i = 0; i < amount; i++) {
            boxes.add(new Box(new Random().nextInt(1000)));
        }
        return boxes;
    }
}
