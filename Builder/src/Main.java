
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcesionarioMotos cm = new ConcesionarioMotos();
		cm.setMotoBuilder(new HondaBuilder());
		cm.construirMoto();
		Moto moto = cm.getMoto();
		
		System.out.println(moto.getMarca());
		System.out.println(moto.getModelo());

	}

}
