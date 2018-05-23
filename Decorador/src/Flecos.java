
public class Flecos extends MotoDecorador{

	public Flecos(Vendible vendible) {
		super(vendible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return getVendible().getDescription() + "+ Flecos";
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return getVendible().getPrecio() + 100000;
	}

}
