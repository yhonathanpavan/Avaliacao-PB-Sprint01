public class Funcionario {

    //Atributos
    String nome;
    double salario;
    double bonus;
    double salarioLiquido;

    public double getDesconto() {
        return desconto;
    }

    double desconto = 0;

    //Metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
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
            System.out.println(this.salarioLiquido);
        }else{
            System.out.println("Não é permitido valores negativos!");
        }

    }

    public double getBonus() {
        return bonus;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

}
