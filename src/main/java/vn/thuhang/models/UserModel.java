package vn.thuhang.models;

import java.io.Serializable;
import java.sql.Date;

public class UserModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String email;
	private String password;
	private String fullname;
	private String image;
	private String phone;
	private int roleid;
	private Date createdate;
	
	
	
	public UserModel(int id, String username, String email, String password, String fullname, String image, String phone,
			int roleid, Date createdate) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
		this.image = image;
		this.phone = phone;
		this.roleid = roleid;
		this.createdate = createdate;
	}
	
	



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getRoleid() {
		return roleid;
	}


	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}


	public UserModel() {
		super();
	}

	public UserModel(String username, String email, String password, String fullname, String image, String phone,
			int roleid, Date createdate) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
		this.image = image;
		this.phone = phone;
		this.roleid = roleid;
		this.createdate = createdate;
	}

	public Date getCreatedate() {
		return createdate;
	}


	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", fullname=" + fullname + ", image=" + image + ", phone=" + phone + ", roleid=" + roleid
				+ ", createdate=" + createdate + "]";
	}
	
	
}
