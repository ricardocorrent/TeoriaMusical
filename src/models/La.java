package models;

public class La implements Nota {
	
	private Nota proximoMeioTom;
	private Nota proximoTom;
	
	public La() {
		
	}
	
	public La(Nota proximoMeioTom, Nota proximoTom) {
		this.proximoMeioTom = proximoMeioTom;
		this.proximoTom = proximoTom;
	}

	@Override
	public String simbolo() {
		return "A";
	}

	@Override
	public Integer tom() {
		return 10;
	}

	@Override
	public Integer proximoMeioTom() {
		return this.proximoTom.tom();
	}

	@Override
	public Integer proximoTom() {
		return this.proximoTom.tom();
	}
	
	public Nota getProximoMeioTom() {
		return proximoMeioTom;
	}
	
	public Nota getProximoTom() {
		return proximoTom;
	}

}
