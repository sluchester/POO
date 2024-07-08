package engtelecom;
//documentacao javadoc: /** + enter
//sempre colocar acima de um método, uma classe, ...

/**
 * Representa um carro em um jogo de corrida
 *
 * @author sluchester
 * Para esta classe, podemos usar o comando ctrl + spaceBar para ver algumas acoes
 */
public class Carro {
    private int velocidadeAtual;

    /**
     * Incrementa a velocidade do carro de acordo com o parâmetro fornecido
     * @param i  incremento da velocidade
     * @return  nova velocidade do carro
     */
    public int acelerar(int i){
        this.velocidadeAtual = velocidadeAtual + i;
        return this.velocidadeAtual;
    }

    /**
     * Decrementa a velocidade do carro de acordo com o parâmetro fornecido para frenagem
     * @param i decremento na velocidade
     * @return nova velocidade menor que a anterior
     */
    public int frear(int i){
        this.velocidadeAtual = velocidadeAtual - i;
        return this.velocidadeAtual;
    }
}
