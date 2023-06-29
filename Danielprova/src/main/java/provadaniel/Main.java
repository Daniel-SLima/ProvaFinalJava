package provadaniel;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("165486", "Paulo augusto", "1357561237", "1657132135", new Endereco("Rua das aguas", "12", "1 andar", "41152035", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO), Setor.ENGENHARIA, Genero.MASCULINO, 4250.50, EstadoCivil.CASADO, LocalDate.of(1995, Month.MARCH, 05));
        Motoboy motoboy = new Motoboy("BA351534", "Carlos Rocha", "135442145", "147982654", new Endereco("Rua das neves", "2134", "2 andar", "54532124", "Salvador", UnidadeFederativa.BAHIA), Setor.OPERACOES, Genero.MASCULINO, 2250.45, EstadoCivil.SEPARADO, LocalDate.of(1980, Month.AUGUST, 20));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Daniel Lima", "165453143", "231549876", new Endereco("Rua das arvores", "2445", "8 andar", "013246516", "São Paulo", UnidadeFederativa.SAO_PAULO), Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 13755, EstadoCivil.CASADO, LocalDate.of(2002, Month.SEPTEMBER, 13));
        Diretor diretora = new Diretor(Bonificacao.DIRETOR, "Lara Luz", "165735132", "153721654", new Endereco("Rua das arvores", "2445", "8 andar", "124598432", "São Paulo", UnidadeFederativa.SAO_PAULO), Setor.RECURSOS_HUMANOS, Genero.FEMININO, 15640, EstadoCivil.CASADO, LocalDate.of(2004, Month.SEPTEMBER, 02));

                System.out.println("--Relação de Contratados da Empresa--" );
        diretora.admitir(diretora);
        diretora.admitir(gerente);
        diretora.demitir(motoboy);
        diretora.demitir(engenheiro);
        

        
        
    }
}
