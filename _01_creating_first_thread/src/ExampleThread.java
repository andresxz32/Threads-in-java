public class ExampleThread extends Thread {
    @Override
    /*Se crea un método para ejecutar el hilo*/
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("i:" + i);
        }
    }
}