
package by.module5.task11;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory {

	public static final String DEFAULT_PATHNAME = "c:'\'";
	
	private ArrayList<File> list;
	private String pathname;
	
	public Directory(String pathname) {
		this.setPathname(pathname);
		list = new ArrayList<File>();
	}
	
	public Directory() {
		this(null);
	}

	public String getPathname() {
		return pathname;
	}

	public void setPathname(String pathname) {
		this.pathname = pathname;
		if (pathname == null || pathname.isEmpty()) {
			this.pathname = DEFAULT_PATHNAME;
		}
	}
	
	public void addFile(File newFile) {
		
		if (newFile == null) {
			return;
		}
				
		while (true) {
			boolean notUnique;
			notUnique = isNameUnique(newFile.getName());
			
			if (notUnique) {
				String name = createUniqueName(newFile.getName());
				newFile.setName(name);
				continue;
			}
			break;
		}
		list.add(newFile);
	}

	public String createUniqueName(String name) {
		return "new " + name;
	}
	
	public void createFile(String filename) {
		addFile(new File(filename));
	}
	
	public void createFileByType(String filename, FileType type) {
		switch (type) {
		case TEXTFILE:
			addFile(new TextFile(filename));
			break;
		}
	}
	
	public void deleteFile(String filename) {
		if (getFile(filename) != null) {
			list.remove(getFile(filename));
		}
	}
	
	public void renameFile(String filename, String newName) {
		boolean notUnique;
		notUnique = isNameUnique(newName);
		
		if (!notUnique && getFile(filename) != null) {
			getFile(filename).setName(newName);
		}
	}
	
	public boolean isNameUnique(String filename) {
		boolean notUnique = false;
		
		for (File file: list) {
			if (file.getName().toLowerCase().contentEquals(filename)) {
				notUnique = true;
				break;
			}
		}
		return notUnique;
	}
	
	public ArrayList<File> getList() {
		return list;
	}
	
	public File getFile(String filename) {
		for (File file: list) {
			if (file.getName().toLowerCase().contentEquals(filename.toLowerCase())) {
				return file;
			}
		}
		return null;
	}
}
