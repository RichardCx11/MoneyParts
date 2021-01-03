package MoneyParts;

import java.util.ArrayList;
import java.util.List;

public class MoneyParts {

	public static void main(String[] args) {
		System.out.println(build(0.1));
	}

	public static List<List<Double>> build(Double cantidad) {

		Double[] denominaciones = new Double[] { 0.05, 0.1, 0.2, 0.5, 1.0, 2.0, 5.0, 10.0, 20.0, 50.0, 100.0, 200.0 };
		List<List<Double>> resultado = new ArrayList<List<Double>>();

		for (Double valor : denominaciones) {
			List<Double> listaCombinaciones = new ArrayList<Double>();
			if (cantidad >= valor) {
				if (cantidad % valor == 0) {
					double repeticion = cantidad / valor;
					for (int i = 0; i < repeticion; i++) {
						listaCombinaciones.add(valor);
					}
					resultado.add(listaCombinaciones);
				}
			}
		}
		return resultado;
	}

}
