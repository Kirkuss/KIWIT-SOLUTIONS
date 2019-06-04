package es.esi.cr.iso.gestionmesas.model.enums;

public enum SourceConcernEnum {
	
	APPLICATION(1, "Applications"), SERVICE(2, "Services"), PROCESS(3, "Processes");
	
	private int identificator;
	private String label;
	
	private SourceConcernEnum(int identificator, String label) {
		this.identificator=identificator;
		this.label=label;
	}

	public int getId() {
		return identificator;
	}

	public void setId(int id) {
		this.identificator = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
