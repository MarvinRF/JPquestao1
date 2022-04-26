package entities;

public class Aluno {

	private static final int pesoTrabalho = 2;

	private static final double pesoProva = 2.5;
	
	private String matricula;
	private String name;
	private double prova1;
	private double prova2;
	private double trabalho;

	public Aluno(String matricula, String name, double prova1, double prova2, double trabalho) {

		this.matricula = matricula;
		this.name = name;
		this.prova1 = prova1;
		this.prova2 = prova2;
		this.trabalho = trabalho;
	}

	public double media() {
		return ((prova1 * pesoProva) + (prova2 * pesoProva) + (trabalho * pesoTrabalho)) / 7;

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getProva1() {
		return prova1;
	}

	public void setProva1(double prova1) {
		this.prova1 = prova1;
	}

	public double getProva2() {
		return prova2;
	}

	public void setProva2(double prova2) {
		this.prova2 = prova2;
	}

	public double getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}

	public String toString() {
		return "Matricula: " + matricula + "\n" + "Nome: " + getName() + "\n" + "Nota da prova 1: " + prova1 + "\n"
				+ "Nota da prova 2: " + prova2 + "\n" + "Nota do trabalho: " + trabalho + "\n"
				+ "Media final do aluno: " + String.format("%.2f%n", media());
	}
}
