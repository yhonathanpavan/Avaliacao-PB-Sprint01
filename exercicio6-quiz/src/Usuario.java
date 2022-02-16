public class Usuario {

    //Atributos
    private String nome;
    int acertos;
    int erros;

    //Metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAcertos() {
        return acertos;
    }

    public int getErros() {
        return erros;
    }

    public void acertouPergunta(){
        this.acertos++;
    }

    public void errouPergunta(){
        this.erros++;
    }


}
