public class Funcionario {

    //Atributos
    String nome;
    double salario;
    double bonus;
    double salarioLiquido;
    double desconto = 0;


    public double getDesconto() {
        return desconto;
    }

    //Metodos
    public Funcionario(String nome, double salario){
        if(salario>= 0) {

            this.salario = salario;

            if (salario <= 1000) {
                this.bonus = salario * 0.2;
            }
            else if (salario <= 2000) {
                this.bonus = salario * 0.1;
            }
            else {
                this.desconto = salario * 0.1;
            }
            this.salarioLiquido = (salario - desconto) + bonus;
        }else{
            System.out.println("Não é permitido valores negativos!");
            System.exit(1);
        }

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

}
