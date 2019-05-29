//�Խñ� ����� �д� �ڹٺ� Ŭ����
package mall;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
public class BoardList {
	private ArrayList<Integer> seqNoList = new ArrayList<Integer>(); //�۹�ȣ
	private ArrayList<String> writerList = new ArrayList<String>(); //�̸�
	private ArrayList<String> titleList = new ArrayList<String>(); //����
	private ArrayList<Date> dateList = new ArrayList<Date>(); //��¥
	private ArrayList<Time> timeList = new ArrayList<Time>(); //�ð�
	private boolean lastPage = false; //������ ������ ����
	
	public BoardList() {
	}
	public void setSeqNo(int index, Integer seqNoList) {
		this.seqNoList.add(index, seqNoList);
	}
	public void setWriter(int index, String writer) {
		this.writerList.add(index, writer);
	}
	public void setTitle(int index, String title) {
		this.titleList.add(index, title);
	}
	public void setDate(int index, Date date) {
		this.dateList.add(index, date);
	}
	public void setTime(int index, Time time) {
		this.timeList.add(index, time);
	}
	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}
	public Integer[] getSeqNo() {
		return seqNoList.toArray(new Integer[seqNoList.size()]);
	}
	public String[] getWriter() {
		return writerList.toArray(new String[writerList.size()]);
	}
	public String[] getTitle() {
		return titleList.toArray(new String[titleList.size()]);
	}
	public Date[] getDate() {
		return dateList.toArray(new Date[dateList.size()]);
	}
	public Time[] getTime() {
		return timeList.toArray(new Time[timeList.size()]);
	}
	public boolean isLastPage() {
		return lastPage;
	}
	public int getListSize() {
		return seqNoList.size();
	}
}
