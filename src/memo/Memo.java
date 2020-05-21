package memo;

import java.sql.Timestamp;

public class Memo {

	private int mid;
	private String title;
	private String body;
	private Timestamp utime;

	public Memo(int mid, String title, String body, Timestamp utime) {
		this.mid = mid;
		this.title = title;
		this.body = body;
		this.utime = utime;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Timestamp getUtime() {
		return utime;
	}

	public void setUtime(Timestamp utime) {
		this.utime = utime;
	}

}
