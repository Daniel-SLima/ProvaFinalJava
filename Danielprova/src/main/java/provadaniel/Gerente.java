package provadaniel;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    @Override
    public String toString() {
        return "Gerente \n"+ super.toString() + "\nSalario Final: " + Util.formatarMonetario(this.getSalarioFinal());
    }

    @Override
    public double getSalarioFinal() {
        return super.getSalarioBonificacao();
                }
    
    
}
