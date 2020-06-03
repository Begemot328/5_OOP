package by.module5.task11;

public class File {
	public static final String DEFAULT_NAME = "File";
	protected String name;
	
	protected File(String name) {
		this.setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
		if (name == null || name.isEmpty()) {
			this.name = DEFAULT_NAME;
		}
	}
	
	@Override
	public String toString() {
		return "File [name=" + name + "]";
	}

	public String getName() {
		return name;
	}
}
