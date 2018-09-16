package models;

public class Si implements Nota {
	
	private Nota proximoMeioTom;
	private Nota proximoTom;
	
	public Si() {
		
	}
	
	public Si(Nota proximoMeioTom, Nota proximoTom) {
		this.proximoMeioTom = proximoMeioTom;
		this.proximoTom = proximoTom;
	}

	@Override
	public String simbolo() {
		return "B";
	}

	@Override
	public Integer tom() {
		return 12;
	}

	@Override
	public Integer proximoMeioTom() {
		return this.proximoMeioTom.tom();
	}

	@Override
	public Integer proximoTom() {
		return proximoTom.tom();
	}


}
