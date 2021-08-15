import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = null;
        String number = null;
        String mail = null;
        String birthday = null;
        Contato c = null;

        ArrayList<Contato> Contatos = new ArrayList<>();
        boolean loop= true;

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
                    c = new Contato(name, number, mail, birthday);
                    Contatos.add(c);
                    break;

                case 2:
                    System.out.println("teste !!");
                    break;

                default:
                    System.out.println("Opção Invalida");
            }
            System.out.println();
            System.out.println("Cadastar novo contato [S] ou qualquer para não: ");
            String fimLoop = new Scanner(System.in).next();
            if (fimLoop.toUpperCase().equals("S")){
                loop = true;
            }else{
                loop = false;
            }
        }

        if (Contatos.size() !=0) {
            for(Contato lista : Contatos){
                lista.resumoContatos();

            }
        }

    }


}
