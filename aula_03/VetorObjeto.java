import java.util.Arrays;

public class VetorObjeto {
    private Object[] elementos;
    private int tamanho;

    public VetorObjeto(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }
    public adiciona(Object elemento) throws Exception {
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++
        } else {
            throw new Exception("O Vetor já esta cheio e não é possível adicionar novos elementos.")
        }
    }
    public int tamanho(){
        return this.tamanho;
    }
}
