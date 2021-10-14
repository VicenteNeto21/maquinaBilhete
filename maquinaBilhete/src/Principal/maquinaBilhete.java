/**
 * 
 */
package Principal;

import Classes.MaquinaBilhete;

/*A classe Scanner tem como objetivo separar a entrada dos textos em blocos, gerando os conhecidos tokens, que são sequências de 
caracteres separados por delimitadores que por padrão correspondem aos espaços em branco, tabulações e mudança de linha.
Com essa classe podem ser convertidos textos para tipos primitivos, sendo que esses textos podem ser considerados como objetos 
do tipo String, InputStream e arquivos.*/

import java.util.Scanner;

public class maquinaBilhete {
	
	public static void main(String[] args) {
		int num;
		MaquinaBilhete bilhete = new MaquinaBilhete(100);
		Scanner lerValor = new Scanner(System.in);
		bilhete.imprimeBilhete();
		/*Criado um do while para realizar a leitura dos valores que serão obtidos por meio do usuario */
		do {
			System.out.print("Digite o valor do Bilhete em centavos: ");
			num = lerValor.nextInt();
			bilhete.inserirValores(num);
			bilhete.validarCompra(num);
			bilhete.restanteCompra(num);
			/*Este comando serve para verificar o valor total inserido pelo usuario */
		} while (bilhete.getSaldo() < bilhete.getPreco());
		System.out.println("Valor total inserido: " + bilhete.getSaldo() + " centavos");
		
		/*Sites usado para concluir essas modificações:
		 * https://www.devmedia.com.br/system-out-objeto-de-saida-em-java/25240
		 * http://kaioferreira.blog.br/controle-de-fluxo-for-while-do-while/
		 * http://kaioferreira.blog.br/manipulando-dados-com-o-pacote-scanner-entrada-de-informacoes-no-sistema/
		 * */
	}

}
