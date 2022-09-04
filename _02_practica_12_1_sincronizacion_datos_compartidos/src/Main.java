
/*
• Impresión de ID de thread
• Uso de Thread.sleep()
• Sincronización de un bloque de código
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

        t1.start();

        /*
        Obtenemos el Id del hilo
         */
        Long idThread = t1.getId();

        /*
        Iniciamos un contador
         */
        long start = System.currentTimeMillis();
        try {
            /*
            Dormimos el hilo durante 4 s
            */
            Thread.sleep(4000);
            } catch (InterruptedException ex) {
            /*
            Interrumpimos y términamos el hilo
            */
            t1.interrupt();
            r1.timeToQuit = true;
        }
        long time = System.currentTimeMillis() - start;
        /*
        Se hace enfasis en la palabra aproximación ya que el tiempo que le damos también depende del SO y del hardware
         */
        System.out.println("El hilo duro dormido aprox " + time + " ms");



        System.out.println("Id del hilo:" + idThread);

        r1.timeToQuit = true;
    }



}