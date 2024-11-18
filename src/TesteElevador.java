import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteElevador {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Elevador elevador = new Elevador();
       // List<Pessoa> listaDePessoas1 = new ArrayList<>();

        int opcao = -1;
        do {
            System.out.println("MENU DE SERVIÇOS");
            System.out.println(" [ 1 ] ADICIONAR PESSOA");
            System.out.println(" [ 2 ] REMOVER PESSOA");
            System.out.println(" [ 3 ] SUBIR");
            System.out.println(" [ 4 ] DESCER");
            System.out.println(" [ 0 ] SAIR");
            System.out.println("ESCOLHA UM SERVIÇO!");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("NOME: ");
                    String nome = entrada.next();
                    System.out.print("PESO: ");
                    double peso = entrada.nextDouble();
                    elevador.setCargaMaxima(200);
                    elevador.setNumeroDeAndares(5);
                    elevador.adicionarPessoa(new Pessoa(nome,peso));
                    elevador.statusAtual();

                    break;
                case 2:
                    System.out.print("NOME: ");
                    String nomeRemover = entrada.next();
                    elevador.removerPessoa(nomeRemover);

                    break;
                case 3:
                    elevador.subir();
                    elevador.statusAtual();

                    break;
                case 4:
                    elevador.descer();
                    elevador.statusAtual();

                    break;
                case 0:
                    System.out.println("saindo");
                    break;
            }
        } while (opcao != 0);


        entrada.close();

    }
}
