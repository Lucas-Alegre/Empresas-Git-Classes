package Empresa;

public class Region {

	private String localidad;

	public Region(String localidad) {
		this.localidad = localidad;
	}

	public String getLocalidad() {
		return localidad;
	}
	@Override
	public String toString() {
		return "Region [localidad=" + localidad + "]";
	}
}
