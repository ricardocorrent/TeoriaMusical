package models;

public class Fa implements Nota {
	
	private Nota proximoMeioTom;
	private Nota proximoTom;
	
	public Fa() {
		
	}
	
	public Fa(Nota proximoMeioTom, Nota proximoTom) {
		this.proximoMeioTom = proximoMeioTom;
		this.proximoTom = proximoTom;
	}

	@Override
	public String simbolo() {
		return "F";
	}

	@Override
	public Integer tom() {
		return 6;
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
