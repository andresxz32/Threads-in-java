

public class Main {
    public static void main(String[] args) {

        /*Se instancia la clase que contiene la logica que va a ejecutar el hilo*/
        ExampleRunnable r1 = new ExampleRunnable();

        /*Se instancia el hilo directamente y se le pasa la lógica a ejecutar*/
        Thread t1 = new Thread(r1);

        /*Se inicia el hilo*/
        t1.start();

        Long idThread = t1.getId();

        /*Se instancia el hilo directamente y se le pasa la lógica a ejecutar*/
        Thread t2 = new Thread(r1);

        /*Se inicia el hilo*/
        t2.start();


        /* Se finaliza el hilo*/
        r1.timeToQuit = true;

        //
        // Interrumpir -> El usuario decide si continuar con el flujo del codigo o si vuelve al start
        t1.interrupt();


    }
}