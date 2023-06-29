package provadaniel;

import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario{
    protected Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao ;
    }
    
    public double getSalarioBonificacao() {
    return super.salario * bonificacao.valor + super.salario ;   
    }
    
    @Override
    public String toString() {
        return  super.toString() + "\nBonificacao: " + bonificacao.valor * 100 +"%"
                + "\nSalario Com bonificação: " + Util.formatarMonetario(this.getSalarioBonificacao());
    }


    
    
    
    
}
