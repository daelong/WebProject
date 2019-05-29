package mall;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

public class CartList {
	private ArrayList<Integer> seqNoList = new ArrayList<Integer>(); //순번
	private ArrayList<String> titleList = new ArrayList<String>(); //제목
	private ArrayList<String> writerList = new ArrayList<String>(); //작성자
	private ArrayList<Date> dateList = new ArrayList<Date>(); //날짜
	private ArrayList<Time> timeList = new ArrayList<Time>(); //시간
	
	public CartList() {
	}
	public void setSeqNo(int index, Integer seqNo) {
		this.seqNoList.add(index, seqNo);
	}
	public void setTitle(int index, String title) {
		this.titleList.add(index, title);
	}
	public void setWriter(int index, String writer) {
		this.writerList.add(index, writer);
	}
	public void setDate(int index, Date date) {
		this.dateList.add(date);
	}
	public void setTime(int index, Time time) {
		this.timeList.add(time);
	}
	public Integer[] getSeqNo() {
		return seqNoList.toArray(new Integer[seqNoList.size()]);
	}
	public String[] getTitle() {
		return titleList.toArray(new String[titleList.size()]);
	}
	public String[] getWriter() {
		return writerList.toArray(new String[writerList.size()]);
	}
	public Date[] getDate() {
		return dateList.toArray(new Date[dateList.size()]);
	}
	public Time[] getTime() {
		return timeList.toArray(new Time[timeList.size()]);
	}
	// 장바구니 목록에 있는 항목의 수를 리턴하는 메서드
	public int getSize() {
		return writerList.size();
	}
}
