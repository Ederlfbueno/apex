package vendinha;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class principal {
    public static void main(String[] args) {
        
    	// definição de arrays para armanezar os dados
        ArrayList<produto> produtos = new ArrayList<produto>();
        ArrayList<pedido> pedidos = new ArrayList<pedido>();

        // coloquei o menu em uma string, para diminuir o codigo no laço de repetição
        String menu = "O que deseja fazer?\n";
		        menu+= "1) Cadastrar produto\n";
		        menu+= "2) Efetuar pedido\n";
		        menu+= "3) Listar pedidos\n";
		        menu+= "4) Listar produtos\n";
		        menu+= "5) Fechar o caixa\n";
		        menu+= "6) Sair";
        
        int opcao = 0;  
        
        // laço principal 
        while (opcao != 6) {
        	opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            
            switch(opcao) {
	            case 1:
	            	// criei um metodo para cadastrar o produto
	            	// esse metedo tem retorno do tipo <produto> (classe definida)
	            	produtos.add(cadastrarProduto());
	            	break;
	            case 2:
	            	// criei um metodo para cadastrar o produto
	            	// esse metedo tem retorno do tipo <pedido> (classe definida)
	            	// esse metodo recebe a listagem de produtos
	            	// para uso em consultas
	            	pedidos.add(cadastrarPedido(produtos));
	            	break;
	            case 3: 
	            	//lista os pedidos cadastrados
	            	listaPedidos(pedidos);
	            	break;
	            case 4: 
	            	//lista os produtos cadastrados
	            	listaProdutos(produtos);
	            	break;
	            case 5:
	            	// calcula valor total dos pedidos cadastrados
	            	fechamentoCaixa(pedidos);
	            	opcao = 6;
	            	break;
            }
        }
    }
    
    // metodo paraa cadastrar produtos com retorno do tipo <produto>
    private static produto cadastrarProduto() {
    	
    	// crio a variavel do tipo produto (classe) para que pegue os mesmos
    	// atributos
		produto p = new produto(); 
	    p.descricao = JOptionPane.showInputDialog(null, "Informe a descrição do produto");
	    p.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor"));
	    
	    // retorno uma variavel do tipo <produto> com dados para ser adicionado
	    // na listagem de produtos 
	    return p;
    }
    
    // metodo paraa cadastrar produtos com retorno do tipo <pedido>
    private static pedido cadastrarPedido(ArrayList<produto> produtos) {
    	
    	// crio a variavel baseada na classe pedido
    	pedido p = new pedido(); 
	    
    	p.codigoItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o codigo do produto"));
    	
    	// crio uma string para o texto do panel quando for pedir quantidade
    	String pedirQuantidade = "informe a quantidade do produto \n"
    					+ "Produto selecionado: " + produtos.get(p.codigoItem).descricao;

    	// uso a string criada para solicitar quantidade
    	p.quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, pedirQuantidade));
    	
    	// calculo valor total do pedido
    	p.total = (produtos.get(p.codigoItem).valor * p.quantidade);
    	
    	// crio uma string para exibição do produto em messageDialog
    	String exibirProduto = "Código do produto: " + p.codigoItem +
    						   "\nDescrição do produto: " + produtos.get(p.codigoItem).descricao +
    						   "\nQuantidade: " + p.quantidade + 
    						   "\nValor unitario: " + produtos.get(p.codigoItem).valor + 
    						   "\nValor total: " + p.total;
    	
    	// uso a string criada para mostrar o produto
    	JOptionPane.showMessageDialog(null, exibirProduto);
    	
    	//variavel para testar se o usuario pagou valor correto
    	boolean pagou = false; 
    	
    	// laço do pagamento
    	while (!pagou) {
    		// receber valor pago com informações do total do pedido 
        	double valorPago = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor total: " + p.total +
        			"\nInforme o valor do pagamento"));
        	
        	if (valorPago < p.total) {
        		pagou = false; 
            	JOptionPane.showMessageDialog(null, "Valor invalido, informar novamente");
        	} else if (valorPago > p.total) { 
        		pagou = true; 
            	JOptionPane.showMessageDialog(null, "Seu troco é: R$ " + calcularTroco(valorPago, p.total));
        	} else {
        		pagou = true;
        	}
    		
    	}
    	
    	// retorno variavel do tipo <pedido> igual o retorno do metodo 
    	return p; 
    }
    
    private static double calcularTroco(double valorPago, double valorPedido) {
    	return valorPago - valorPedido; 
    }

    private static void listaPedidos(ArrayList<pedido> pedidos) {
    	
    	for(int i=0; i<pedidos.size(); i++) {
    		System.out.println("\n Codigo pedido: " + i + 
    						  "\n Codigo do item: " + pedidos.get(i).codigoItem +
    						  "\n Quantidade do item: " + pedidos.get(i).quantidade +
    						  "\n Valor total: " + pedidos.get(i).total); 
    	}
    }

    private static void listaProdutos(ArrayList<produto> produtos) {
    	
    	for(int i=0; i<produtos.size(); i++) {
    		System.out.println("\n Codigo produto: " + i + 
    						  "\n descrição do produto: " + produtos.get(i).descricao +
    						  "\n Valor do item: " + produtos.get(i).valor);
    	}
    }
    
    private static void fechamentoCaixa(ArrayList<pedido> pedidos) {
    	double valorTotalDia  = 0; 

    	for(int i=0; i<pedidos.size(); i++) {
    		valorTotalDia += pedidos.get(i).total; 
    	}
    	
    	JOptionPane.showMessageDialog(null, "Total de vendas no dia: R$ " + valorTotalDia);
    	
    }

}
