/*Programa en Java que cree dos hilos y los ejecuta. 
Los hilos escriben diez veces un número de iteración 
del bucle y su nombre. En cada iteración, 
después de escribir su nombre, se bloquean durante un 
tiempo aleatorio de segundos y después vuelven a estar 
disponibles para su ejecución.*/
package exercicio1psp;

/**
 *
 * @author ylagorebollar
 */
public class Exercicio1PSP {

    public static void main(String[] args) {
       new Thread1("Hilo1").start();
       new Thread1("Hilo2").start();
    }
    
}
