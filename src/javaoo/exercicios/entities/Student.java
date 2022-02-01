package javaoo.exercicios.entities;

/**
 * 
 * @author manoansu Fazer um programa para ler o nome de um aluno e as tr�s
 *         notas que ele obteve nos tr�s trimestres do ano (primeiro trimestre
 *         vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual
 *         a nota final do aluno no ano. Dizer tamb�m se o aluno est� aprovado
 *         (APROVADO) ou n�o (REPROVADO) e, em caso negativo, quantos pontos
 *         faltam para o aluno obter o m�nimo para ser aprovado (que � 60% da
 *         nota). Voc� deve criar uma classe Student para resolver este
 *         problema.
 *
 */
public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}
	}

}
