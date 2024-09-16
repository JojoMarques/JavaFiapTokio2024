package logica.exercicios.aula11;

public class OperacoesMatematicas {

	private static float soma(float a, float b) {
		return a + b;
	}

	private static float subtracao(float a, float b) {
		return a - b;
	}

	private static float multiplicacao(float a, float b) {
		return a * b;
	}

	private static float divisao(float a, float b) {
		return a / b;
	}

	public static float chamaFuncao(float a, char operador, float b) {

		float resultado = 0;

		switch (operador) {
		case '+':
			resultado = soma(a, b);
			break;
		case '-':
			resultado = subtracao(a, b);
			break;
		case '*':
			resultado = multiplicacao(a, b);
			break;
		case '/':
			resultado = divisao(a, b);
			break;
		}

		return resultado;

	}
}
