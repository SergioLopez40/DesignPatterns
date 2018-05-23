
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vendible moto = new HondaShadow();
		moto = new Flecos(moto);
		moto = new Exploradoras(moto);
		
		System.out.println(moto.getDescription());
		System.out.println("Precio:" + moto.getPrecio());
	
		Vendible moto1 = new HondaShadow();
		moto1 = new EscapeCromado(moto1);
		moto1 = new Exploradoras(moto1);
		moto1 = new Flecos(moto1);
		
		System.out.println(moto1.getDescription());
		System.out.println("Precio:" + moto1.getPrecio());
		
		Vendible moto2 = new Akt125SL();
		moto2 = new EscapeCromado(moto2);
		moto2 = new Exploradoras(moto2);
		moto2 = new Flecos(moto2);
		
		System.out.println(moto2.getDescription());
		System.out.println("Precio:" + moto2.getPrecio());
	}

}
