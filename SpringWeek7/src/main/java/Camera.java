
public class Camera {
	
	private int pixels;

	public int getNo_of_pixels() {
		return pixels;
	}

	public void setNo_of_pixels(int pixels) {
		this.pixels = pixels;
	}

	@Override
	public String toString() {
		return "Camera [no_of_pixels=" + pixels + "]\n";
	}
}
