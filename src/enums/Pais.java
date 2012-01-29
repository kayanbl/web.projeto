package enums;

public enum Pais {

	ALEMANHA("Alemanha"), ARGENTINA("Argentina"), BRASIL("Brasil"), CHILE(
			"Chile"), ESPANHA("Espanha"), ESTADOSUNIDOS("Estados Unidos"), FRANCA(
			"França"), INGLATERRA("Inglaterra"), ITALIA("Itália"), HOLANDA(
			"Holanda"), PORTUGAL("Portugal"), OUTRO("Outro");

	private String label;

	public String getLabel() {
		return label;
	}

	Pais(String label) {
		this.label = label;
	}

}
