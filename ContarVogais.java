ublic class ContarVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        
        String
String frase = scanner.nextLine();
int contadorVogais = contarVogais(frase);
        System.out.println(
        System
"O número de vogais na frase é: " + contadorVogais);
        scanner.close();
    }
        scanner.close();
    }
public static int contarVogais(String frase) {
        int contador = 0;
for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a'||c == 'A'||c == 'e'|| c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
       contador++;
            }
        }
        
                contador++;
            }
        }
                contador++;
            }
return contador;
    }
}
