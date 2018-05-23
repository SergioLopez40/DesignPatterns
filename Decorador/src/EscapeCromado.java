
public class EscapeCromado extends MotoDecorador {

	public EscapeCromado(Vendible vendible) {
		super(vendible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return getVendible().getDescription() + "+ Escape Cromado de lujo";
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return getVendible().getPrecio() + 500000;
	}

}
