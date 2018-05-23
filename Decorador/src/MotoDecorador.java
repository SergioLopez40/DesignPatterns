
public abstract class MotoDecorador implements Vendible {
	private Vendible vendible;
	
	public Vendible getVendible() {
		return vendible;
	}

	public void setVendible(Vendible vendible) {
		this.vendible = vendible;
	}

	public MotoDecorador(Vendible vendible){
		setVendible(vendible);
	}

}
