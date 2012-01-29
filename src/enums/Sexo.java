package enums;

public enum Sexo {

	M("Masculino"), F("Feminino");

	private String label;

	public String getLabel() {
		return label;
	}

	private Sexo(String label) {
		this.label = label;
	}
}
