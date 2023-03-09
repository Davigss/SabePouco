package programasIniciais;

import java.util.Scanner;

public class PrimeiroProgramaLaele {
	public static void main(String[] args) {

		Funcoes p1 = new Funcoes();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ola mundooo :3");
		System.out.println("Qual teu nome boy");
		String nome = entrada.nextLine();
		System.out.printf("Olá %s!\n", nome);
		System.out.println("Qual tua idade kkkkk");
		p1.idade = entrada.nextInt();
		if (p1.idade <= 16) {
			System.out.println("Ta novinho kkkk");
		} else {
			System.out.println("Ta fazendo oq aq repetente??");
		}
		System.out.println("Ta solteiro? :)");
		System.out.println("Solteiro, casado ou Uniao Estavel");
		p1.solteiro = entrada.nextLine();
		p1.solteiro.toLowerCase().replace("solteiro", "1").replace("casado", "2")
		.replace("uniao estavel", "3");
		
		switch (p1.solteiro) {
		case "1":
			System.out.println("ta solteiroo, passa o contato gatoo");
			break;
		case "2":
			System.out.println("casado? :D");
			break;
		case "3":
			System.out.println("que porra eh essa vei?? kkskdkskdksdk");
			break;
		default:
			System.out.println("nn sabe as opcoes nn man?");
		}

		entrada.close();
	}
}
