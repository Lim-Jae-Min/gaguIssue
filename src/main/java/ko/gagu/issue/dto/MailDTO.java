package ko.gagu.issue.dto;

import org.apache.ibatis.type.Alias;

@Alias(value="mail")
public class MailDTO {
	private String[] address;
    private String title;
    private String content;
	public String[] getAddress() {
		return address;
	}
	public void setAddress(String[] address) {
		this.address = address;
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
}
