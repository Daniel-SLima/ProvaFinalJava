package provadaniel;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements  Contratacao{
    private final double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO * super.salario;
    }

    @Override
    public double getSalarioFinal() {
    return super.getSalarioBonificacao() + this.getPREMIO();   
    }
    
    @Override
    public String toString() {
        return "Diretora \n"+ super.toString() + "\nPremio: " + PREMIO * 100 + "%" 
                + "\nSalario Final: " + Util.formatarMonetario(this.getSalarioFinal());
    }
    

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\nAdmitindo Funcionario: \n" + funcionario.toString());    
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("\nDemitindo Funcionario: \n" + funcionario.toString());
    }


    
    
}
