package provadaniel;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String carteiraDeMotorista;

    public Motoboy(String carteiraDeMotorista, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.carteiraDeMotorista = carteiraDeMotorista;
    }

    public String getCarteiraDeMotorista() {
        return carteiraDeMotorista;
    }

    public void setCarteiraDeMotorista(String carteiraDeMotorista) {
        this.carteiraDeMotorista = carteiraDeMotorista;
    }

    @Override
    public String toString() {
        return "Motoboy:\n" + super.toString() +"\nCarteira De Motorista: " + carteiraDeMotorista 
                + "\nSalario Final: " + Util.formatarMonetario(this.getSalarioFinal());
    }

    @Override
    public double getSalarioFinal() {
     return super.salario;
    }
    
    
    
}
