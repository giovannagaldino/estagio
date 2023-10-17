class Voto {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
      
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean podeVotar() {
        return idade >= 16;
    }

    public boolean deveVotar() {
        return idade >= 18 && idade <= 70;
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gabriel", 28);
        Pessoa pessoa2 = new Pessoa("Julia", 14);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());

        if (pessoa1.podeVotar()) {
            System.out.println("Esta pessoa pode votar.");
        } else {
            System.out.println("Esta pessoa não pode votar.");
        }

        if (pessoa1.deveVotar()) {
            System.out.println("Esta pessoa deve votar.");
        } else {
            System.out.println("Esta pessoa não é obrigada a votar.");
        }

        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());

        if (pessoa2.podeVotar()) {
            System.out.println("Esta pessoa pode votar.");
        } else {
            System.out.println("Esta pessoa não pode votar.");
        }

        if (pessoa2.deveVotar()) {
            System.out.println("Esta pessoa deve votar.");
        } else {
            System.out.println("Esta pessoa não é obrigada a votar.");
        }
    }
}
