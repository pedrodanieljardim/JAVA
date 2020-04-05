package entities;

public class produto {
			public String nome;
			public double preco;
			public double quantidade;
			public double total;
			
			//this referencia o objeto e não o parâmetro
			// construtor obriga o programador a entrar com os dados diretamente no objeto
			
			public produto(String nome,double preco,double quantidade) {
				
				// sintaxe simples para construtor: public nome_do_objeto e como parametro variáveis temporárias;
				// this referencia a variáveis do objeto e atribuindo a eles a variável local que é a temporária,
				// assim nunca acontecendo de variável não ficar sem valor!
				
				this.nome=nome;
				this.preco=preco;
				this.quantidade=quantidade;
			}
			
			public void calcula_estoque() {
				this.total=this.quantidade*this.preco;
			}
			
			public void entrada_produto(double entrada) {
				this.quantidade=this.quantidade+entrada;
				this.total=this.quantidade*this.preco;
			}
			
			public void saida_produto(double saida) {
				this.quantidade=this.quantidade-saida;
				this.total=this.quantidade*this.preco;
			}
			
			public String toString() {
				return "PRODUTO:"+nome+", Preço Unitário: R$ "+String.format("%.2f",preco)+", Quantidade:"+String.format("%.0f",quantidade)+", Valor do Estoque Total: R$"+String.format("%.2f",total);
			}
		}
