import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImplementationRunnable implements Runnable {
    public volatile boolean timeToQuit = false;
    @Override
    public void run() {
        StringBuilder sb = new StringBuilder();
        List<Item> cart = new ArrayList<>();
        /*
        Se crea un bloque de código sincrono que actualizara el estado de memoria principal.
         */
        synchronized (this) {
            Iterator<Item> ii = cart.iterator();
            while (ii.hasNext()) {
                Item i = ii.next();
                sb.append("Item:");
                sb.append(i.getDescription());
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}