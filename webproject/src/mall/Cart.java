//장바구니 데이터를 표현하는 클래스
package mall;

import java.util.LinkedList;

public class Cart {
	private LinkedList<String> titleList = new LinkedList<String>(); //게시글 제목
	private LinkedList<Integer> numberList = new LinkedList<Integer>(); // 수
	
	//관심글 목록에 게시글 정보를 추가하는 메소드
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
	public int getSize() { //장바구니에 있는 항목의 수를 리턴하는 메서드
		return titleList.size();
	}
}
