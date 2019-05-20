package mall;

import java.io.*;
import java.sql.*;
import javax.servlet.*;

public class BBSItem {
    private int seqNo;         // 순번
    private String title;      // 제목
    private String content;    // 내용
    private String writer;     // 작성자
    private Date date;         // 저장일자
    private Time time;         // 저장시각
    public BBSItem() {
    }
    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }
    public String getTitle() {
         return title;
    }
    public String getContent() {
         return content;
    }
    public String getWriter() {
         return writer;
    }
    public Date getDate() {
         return date;
    }
    public Time getTime() {
         return time;
    }
    public void readDB() throws ServletException {      // 데이터베이스로부터 게시글을 읽는 메서드
        Connection conn = null;
        Statement stmt = null;
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            //conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:/wdbpool");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC", "root", "root");
            if (conn == null)
                throw new Exception("데이터베이스에 연결할 수 없습니다.");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from bbs where seqNo = '" + seqNo + "';");
            if (rs.next()) {
                title = rs.getString("title");         // 제목
                content = rs.getString("content");     // 내용
                writer = rs.getString("writer");       // 작성자
                date = rs.getDate("wdate");            // 저장일자
                time = rs.getTime("wtime");            // 저장시각
            }
        }
        catch (Exception e) {
            throw new ServletException(e);
        }
        finally {
            try { 
                stmt.close();
            } 
            catch (Exception ignored) {
            }
            try { 
                conn.close();
            } 
            catch (Exception ignored) {
            }
        }
    }
    private String toUnicode(String str) {    // ISO-8859-1 문자열을 Unicode 문자열로 바꾸는 메서드
        if (str == null)
            return null;
        try {
            byte[] b = str.getBytes("ISO-8859-1");
            return new String(b);
        }
        catch (java.io.UnsupportedEncodingException uee) {
            System.out.println(uee.getMessage());
            return null;
        }
    }
}