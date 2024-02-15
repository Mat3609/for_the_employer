package main_task.port3.classes;



public class Dock {
    private String name;
    Runnable runnable;

    public Dock(String name, Runnable runnable) {
        this.name = name;
        this.runnable = runnable;
    }


    public void startWorking() {
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public String getName() {
        return name;
    }
}