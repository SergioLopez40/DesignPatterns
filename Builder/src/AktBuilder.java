
public class AktBuilder extends MotoBuilder {

	@Override
	public void buildMotor() {
		// TODO Auto-generated method stub
		Motor motor = new Motor();
		motor.setNumero(23514);
		motor.setPotencia("50 caballos de fuerza");
		moto.setMotor(motor);
	}

	@Override
	public void buildModelo() {
		// TODO Auto-generated method stub
		moto.setModelo("125 SL");
	}

	@Override
	public void buildMarca() {
		// TODO Auto-generated method stub
		moto.setMarca("AKT");
	}
	
}
