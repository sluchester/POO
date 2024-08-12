package engtelecom.poo;

public class Pilha<E> {
    private final int POSICAO_MENOS_UM = -1;
    private E[] vetor;
    private int posicao = 0;

    public Pilha(int tamanho) {
        vetor = (E[]) new Object[tamanho];
    }

    public boolean verificaSeCheia(){
        if(posicao == vetor.length){
            return true;
        } else{
            return false;
        }
    }

    public boolean verificaSeVazia(){
        if(posicao == POSICAO_MENOS_UM){
            return true;
        } else{
            return false;
        }
    }

    public void adicionar(E elemento) throws PilhaCheiaException {
        //verifica se está cheia
        //se estiver, joga exceção
        //se não estiver, adiciona o elemento
        if(verificaSeCheia()){
            throw new PilhaCheiaException("A pilha está cheia");
        } else{
            vetor[posicao]= elemento;
            posicao++;
        }
    }

    public E remover() throws PilhaVaziaException {
        //verifica se está vazia
        //se estiver vazia, exceção vazia
        //se não, desempilha e retorna o elemento
        if(verificaSeVazia()){
            throw new PilhaVaziaException("A pilha está Vazia");
        } else{
            E element = vetor[posicao-1];
            vetor[posicao] = null;
            posicao--;
            return element;
        }
    }

    public int tamanhoPilha() {
        return this.posicao;
    }
}
