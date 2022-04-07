kage tiposprimitivos;

import java.util.Scanner;  // Importanto a biblioteca pra Ler entrada de dados.


public class TiposPrimitivos {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); // Criando um objeto pra ler entrada de dados pelo teclado. Esse objeto tem o nome de "teclado".
        
        System.out.print("Digite o Nome do aluno: "); // Mostrando mensagem na tela
        String nome = teclado.nextLine(); // Mandando o programa guardar a informação escrita na mensagem acima dentro da variável "nome" como String.
        // O String está escrito com letra maiúscula porque ele é uma classe, o tipoPrimitivo "char" só aceita uma letra e não uma palavra.
        
        
        System.out.print("Digite a Nota desse aluno: "); // Mostrando mensagem na tela
        float nota = teclado.nextFloat(); // Mandando o programa guardar a informação escrita na mensagem acima dentro da variável "nota" como Float.
        
        
        
        
        
        System.out.format("A nota de %s é %.2f \n", nome, nota);
        
        
        
    }
    
}
