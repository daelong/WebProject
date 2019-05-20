//��ٱ��� �����͸� ǥ���ϴ� Ŭ����
package mall;

import java.util.LinkedList;

public class Cart {
	private LinkedList<String> titleList = new LinkedList<String>(); //�Խñ� ����
	private LinkedList<Integer> numberList = new LinkedList<Integer>(); // ��
	
	//���ɱ� ��Ͽ� �Խñ� ������ �߰��ϴ� �޼ҵ�
	public void addItem(String title, int num) {
		for(int cnt = 0; cnt < titleList.size(); cnt++) {
			if(titleList.get(cnt).equals(title)) {
				numberList.set(cnt, numberList.get(cnt)+num);
				return;
			}
		}
		titleList.add(title);
		numberList.add(num);
	}
	public String getTitle(int index) {
		return titleList.get(index);
	}
	public int getNumber(int index) {
		return numberList.get(index);
	}
	public int getSize() { //��ٱ��Ͽ� �ִ� �׸��� ���� �����ϴ� �޼���
		return titleList.size();
	}
}
