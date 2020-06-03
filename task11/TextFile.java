package by.module5.task11;

public class TextFile extends File {
	public static final String DEFAULT_NAME = "TextFile";
	private String text;
	
	protected TextFile(String name) {
		super(name);
		text = new String();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void addText(String text) {
		this.text += text;
	}
	
	@Override
	public String toString() {
		return "TextFile [name=" + name + FileType.TEXTFILE.getExtension() + ", text=" + text + "]";
	}
}
