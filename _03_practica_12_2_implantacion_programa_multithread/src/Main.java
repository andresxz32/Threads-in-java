
/*
• Implantación de Runnable
• Inicio de Thread
• Comprobación del estado de un Thread
• Interrupción de un Thread
 */
public class Main {
    public static void main(String[] args) {
        /*
        Instanciamos Runnable -> Clase que llevará la lógica y el método run
         */
        ImplementationRunnable r1 = new ImplementationRunnable();
        /*
        Instanciamos la clase de los hilos
         */
        Thread t1 = new Thread(r1);

        //Iniciamos el hilo
        t1.start();

        if(t1.isAlive()){
            System.out.println("El hilo esta activo");
        }

        /*
        Interrumpimos el hilo
         */
        t1.interrupt();


        /*
        Términamos el hilo
         */
        r1.timeToQuit = true;
    }



}