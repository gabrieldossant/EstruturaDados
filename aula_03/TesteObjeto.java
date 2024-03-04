package aula_03;

public class TesteObjeto {
    public static void main(String[] args) throws Exception {
        VetorObjeto vetor = new VetorObjeto(5);

        Contato c1 = new Contato("Claudio", "(99) 999-9999", "teste@gmail.com");
        Contato c2 = new Contato("Flynn", "(99) 999-9999", "teste@gmail.com");
        Contato c3 = new Contato("Walter", "(99) 999-9999", "teste@gmail.com");

        System.out.println("Quantidade de informações no vetor" + vetor.tamanho());
        System.out.println("Dados do vetor " + vetor);
    }
}