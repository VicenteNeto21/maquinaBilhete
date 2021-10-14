/**
 * 
 */
package Classes;

/**
 * Esta classe cria bilhetes de um valor especifico
 * ela pode receber valores e imprimir bilhetes.
 * @author Vicente Neto
 * @version 14/10/2021
 *
 */
public class MaquinaBilhete {
	private int preco;
	private int saldo;
	private int total;
	private int deficit;
	private int restante;
	protected int valor;
	/**
	 * 
	 * @param custoBilhete o custo do bilhete
	 */
	public MaquinaBilhete(int custoBilhete) {
		preco = custoBilhete;
		saldo = 0;
		total = 0;
		}
	/**
	 * Este metado retorna o valor do bilhete criado
	 * @return o preço do bilhete
	 */
	public int getPreco() {
		return preco;
		}
	/**
	 *  Este metado retorna o saldo inserido até o momento
	 * @return saldo inserido
	 */
		public int getSaldo() {
		return saldo;
		}
		/**
		 * Este metado soma ao saldo o valor passado
		 * @param quantia o valor a ser inserida
		 */
		public void inserirValores(int quantia) {
			saldo = saldo + quantia;
			}
			/**
			 * Este metado imprimi o bilhete depois de pago.
			 */
		public void imprimeBilhete() {
			System.out.println("# Bilhete #");
			System.out.println("# " + preco + " Centavos.#");
			total = total + saldo;
			saldo = 0;
		}
		/**
		 * 
		 * função que recebe valor digitado pelo usuário e ela faz a 
		 * validação ou não da compra, de acordo com o saldo do usuário e valor do bilhete,
		 * cujo saldo é atualizado a cada transação, mostra ainda se tem "troco".
		 * @param valor, retorna o valor total de inserções feitas pelo usuário.
		 * @return valor
		 */
			public int validarCompra(int valor) {
				if (saldo < preco) {
					deficit = preco - saldo;
					System.out.println("Para sua comprar ser concluida falta " + deficit);
				} else {
					System.out.println("Compra realizada no valor de R$ " + (preco) + " na bilheteria Sucesso");
				}
				return valor;
			}
			/**
			 * 
			 * @param valor retorna o valor restante da compra que foi realizado pelo o cliente
			 * @return Mostrar o restante da compra realizada
			 */
			
			public int restanteCompra(int valor) {
				if (saldo > preco) {
					restante = saldo - preco;
					System.out.println("Valor restante da sua comprar e de R$: " +restante);
				} else {
					
				}
				return valor;
			}
}
