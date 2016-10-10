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
