package ko.co.himedia.fileupload;

/*
 * 	ID NUMBER PRIMARY KEY
	, TITLE VARCHAR2(200) NOT NULL
	, CATEGORY VARCHAR2(30) 
	, OFILE VARCHAR2(100) NOT NULL
	, SFILE VARCHAR2(30) NOT NULL
	, POSTDATE DATE DEFAULT SYSDATE NOT NULL
 */
public class HiFileDTO {
	
	private String id;
	private String title;
	private String category;
	private String ofile;
	private String sfile;
	private String postdate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getOfile() {
		return ofile;
	}
	public void setOfile(String ofile) {
		this.ofile = ofile;
	}
	public String getSfile() {
		return sfile;
	}
	public void setSfile(String sfile) {
		this.sfile = sfile;
	}
	public String getPostdate() {
		return postdate;
	}
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	
	
}
