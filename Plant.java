public abstract class Plant {
	int x, y;
	String type;
	private String representation;

	public Plant(String type, int xpos, int ypos) {
		setType(type);
		setX(xpos);
		setY(ypos);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public abstract String funFact();

	public String getRepresentation() {
		return representation;
	}

	public void setRepresentation(String representation) {
		this.representation = representation;
	}
}
