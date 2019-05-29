//��ٱ��� �����͸� ǥ���ϴ� Ŭ����
package mall;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;

public class Cart {
	private LinkedList<Integer> seqNoList = new LinkedList<Integer>(); // ��
	private LinkedList<String> titleList = new LinkedList<String>(); //�Խñ� ����
	private ArrayList<String> writerList = new ArrayList<String>(); //�ۼ���
	private ArrayList<Date> dateList = new ArrayList<Date>(); //��¥
	private ArrayList<Time> timeList = new ArrayList<Time>(); //�ð�
	
	//���ɱ� ��Ͽ� �Խñ� ������ �߰��ϴ� �޼ҵ�
	public void addItem(String writer, int num) {
		for(int cnt = 0; cnt < writerList.size(); cnt++) {
			if(writerList.get(cnt).equals(writer)) {
				seqNoList.set(cnt, seqNoList.get(cnt) + num);
				return;
			}
		}
		writerList.add(writer);
		seqNoList.add(num);
	}
	public String getTitle(int index) {
		return titleList.get(index);
	}
	public int getSeqNo(int index) {
		return seqNoList.get(index);
	}
	public String getWriter(int index) {
		return writerList.get(index);
	}
	public Date getDate(int index) {
		return dateList.get(index);
	}
	public Time getTime(int index) {
		return timeList.get(index);
	}
//	public int getSize() { //��ٱ��Ͽ� �ִ� �׸��� ���� �����ϴ� �޼���
//		return writerList.size();
//	}
	public int getSize() {
		return writerList.size();
	}
}
