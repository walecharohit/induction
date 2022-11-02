package facaderesource;

public class Manufacturer{
	
	private Samsung mobile;
	private Samsung television;
	private Samsung camera;
	
	public Manufacturer(){
		mobile = new Mobile();
		television = new Television();
		camera = new Camera();
	}
	
	public void getMobile(){
		mobile.manufacture();
	}
	
		public void getTelevision(){
			television.manufacture();
	}

		public void getCamera(){
			camera.manufacture();
	}
}
