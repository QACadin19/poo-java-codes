package aula11_herança;

public class Professor extends Pessoa {
    private float salario;
    private String especialidade;

    public void receberAum (float aum) {
        this.salario += aum;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
