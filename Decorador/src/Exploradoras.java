
public class Exploradoras extends MotoDecorador {

	public Exploradoras(Vendible vendible) {
		super(vendible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return getVendible().getDescription() + "+ Exploradoras led";
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return getVendible().getPrecio() + 50000;
	}

}
