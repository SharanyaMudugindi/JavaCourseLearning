public class Main {

    public static class ChildThreadTask implements Runnable {
        @Override
        public void run() {
            count();
        }
    }

    public static void main(String[] args) {
        // Create a new thread and start it
        //Thread childThread = new Thread(new ChildThreadTask());
        Thread childThread = new Thread(()->count());
        childThread.start(); 

        count();
    }

    public static void count() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
