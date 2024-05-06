import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float n1, n2, n3, d;
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite um valor ");
        n1 = tecla.nextFloat();
        System.out.println("Digite um valor ");
        n2 = tecla.nextFloat();
        System.out.println("Digite um valor ");
        n3 = tecla.nextFloat();
        d = (float) Math.pow(n1,2) -4 * ( n2  * n3);
        System.out.println("o resultado de Delta é " + d);
        if (d < 0){
            System.out.println("Não Existe Raiz Real");
    }
        else {
            System.out.println("Existe Raiz Real");
        }
    }
}