import com.java.banco.Clientes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Clientes cliente0 = new Clientes();

        System.out.println("Banco de Paracambi");
        System.out.println("Digite seu nome: ");
        cliente0.setNomeCliente(scan.next());
        System.out.println("Digite sua idade: ");
        cliente0.setIdadeCliente(scan.nextInt());
        System.out.println("Digite seu saldo: ");
        cliente0.setSaldoCliente(scan.nextFloat());

        System.out.println("Suas Informações: ");
        System.out.println(cliente0.toString());
    }
}