
public class HondaBuilder extends MotoBuilder {

	@Override
	public void buildMotor() {
		// TODO Auto-generated method stub
		Motor motor = new Motor();
		motor.setNumero(21345);
		motor.setPotencia("80 caballos de fuerza");
		moto.setMotor(motor);
	}

	@Override
	public void buildModelo() {
		// TODO Auto-generated method stub
		moto.setModelo("Shadow");
	}

	@Override
	public void buildMarca() {
		// TODO Auto-generated method stub
		moto.setMarca("Honda");
	}
	

}
