
public abstract class MotoBuilder {
	protected Moto moto;
	
	public Moto getMoto(){
		return moto;
	}
	
	public void crearMoto(){
		moto = new Moto();
	}
	
	public abstract void buildMotor();
	public abstract void buildModelo();
	public abstract void buildMarca();

}
