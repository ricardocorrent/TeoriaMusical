package models;

public class Sol implements Nota {
	
	private Nota proximoMeioTom;
	private Nota proximoTom;
	
	public Sol() {
		
	}
	
	public Sol(Nota proximoMeioTom, Nota proximoTom) {
		this.proximoMeioTom = proximoMeioTom;
		this.proximoTom = proximoTom;
	}

	@Override
	public String simbolo() {
		return "G";
	}

	@Override
	public Integer tom() {
		return 8;
	}

	@Override
	public Integer proximoMeioTom() {
		return this.proximoMeioTom.tom();
	}

	@Override
	public Integer proximoTom() {
		return this.proximoTom.tom();
	}

}
