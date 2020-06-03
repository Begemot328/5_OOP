package by.module5.task11;

/*  @author Yury Zmushko
 * 	Task 1.
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить.
 * 
 */

public class Task11 {
	
	public static void main(String[] args) {
		Directory directory = new Directory();
		
		directory.createFile("112");		
		directory.createFileByType("text1", FileType.TEXTFILE);
		directory.createFileByType("text1", FileType.TEXTFILE);
		directory.createFileByType("text2", FileType.TEXTFILE);
		TextFile textfile = (TextFile) directory.getFile("text1");
		textfile.addText("Fairy tale");
		directory.deleteFile("text2");
		directory.renameFile("text1", "Tale");		
		
		for (File file: directory.getList()) {
			System.out.println(file);
		}
	}	
}


