package bitcamp.java142.ch4;

import bitcamp.java142.common.CommonUtils;

public class StringExtension_1 {

	//
	public static String extensionMethod(String fullName){//StringŸ����  �Լ� extensionMethod()�� �ν��Ͻ��Ѵ�.�Ű������� StringŸ���� fullName�� �޾ƿ´�
		String extens = ""; //StringŸ���� extens�� �ʱ�ȭ ����Ʈ��null
		if (fullName != null && fullName.length()>0){ //if�� ���ǹ� : �Ű����� fullName�� ���� �ƴϰ� ���̰�0���� ��� ������ �����Ѵ�. (String�����Ͱ� �ִٸ�)
			int index = fullName.indexOf('.'); // indexOf()�Լ��� �̿��Ͽ� ����'.'�� �ش��ϴ� ÷�ڸ� intŸ���� ���� index�� ���ε��Ѵ�
			extens = fullName.substring(index+1);
		}//if��
		return extens;
	}//�Լ���
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String fullName = "Hello.doc";
		String fullName = "Hello.java";
		
		String extens = StringExtension_1.extensionMethod(fullName);
		if ("java".equals(extens)){
			System.out.println("Ȯ���� >>> :"+extens);
		}
		if ("doc".equals(extens)){
			System.out.println("Ȯ���� >>> :"+extens);
			System.out.println("ms doc MINE TYPE : application/msword");
		}
		
		String extens1 = CommonUtils.extensionMethod(fullName);
		if ("java".equals(extens1)){
			System.out.println("CommonUtils���� �ҷ��� �Լ��� Ȯ���� >>> :"+extens1);
		}
		if ("doc".equals(extens1)){
			System.out.println("CommonUtils���� �ҷ��� �Լ��� Ȯ���� >>> :"+extens1);
			System.out.println("ms doc MINE TYPE : application/msword");
		}
	
	}//main��

}//Ŭ������


/*
 int indexOf(int ch) : �־��� ����ch�� ���ڿ��� �����ϴ��� Ȯ���Ͽ� ��ġ(index)�� �˷��ش�. ��ã���� -1���� /������int
 */

/*String fullName = "Hello.doc";�϶�
Ȯ���� >>> :doc
ms doc MINE TYPE : application/msword
CommonUtils���� �ҷ��� �Լ��� Ȯ���� >>> :doc
ms doc MINE TYPE : application/msword
*/

/*	String fullName = "Hello.java";�϶�
 Ȯ���� >>> :java
CommonUtils���� �ҷ��� �Լ��� Ȯ���� >>> :java
 */

 