package by.module5.task11;

public enum FileType {
	TEXTFILE("txt");
	
	public String extension;
	
	FileType(String extension) {
		this.extension = extension;
	}

	public String getExtension() {
		return extension;
	}
}
