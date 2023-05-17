import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<Long, Aluno> mapaAlunos = new HashMap<>();
		boolean continua = true;

		do {
			
			System.out.println("Bem-vindo(a)! Qual ação você deseja?");
			System.out.println("1 - Adicionar um novo aluno;");
			System.out.println("2 - Ver alunos cadastrados;");
			System.out.println("3 - Remover um aluno;");
			System.out.println("0 - Sair do programa.");
			
			int entrada = sc.nextInt();
			sc.nextLine();
			
			if (entrada == 1) {
				
				System.out.println("Digite o nome do(a) aluno(a): ");
				String nome = sc.nextLine();
				System.out.println("Digite o endereço do(a) aluno(a): ");
				String endereco = sc.nextLine();
				System.out.println("Digite o contato do(a) aluno(a). Pode ser um telefone, e-mail ou ambos:");
				String contato = sc.nextLine();
				System.out.println("Digite a matrícula do aluno: ");
				Long mat = sc.nextLong();
				
				Aluno aluno = new Aluno(nome, endereco, contato);
				mapaAlunos.put(mat, aluno);
				
			} else if (entrada == 2) {
				
				System.out.println(mapaAlunos);
				
			} else if (entrada == 3) {
				
				System.out.println("Se deseja ver a lista de alunos antes de remover, digite '1'. Se não, digite qualquer outro número.");
				int ver = sc.nextInt();
				if (ver == 1) { System.out.println(mapaAlunos);}				
				
				System.out.println("Digite a matrícula do aluno que deseja remover: ");
				Long aRemover = sc.nextLong();
				mapaAlunos.remove(aRemover);
				
			} else if (entrada == 0) {
				
				System.out.println("Saindo...");
				continua = false;
				
			} else {
				System.out.println("VALOR INVÁLIDO!!!");
			}
			
		} while (continua);
		
	}
}
