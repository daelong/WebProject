//데이터로부터 게시글을 읽는 자바빈 클래스
package mall;

import java.io.*;
import javax.servlet.*;
import java.sql.*;

public class BoardItem {
	public int seqNo; //순번
	public String title; //제목
	private String content; //내용
	private String writer; //작성자
	private Date date; //저장일자
	private Time time; //저장시각
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

//	//데이터베이스로부터 게시글을 읽는 메서드
	public void readDB() throws ServletException{
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC","root","root");
			if(conn == null)
				throw new Exception("데이터베이스에 연결할 수 없습니다.");
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
