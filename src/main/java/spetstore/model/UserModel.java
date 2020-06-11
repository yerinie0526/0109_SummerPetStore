package spetstore.model;

public class UserModel {
	
	private String userId; //ex) yerinie0526
	private String username; //ex) ÀÌ¿¹¸°
	private String password;
	private String email;
	private String address;
	private String phone;
	
	public UserModel(String userId, String username, String password, String email, String address, String phone) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
