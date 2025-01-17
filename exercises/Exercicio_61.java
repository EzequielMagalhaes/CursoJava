import java.util.Locale;
import java.util.Scanner;

public class Exercicio_61 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*EXERCICIO - TEM CORREÇÃO!
1. Uma empresa deseja automatizar o processamento de seus contratos. O processamento de um contrato consiste em gerar as parcelas a serem pagas para aquele
contrato, com base no número de meses desejado.
A empresa utiliza um 'serviço de pagamento' online para realizar o pagamento das parcelas. Os serviços de pagamento online tipicamente cobram um juro mensal,
bem como uma taxa por pagamento. Por enquanto, o serviço contratado pela empresa é do PayPal, que aplica juros simples de '1%' a cada parcela, mais uma taxa
de pagamento de '2%'. 
Fazer um programa para ler os dados de um contrato(número do contrato, data do contrato e valor total do contrato). Em seguida, o programa deve ler o número
de meses para parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas(data e valor), sendo a primeira parcela a ser paga um mês após
a data do contrato, a segunda parcela dois meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.
*/