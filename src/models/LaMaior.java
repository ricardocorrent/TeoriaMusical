package models;

public class LaMaior implements Nota {
	
	private Nota proximoMeioTom;
	private Nota proximoTom;
	
	public LaMaior() {

	}
	
	public LaMaior(Nota proximoMeioTom, Nota proximoTom) {
		this.proximoMeioTom = proximoMeioTom;
		this.proximoTom = proximoTom;
	}

	@Override
	public String simbolo() {
		return "A#";
	}

	@Override
	public Integer tom() {
		return 11;
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
