import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a palavra a ser criptografada: ");
		String palavra = sc.nextLine();
		
		ArrayList<Integer> passwordArray = new ArrayList<Integer>();
		passwordArray.add(10);
		passwordArray.add(8);
		passwordArray.add(4);
		passwordArray.add(11);
		passwordArray.add(2);
		
		StringBuilder password = new StringBuilder();

		for(Integer number : passwordArray) {
			password.append(number + " ");
		}
		
		System.out.println();
		System.out.print("Senha atual: " + password);
		System.out.println();
		System.out.println();

		
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		
		ArrayList<String> list = new ArrayList<String>();

		for(int i = 0; i < 26; i++)  {
			list.add(String.valueOf(alfabeto.charAt(i)));
		}
				
		ArrayList<Integer> letterNumber = new ArrayList<Integer>();

		for(int i = 0; i < palavra.length(); i++) {
			int letterPosition = 0;
			for(String letter : list) {
				if(letter.equals(String.valueOf(palavra.charAt(i)))) {
					letterPosition = list.indexOf(letter) + 1;
					int soma = letterPosition;
					for(int j = 0; j < 5; j++) {
						soma += passwordArray.get(j);
						if(soma > 26) {
							soma -= 26;
						}
						else if(soma == 26) {
							soma = 0;
						}
					}
					letterNumber.add(soma);
					soma = 0;
					break;
				}
			}
		}
		
		StringBuilder palavraCriptografada = new StringBuilder();

		
		for(Integer number : letterNumber) {
			palavraCriptografada.append(list.get(number - 1));
		}
		
		System.out.println("Palavra Criptografada: " + palavraCriptografada);
		

		sc.close();
	}

}
