import java.util.Arrays;

public class AC1 {
    static int[] vetor = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	
    public int maior(){//definição do método maior() e como parâmetro queremos receber um array de números inteiros
        /*
        Lógica do método
            - o array já está ordenado, portanto não precisamos percorrê-lo para achar o maior valor, 
            naturalmente vai estar na última posição, e para acessar a última posição de qualquer array em qualquer linguagem 
            de programação, escrevemos o tamanho do array -1, porque todo array começa no indíce 0
        */
        Arrays.sort(AC1.vetor);
        return AC1.vetor[AC1.vetor.length -1];
    }
    public int menor(){//definição do método menor() e como parâmetro queremos receber um array de números inteiros
        /*
        Lógica do método
        - o array já está ordenado do maior para o menor, portanto já sabemos que o menor valor está na posição 0
        */
        Arrays.sort(AC1.vetor);
        return AC1.vetor[0];
    }
    public int soma(){//definição do método soma() e como parâmetro queremos receber um array de números inteiros
        /*
            Forma raíz de resolver sem usar API pronta
            int sum = 0;
            for (int value : array) {
                sum += value;
            }
            return sum;
        */

        /*
            Forma nutella(e ao mesmo tempo elegante) de somar os valores de um array utilizando a API de Streams do Java 8 e depois chamando o método sum()
        */
        return Arrays.stream(AC1.vetor).sum();
    }
    public int repeticoes(int numeroASerBuscado){
        int numeroDeVezesQueApareceNoVetor = 0;
        for (int i = 0; i < AC1.vetor.length; i++) {
            if (numeroASerBuscado == AC1.vetor[i]) {
                numeroDeVezesQueApareceNoVetor++;
            }
        }
        return numeroDeVezesQueApareceNoVetor;
    }

    public static void main(String[] args) {
        AC1 ac1 = new AC1();
        
		System.out.println("o Menor Numero : "+ ac1.menor());//executamos o método menor() passando o array ordenado
		System.out.println("O Maior Numero : "+ ac1.maior());//executamos o método maior() passando o array ordenado
        System.out.println("A soma é : "+ ac1.soma());//executamos o método soma() passando o array ordenado
        System.out.println("O número 940 aparece 2 vezes : " + ac1.repeticoes(940));

    }
}