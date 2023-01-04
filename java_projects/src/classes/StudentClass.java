/*
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
 * também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo,
 * quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é
 * 60% da nota). Você deve criar uma classe Student para resolver este problema
 */
package classes;

public class StudentClass {
	public String name;
	public double score1;
	public double score2;
	public double score3;

	public double finalScore() {
		return score1 + score2 + score3;
	}

	public double reproved() {
		return 60 - finalScore();
	}

	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", finalScore());
	}
}