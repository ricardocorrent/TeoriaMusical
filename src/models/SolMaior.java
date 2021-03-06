package models;

public class SolMaior implements Nota {
	
	private Nota proximoMeioTom;
	private Nota proximoTom;
	
	public SolMaior() {
		
	}
	
	public SolMaior(Nota proximoMeioTom, Nota proximoTom) {
		this.proximoMeioTom = proximoMeioTom;
		this.proximoTom = proximoTom;
	}

	@Override
	public String simbolo() {
		return "G#";
	}

	@Override
	public Integer tom() {
		return 9;
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
