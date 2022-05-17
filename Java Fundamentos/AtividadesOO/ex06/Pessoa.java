package AtividadesOO.ex06;

import javax.swing.JOptionPane;

public class Pessoa {
    
    // Atributos
	private String nome;
    private double peso, altura;

	// Métodos
	public Pessoa(){
        obterDados();
        JOptionPane.showMessageDialog(null, mensagem());
    }

	private void obterDados(){
        nome = JOptionPane.showInputDialog(null, "Informe o nome");
        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura"));
    }

	private double calculoImc(){
        return peso / (altura * altura);
    }

    private String situacaoImc(double imc){
        String situacao;

        if(imc <= 18.5){
            situacao = "Abaixo do peso";
        }else if(imc <= 25){
            situacao = "Peso normal";
        }else if(imc <= 30){
            situacao = "Acima do peso";
        }else if(imc <= 35){
            situacao = "Obesidade I";
        }else if(imc <= 40){
            situacao = "Obesidade II";
        }else{
            situacao = "Obesidade III";
        }

        return situacao;
    }
	
    private String mensagem(){
        return nome + " está "+situacaoImc(calculoImc())+" com IMC de "+calculoImc();
    }

}
