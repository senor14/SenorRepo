import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
	public static void main(String[] args) {
		
		//List�������̽��� �޸𸮿� �ø� �� ���� ������ ArrayList Ŭ������ ���� �޸𸮸� �ø�
		List<String> rList = new ArrayList<>();
		
		//List �÷��� �����ӿ�ũ�� �����͸� �߰���
		rList.add("������");
		rList.add("ȫ�浿");
		rList.add("�Ӳ���");
		rList.add("��浿");
		
		//�迭ũ�� ���
		System.out.println("�迭�� ũ�� "+ rList.size());
		
		for(int i = 0; i < rList.size(); i++)
		{
			System.out.println("[" + i + "]��° �迭 ������ : " + rList.get(i));
		}
		
		//List�÷����� ���� ����� �����͸� ������ �� for���� ���� �ʰ�, while���� ���� ������
		Iterator<String> it = rList.iterator();
		while (it.hasNext())
		{
			String name = (String) it.next();
			
			System.out.println("�̸� : "+ name);
		}
	}
}
