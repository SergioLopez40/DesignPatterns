
public class ConcesionarioMotos {

	private MotoBuilder motoBuilder;
	
	public void construirMoto(){
		motoBuilder.crearMoto();
		motoBuilder.buildMarca();
		motoBuilder.buildModelo();
		motoBuilder.buildMotor();
	}
	
	public void setMotoBuilder(MotoBuilder mb){
		motoBuilder = mb;
	}
	
	public Moto getMoto(){
		return motoBuilder.getMoto();
	}
	
}
