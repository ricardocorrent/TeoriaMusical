package models;

public class Mi implements Nota {
	
	private Nota proximoMeioTom;
	private Nota proximoTom;
	
	public Mi() {
		
	}
	
	public Mi(Nota proximoMeioTom, Nota proximoTom) {
		this.proximoMeioTom = proximoMeioTom;
		this.proximoTom = proximoTom;
	}

	@Override
	public String simbolo() {
		return "E";
	}

	@Override
	public Integer tom() {
		return 5;
	}

	@Override
	public Integer proximoMeioTom() {
		return this.proximoMeioTom.tom();
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
