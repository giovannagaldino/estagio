public class VerificarPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        boolean ehPrimo = ehNumeroPrimo(numero);
        
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        
        scanner.close();
    }
    public static boolean ehNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        
        if (numero <= 3) {
            return true; 
        }
        
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false; 
            }
        }
     return true;
    }
}