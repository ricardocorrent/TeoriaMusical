package models;

public class Do implements Nota{
	
	private Nota meioTom;
	private Nota tom;
	
	public Do() {

	}
	
	public Do(Nota meioTom, Nota tom) {
		this.meioTom = meioTom;
		this.tom = tom;
	}
	
	@Override
	public String simbolo() {
		return "C";
	}

	@Override
	public Integer tom() {
		return 1;
	}
	
	@Override
	public Integer proximoMeioTom() {
		return meioTom.tom();
	}

	@Override
	public Integer proximoTom() {
		return tom.tom();
	}
	

}
