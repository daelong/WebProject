//장바구니 데이터를 표현하는 클래스
package mall;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;

public class Cart {
	private LinkedList<Integer> seqNoList = new LinkedList<Integer>(); // 수
	private LinkedList<String> titleList = new LinkedList<String>(); //게시글 제목
	private ArrayList<String> writerList = new ArrayList<String>(); //작성자
	private ArrayList<Date> dateList = new ArrayList<Date>(); //날짜
	private ArrayList<Time> timeList = new ArrayList<Time>(); //시간
	
	//관심글 목록에 게시글 정보를 추가하는 메소드
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
//	public int getSize() { //장바구니에 있는 항목의 수를 리턴하는 메서드
//		return writerList.size();
//	}
	public int getSize() {
		return writerList.size();
	}
}
