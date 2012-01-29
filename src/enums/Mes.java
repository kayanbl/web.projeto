package enums;

public enum Mes {

	JAN("Janeiro"), FEV("Fevereiro"), MAR("Março"), ABR("Abril"), MAI("Maio"), JUN(
			"Junho"), JUL("Julho"), AGO("AGosto"), SET("Setembro"), OUT(
			"Outubro"), NOV("Novembro"), DEZ("Dezembro");

	private String label;

	public String getLabel() {
		return label;
	}

	private Mes(String label) {
		this.label = label;
	}

}
