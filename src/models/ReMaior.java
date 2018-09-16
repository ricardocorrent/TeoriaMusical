package models;

public class ReMaior implements Nota {
	
	private Nota proximoMeioTom;
	private Nota proximoTom;
	
	public ReMaior() {
		
	}
	
	public ReMaior(Nota proximoMeioTom, Nota proximoTom) {
		this.proximoMeioTom = proximoMeioTom;
		this.proximoTom = proximoTom;
	}

	@Override
	public String simbolo() {
		return "D#";
	}

	@Override
	public Integer tom() {
		return 4;
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
