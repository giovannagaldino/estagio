
class MaiorIdade {
    private String nome;
    private int idade;
    private String email;

    public MaiorIdade(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
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

    public boolean eMaiorDeIdade() {
        return idade >= 18;
    }
}

public class  {
    public static void main(String[] args) {
       MaiorIddade = new MaiorIdade ("Gustavo", 18, "gustavo@email.com");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Email: " + pessoa.getEmail());

        // Verificando se a pessoa é maior de idade
        if (pessoa.eMaiorDeIdade()) {
            System.out.println("Esta pessoa é maior de idade.");
        } else {
            System.out.println("Esta pessoa não é maior de idade.");
        }
    }
}
