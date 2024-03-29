package javaoo.exercicios.applications.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import javaoo.exercicios.entities.Contract;
import javaoo.exercicios.entities.Installment;
import javaoo.exercicios.services.ContractService;
import javaoo.exercicios.services.PaypalService;

/**
 * 
 * @author manoansu
 * 
 * Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
n�mero de meses desejado.
A empresa utiliza um servi�o de pagamento online para realizar o pagamento das parcelas.
Os servi�os de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
por pagamento. Por enquanto, o servi�o contratado pela empresa � o do Paypal, que aplica
juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
Fazer um programa para ler os dados de um contrato (n�mero do contrato, data do contrato,
e valor total do contrato). Em seguida, o programa deve ler o n�mero de meses para
parcelamento do contrato, e da� gerar os registros de parcelas a serem pagas (data e valor),
sendo a primeira parcela a ser paga um m�s ap�s a data do contrato, a segunda parcela dois
meses ap�s o contrato e assim por diante. Mostrar os dados das parcelas na tela.
 *
 *Enter contract data
Number: 8028
Date (dd/MM/yyyy): 25/06/2018
Contract value: 600.00
Enter number of installments: 3
Installments:
25/07/2018 - 206.04
25/08/2018 - 208.08
25/09/2018 - 210.12
 */
public class MainContract {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Enter number of installments: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, n);
		
		System.out.println("Installments:");
		for (Installment x : contract.getInstallments()) {
			System.out.println(x);
		}
		
		sc.close();
	}
}
