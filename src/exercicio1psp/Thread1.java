package exercicio1psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ylagorebollar
 */
public class Thread1 extends Thread{
    //Programa en Java que cree dos hilos y los ejecuta. 
    //Los hilos escriben diez veces un número de iteración 
    //del bucle y su nombre. En cada iteración, 
    //después de escribir su nombre, se bloquean durante un 
    //tiempo aleatorio de segundos y después vuelven a estar 
    //disponibles para su ejecución.
    public Thread1(String name) {
        super(name);
    }
    
    public void run(){
        for(int i=0;i<10;i++){
            try {
            System.out.println("Numero de iteracion: "+i +" Nome: "+getName());           
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
    
}
