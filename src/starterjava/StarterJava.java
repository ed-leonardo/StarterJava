package starterjava;

import java.util.Scanner;

/**
 *
 */
public class StarterJava {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro: ");
	Scanner scan = new Scanner(System.in);
		
	int x = scan.nextInt();
		
	for(int i = 1; i <= 10; i++) {
            int r = x * i;
            System.out.println(x+" x "+i+" = "+r);
	}
		
	System.out.println("Tabuada do número " + x + " finalizada!");
	scan.close();
    }
}
