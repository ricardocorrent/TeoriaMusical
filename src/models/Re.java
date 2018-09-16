package models;

public class Re implements Nota {
	
	private Nota proximoMeioTom;
	private Nota proximoTom;
	
	public Re() {
		
	}
	
	public Re(Nota proximoMeioTom, Nota proximoTom) {
		this.proximoMeioTom = proximoMeioTom;
		this.proximoTom = proximoTom;
	}

	@Override
	public String simbolo() {
		return "D";
	}

	@Override
	public Integer tom() {
		return 3;
	}

	@Override
	public Integer proximoMeioTom() {
		return proximoMeioTom.tom();
	}

	@Override
	public Integer proximoTom() {
		return proximoTom.tom();
	}
	
	public Nota getProximoMeioTom() {
		return proximoMeioTom;
	}
	
	public Nota getProximoTom() {
		return proximoTom;
	}

}
