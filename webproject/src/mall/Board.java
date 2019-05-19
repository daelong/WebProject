package mall;

import java.sql.*;
import java.util.ArrayList;
public class Board {
	private ArrayList<Integer> boardIDList = new ArrayList<Integer>(); //글번호
	private ArrayList<String> nameList = new ArrayList<String>(); //이름
	private ArrayList<String> titleList = new ArrayList<String>(); //제목
	private ArrayList<String> boardList = new ArrayList<String>(); //글내용
	private ArrayList<Date> dateList = new ArrayList<Date>(); //날짜
	private ArrayList<Time> timeList = new ArrayList<Time>(); //시간
	private boolean lastPage = false; //마지막 페이지 여부
	
	public Board() {
	}
	public void setBoardID(int index, Integer boardID) {
		this.boardIDList.add(index, boardID);
	}
	public void setName(int index, String name) {
		this.nameList.add(index, name);
	}
	public void setTitle(int index, String title) {
		this.titleList.add(index, title);
	}
	public void setBoard(int index, String board) {
		this.boardList.add(index, board);
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
	public Integer[] getBoardID() {
		return boardIDList.toArray(new Integer[boardIDList.size()]);
	}
	public String[] getName() {
		return nameList.toArray(new String[nameList.size()]);
	}
	public String[] getTitle() {
		return titleList.toArray(new String[titleList.size()]);
	}
	public String[] getBoard() {
		return boardList.toArray(new String[boardList.size()]);
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
		return boardIDList.size();
	}
}
