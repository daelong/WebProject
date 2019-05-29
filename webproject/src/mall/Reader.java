package mall;

import java.sql.Date;
import java.sql.Time;

public class Reader {
	private String code;
	private String title;
	private String writer;
	private int price;
	
	public Reader() {
	}
	public String getCode() {
		return code;
	}
	public void setCode(String codde) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
