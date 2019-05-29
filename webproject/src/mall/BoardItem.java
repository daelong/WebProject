//�����ͷκ��� �Խñ��� �д� �ڹٺ� Ŭ����
package mall;

import java.io.*;
import javax.servlet.*;
import java.sql.*;

public class BoardItem {
	public int seqNo; //����
	public String title; //����
	private String content; //����
	private String writer; //�ۼ���
	private Date date; //��������
	private Time time; //����ð�
	public BoardItem() {
	}
	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}

//	//�����ͺ��̽��κ��� �Խñ��� �д� �޼���
	public void readDB() throws ServletException{
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC","root","root");
			if(conn == null)
				throw new Exception("�����ͺ��̽��� ������ �� �����ϴ�.");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from boardinfo1 where seqNo = '" + seqNo + "';");
			if(rs.next()) {
				title = rs.getString("title");
				content = rs.getString("content");
				writer = rs.getString("writer");
				date = rs.getDate("date");
				time = rs.getTime("time");
			}
		}
		catch(Exception e) {
			throw new ServletException(e);
		}
		finally {
			try {
				stmt.close();
			}
			catch(Exception ignored	) {
			}
			try {
				conn.close();
			}
			catch(Exception ignored) {
			}
		}
	}
}
