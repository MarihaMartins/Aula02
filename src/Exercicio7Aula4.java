import java.util.Scanner;

public class Exercicio7Aula4 {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		int valor = 0;
		System.out.println("Digite o valor que feijões existentes no Jarro: ");
		valor = leitor.nextInt();
		
		while(valor!=120) {
			System.out.println("Não foi dessa vez, tente novamente: ");
			valor = leitor.nextInt();
			
		}
		
		System.out.println("Parabéns! Você acertou!");
		
		leitor.close();
	}

}
