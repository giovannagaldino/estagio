
class Pessoa {
    private String nome;
    private int idade;
    private String email;


    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public String getEmail() {
        return email;
    }
}
public class main{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Giovanna", 18, "giovanna@email.com");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Email: " + pessoa.getEmail());
    }
}

