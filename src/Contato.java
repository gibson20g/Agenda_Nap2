/**
*

* @since Ago 2021
* @version 1.0

*/
public class Contato {
    private String nome;
    private String numero;
    private String email;
    private String aniver;


    public Contato(String nome, String numero, String email, String aniver) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.aniver = aniver;

    }

    public String getAniver() {
        return aniver;
    }

    public void setAniverc(String aniver) {
        this.aniver = aniver;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void resumoContatos() {
        System.out.println();
        System.out.println("********** Resumo Contatos **********");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número: " + this.numero);
        System.out.println("E-mail: " + this.email);
        System.out.println("Aniversário: " + this.aniver);
    }

}

