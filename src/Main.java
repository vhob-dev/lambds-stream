import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("alucard", "M"));
        clientes.add(new Cliente("Chun li", "F"));
        clientes.add(new Cliente("Icaro", "M"));
        clientes.add(new Cliente("iasa", "F"));

        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientesl = new ArrayList<>();
        String entrada;
        while (true) {
            System.out.println("Digite um nome ou digite 'Sair' para encerrar");
            entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")) ;
            break;

        }
        System.out.println("digite o sexo M para masculine ou F para Feminino:");
        String Sexo = scanner.nextLine();
        clientes.add(new Cliente(entrada, Sexo));

        List<Cliente> nomesMulheres = clientes.stream()
                .filter(cliente -> cliente.getGenero().equalsIgnoreCase("F"))
                .sorted(Comparator.comparing(Cliente::getNome))
                .collect(Collectors.toList());
        System.out.println("Mulheres" + nomesMulheres);
    }
}















