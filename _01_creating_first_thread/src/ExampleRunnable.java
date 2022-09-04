public class ExampleRunnable implements Runnable {
    /*
    Importante que sea volatile ya que actualiza también el estado de la memoria prinicipal
    En tal caso de que no sea volatil solo actualiza el estado de la memoria del hilo
    */
    public volatile boolean timeToQuit = false;

    @Override
    /*Se crea un método para ejecutar el hilo e implementa runnable para crear un contrato con el método run*/
    public void run() {
        System.out.println("Thread started");
        while (!timeToQuit){
            for(int i = 0; i < 100; i++) {
                System.out.println("i runnable:" + i);
            }
        }

        /*
        Otra forma de parar un hilo es interrumpiendo su flujo
        while(!Thread.interrupted()) {
            Método Thread estático
        }
         */
        System.out.println("Thread finishing");

    }
}