import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        name = null;
        String number;
        number = null;
        String mail;
        mail = null;
        String birthday;
        birthday = null;
        Contato c;
        c = null;
        //String endereco = null;


        ArrayList<Contato> Contatos = new ArrayList<>();
        boolean loop = true;

        while (loop) {
            Scanner entradas = new Scanner(System.in);
            System.out.println("[1] - Cadastrar\n[2] - Pesquisar Dados");

            int op = new Scanner(System.in).nextInt();
            switch (op) {
                case 1:
                    System.out.println("Nome: ");
                    name = entradas.nextLine();
                    System.out.println("Numero: ");
                    number = entradas.nextLine();
                    System.out.println("E-mail: ");
                    mail = entradas.nextLine();
                    System.out.println("Dia e Mês Aniversário [exemplo 09/12]: ");
                    birthday = entradas.nextLine();
                    //System.out.println();
                    //endereco = entradas.nextLine();
                    c = new Contato(name, number, mail, birthday);
                    Contatos.add(c);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Digite o nome do contato a ser pesquisado: ");
                    Scanner input = new Scanner(System.in);
                    String nome = input.nextLine();
                    for (int i = 0; i < Contatos.size(); i++) {
                        if (Contatos.get(i).getNome().equals(nome)) {
                            System.out.println(Contatos.get(i).getNome());
                            System.out.println("-------------------------");
                            System.out.println("Nome: "+Contatos.get(i).getNome());
                            System.out.println("Numero: "+ Contatos.get(i).getNumero());
                            System.out.println("Email: "+Contatos.get(i).getEmail());
                            System.out.println("Data: "+Contatos.get(i).getAniver());

                            break;
                        }

                    }
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção Invalida");
            }
            System.out.println();
            System.out.println("[1] - Voltar ao Menu\n[2] - Encerrar Programa: ");
            int fimLoop = new Scanner(System.in).nextInt();
            if (fimLoop == 1) {
                loop = true;
            } else {
                loop = false;
            }
        }
        System.out.println("Resumo do Contatos Cadastrados.");
        if (Contatos.size() != 0) {
            for (Contato lista : Contatos) {
                lista.resumoContatos();

            }
        }
    }
}
