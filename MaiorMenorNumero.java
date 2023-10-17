public class MaiorMenorNumero {
public static void (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você deseja inserir? ");
        int quantidade = scanner.nextInt();
        
        if (quantidade <= 0) {
            System.out.println("Por favor, insira pelo menos um número.");
            return;
        }
        }

int maior = MIN_VALUE;
        int menor = MAX_VALUE;

for (int i = 1; i <= quantidade; i++) {
            System.out.print(
            System.out.print
"Digite o número " + i + ": ");
            
           
int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            
                maior =
if (numero < menor) {
                menor = numero;
            }
        }

        scanner.close();

        System.out.println(
                menor = numero;
            }
        }

        scanner.close();

                menor =

                menor
"O maior número da lista é: " + maior);
        System.out.println(
        System.out.println
"O menor número da lista é: " + menor);
    }
}

    }