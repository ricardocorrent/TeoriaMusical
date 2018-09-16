package models;

public class DoMaior implements Nota {

	private Nota meioTom;
	private Nota tom;

	public DoMaior() {
            
	}
        
        public DoMaior(Nota meioTom, Nota tom) {
		this.meioTom = meioTom;
		this.tom = tom;
	}
	
	@Override
	public String simbolo() {		
		return "C#";
	}

	@Override
	public Integer tom() {
		return 2;
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
