package bitcamp.java142.ch6;

import java.io.File;
//���ٴ� ���� ���� ���ε�,�ٿ�ε��� �� �� ����
import java.io.FileWriter;

//����ϴ� ���������� ������ �����Ǵ� ��ΰ� �ٸ� -> �����Ǵ� ���Ȯ���ϴ� ���� �߿���
public class FileTest_2 {
	
	
	public static final String DIR_PATH = "D:\\00.BITCAMP\\java142\\babyjava\\src\\bitcamp\\java142\\ch6\\";
//	public static final String DIR_PATH = "D:/00.BITCAMP/java142/babyjava/src/bitcamp/java142/ch6/";
	
	//����° ����
	public static void fileList(String dir){
		File f = new File(dir);
		System.out.println("new file >>> : " + f);
		File files[] = f.listFiles();
		for(int i=0; i<files.length; i++){
			String fileName = files[i].getName();
			System.out.println("fileName ["+i+"]"+ " >>> :" + fileName);
		}//for��
	}//fileList Ŭ���� ��
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String strVal = "ccccc";
//		
//		File f = new File( DIR_PATH + strVal);
//		System.out.println("f >>> : " + f );
//		System.out.println("f.getAbsolutePath() >>> : " + f.getAbsolutePath());
//		boolean b = f.isDirectory();
//		boolean b1 = f.isFile();
//		
//		if(!f.exists() || !f.isDirectory()){
//		System.out.println("���丮�� �����ϴ�." );
//		System.out.println("���丮 ����� >>> :" );
////		File dir  = new File (strVal);//������������������ ã�ƿ� //dir >>> aaaaa //babyjava���� ������� 
//		File dir  = new File (DIR_PATH + strVal); //dir >>> D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\bbbbb
//		System.out.println("���� dir ��� >>> : " + dir );
//		
//		
//		//mkdir()�� createNewFile()�̿��ؼ� ���ϸ����
//		dir.mkdir();
//		File file = new File(dir,dir.getName() + ".txt");
//		System.out.println("file >>> : " + file);
//		file.createNewFile(); // ��ġ�ϴ� ������ �������� �ʴ´ٸ� �ڵ����� �� ���� �������
//		FileWriter fw = null;
//		fw = new FileWriter(file);//�������θ������� �ι��������ϸ�ȵ�
//		System.out.println("fw >>> : " + fw);
//		fw.write("���Ͽ� ������ ���ϴ�~~");
//		System.out.println("(log) fw.write �Ϸ� ");
//		fw.close();
//				
//		
//		}else{
//			System.out.println("f1.isDirectory() <<<>>> : " + b);
//			System.out.println("f1.isFile <<<>>> : " + b1);
//		}//if-else��

		
//		// �ι�° ����
//		String strVal = "ddddd";
//		
//		File f = new File( DIR_PATH + strVal);
//		System.out.println("f >>> : " + f );
//		System.out.println("f.getAbsolutePath() >>> : " + f.getAbsolutePath());
//		boolean b = f.isDirectory();
//		boolean b1 = f.isFile();
//		
//		if(!f.exists() || !f.isDirectory()){
//		System.out.println("���丮�� �����ϴ�." );
//		System.out.println("���丮 ����� >>> :" ); 
//		File dir  = new File (DIR_PATH + strVal + "/"); // ����  (+ "/" )����
//		System.out.println("���� dir ��� >>> : " + dir );
//		
//		
//		
//		//mkdir()�� createNewFile()�̿��ؼ� ���ϸ����
//		dir.mkdir();
//		File file = new File(dir,dir.getName() + ".txt");
//		System.out.println("file >>> : " + file);
//		file.createNewFile(); // ��ġ�ϴ� ������ �������� �ʴ´ٸ� �ڵ����� �� ���� �������//�������θ������� if�ȿ��־ �ι��������ϸ�ȵ�
//		
//			if(dir.exists()){
//				FileWriter fw = null;
//				fw = new FileWriter(file);
//				System.out.println("fw >>> : " + fw);
//				fw.write("ddddd.txt���Ͽ� ������ ���ϴ�~~");
//				System.out.println("(log) fw.write �Ϸ� ");
//				fw.close();
//				
//			}//if��
////		System.exit(0);//���α׷� ���� ��ɾ� // 0,1,2: ���ͷ� : ���α׷� ������ �Ǹ� ���ϴ� ����  (�ڱⰡ ���ϴ� ������ ����)
//		}else{
//			System.out.println("f1.isDirectory() <<<>>> : " + b);
//			System.out.println("f1.isFile <<<>>> : " + b1);
//		}//if-else��
//		
//		File files[] = f.listFiles();
//		for (int i=0; i<files.length; i++){
//			String fileName = files[i].getName();
//			System.out.println("fileName ["+i+"]"+ " >>> :" + fileName);
//			
//		}//for��
//		
//	}//main ��
//
//}//class ��
		
// ����° ����
		String strVal = "eeeee";
		
		File f = new File( DIR_PATH + strVal);
		System.out.println("f >>> : " + f );
		System.out.println("f.getAbsolutePath() >>> : " + f.getAbsolutePath());
		boolean b = f.isDirectory();
		boolean b1 = f.isFile();
		
		if(!f.exists() || !f.isDirectory()){
		System.out.println("���丮�� �����ϴ�." );
		System.out.println("���丮 ����� >>> :" ); 
		File dir  = new File (DIR_PATH + strVal + "/"); // ����  (+ "/" )����
		System.out.println("���� dir ��� >>> : " + dir );
		
		
		
		//mkdir()�� createNewFile()�̿��ؼ� ���ϸ����
		dir.mkdir();
		File file = new File(dir,dir.getName() + ".txt");
		System.out.println("file >>> : " + file);
		file.createNewFile(); // ��ġ�ϴ� ������ �������� �ʴ´ٸ� �ڵ����� �� ���� �������//�������θ������� if�ȿ��־ �ι��������ϸ�ȵ�
		
			if(dir.exists()){
				FileWriter fw = null;
				fw = new FileWriter(file);
				System.out.println("fw >>> : " + fw);
				fw.write("ddddd.txt���Ͽ� ������ ���ϴ�~~");
				System.out.println("(log) fw.write �Ϸ� ");
				fw.close();
				
			}//if��
//				System.exit(0);//���α׷� ���� ��ɾ� // 0,1,2: ���ͷ� : ���α׷� ������ �Ǹ� ���ϴ� ����  (�ڱⰡ ���ϴ� ������ ����)
		}else{
			System.out.println("f1.isDirectory() <<<>>> : " + b);
			System.out.println("f1.isFile <<<>>> : " + b1);
		}//if-else��
		
		File files[] = f.listFiles();
		for (int i=0; i<files.length; i++){
			String fileName = files[i].getName();
			System.out.println("fileName ["+i+"]"+ " >>> :" + fileName);
			
		}//for��
		
	}//main ��

}//class ��

/*
boolean/ exists(): Tests whether the file or directory denoted by this abstract pathnameexists. /���ϰ� : boolean 
boolean/ mkdir() :Creates the directory named by this abstract pathname.
boolean/ mkdirs() :Creates the directory named by this abstract pathname, including anynecessary but nonexistent parent directories. 
boolean/ createNewFile() :Atomically creates a new, empty file named by this abstract pathname ifand only if a file with this name does not yet exist. 
 * */
/* ����° ���
f >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ccccc
f.getAbsolutePath() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ccccc
���丮�� �����ϴ�.
���丮 ����� >>> :
���� dir ��� >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ccccc
file >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ccccc\ccccc.txt
fw >>> : java.io.FileWriter@15db9742
(log) fw.write �Ϸ� 
*/

/* �׹�° ��� "����Ʈ������"
f >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ddddd
f.getAbsolutePath() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ddddd
���丮�� �����ϴ�.
���丮 ����� >>> :
���� dir ��� >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ddddd
file >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ddddd\ddddd.txt
fw >>> : java.io.FileWriter@6996db8
(log) fw.write �Ϸ� 
fileName [0] >>> :ddddd.txt

---���丮�� ���� ������ ����
f >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ddddd
f.getAbsolutePath() >>> : D:\00.BITCAMP\java142\babyjava\src\bitcamp\java142\ch6\ddddd
f1.isDirectory() <<<>>> : true
f1.isFile <<<>>> : false
fileName [0] >>> :ddddd.txt
*/