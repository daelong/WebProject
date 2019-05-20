package mall;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

public class CartList {
	private ArrayList<String> titleList = new ArrayList<String>(); //����
	private ArrayList<Integer> numberList = new ArrayList<Integer>(); //��
	
	public CartList() {
	}
	public void setTitle(int index, String title) {
		this.titleList.add(index, title);
	}
	public void setNumber(int index, Integer number) {
		this.numberList.add(index, number);
	}
	public String[] getTitle() {
		return titleList.toArray(new String[titleList.size()]);
	}
	public Integer[] getNumber() {
		return numberList.toArray(new Integer[numberList.size()]);
	}
	// ��ٱ��� ��Ͽ� �ִ� �׸��� ���� �����ϴ� �޼���
	public int getSize() {
		return titleList.size();
	}
}
