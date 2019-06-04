package es.esi.cr.iso.gestionmesas.model.enums;

public enum MesaEnum {

	MESA_1(1, 2), MESA_2(2, 4), MESA_3(3, 6), MESA_4(4, 4);

	private int identificator;
	private int comensales;

	private MesaEnum(int identificator, int comensales) {
		this.identificator=identificator;
		this.comensales=comensales;
	}

	public int getId() {
		return identificator;
	}

	public void setId(int id) {
		this.identificator = id;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	

}
