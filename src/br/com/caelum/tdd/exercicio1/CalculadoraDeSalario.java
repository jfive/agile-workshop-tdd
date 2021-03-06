package br.com.caelum.tdd.exercicio1;

import static br.com.caelum.tdd.exercicio1.Cargo.DBA;
import static br.com.caelum.tdd.exercicio1.Cargo.DESENVOLVEDOR;
import static br.com.caelum.tdd.exercicio1.Cargo.TESTER;
import static br.com.caelum.tdd.exercicio1.Cargo.GERENTE;;

public class CalculadoraDeSalario {


	public double calcula(Funcionario funcionario) {
		if(DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return dezOuVintePorcento(funcionario);
		}
		
		if(DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
			return quinzeOuVinteCincoPorcento(funcionario);
		}
		
		if(GERENTE.equals(funcionario.getCargo())){
			return quinzeOuVintePorcento(funcionario);
		}
		
		throw new RuntimeException("funcionario invalido");
	}

	private double quinzeOuVintePorcento(Funcionario employee) {
		if(employee.getSalarioBase() > 3000.0) {
			return employee.getSalarioBase() * 0.8;
		}
		else {
			return employee.getSalarioBase() * 0.85;
		}
	}

	private double dezOuVintePorcento(Funcionario employee) {
		if(employee.getSalarioBase() > 3000.0) {
			return employee.getSalarioBase() * 0.8;
		}
		else {
			return employee.getSalarioBase() * 0.9;
		}
	}

	private double quinzeOuVinteCincoPorcento(Funcionario employee) {
		if(employee.getSalarioBase() > 2000.0) {
			return employee.getSalarioBase() * 0.75;
		}
		else {
			return employee.getSalarioBase() * 0.85;
		}
	}

}
