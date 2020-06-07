
public class Mobile {
	
	private Screen screen;
	private Camera camera;
	
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	public Mobile(Screen screen, Camera camera) {
		this.screen = screen;
		this.camera = camera;
	}
	public Mobile() {
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return camera.toString() + screen.toString();
		
	}
}
