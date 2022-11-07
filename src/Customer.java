
public class Customer {
	private String userName;
	private String password;
	private String image;
	private int para;
	
	public Customer() {
		this.userName = "Ad Yok";
		this.password = "Password Yok"; 
		this.image    = "Image Yok"; 
		this.para     = 0; 
	}
	
	public Customer(String name) {
		this.userName = name;
		this.password = "Password Yok"; 
		this.image = "Image Yok"; 
		this.para = 0; 
	}
	
	public Customer(String name, String password) {
		this.userName = name;
		this.password = password; 
		this.image = "Image Yok"; 
		this.para = 0; 
	}
	public Customer(String name, String password,String image) {
		this.userName = name;
		this.password = password; 
		this.image = image; 
		this.para = 0; 
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPara() {
		return para;
	}
	public void setPara(int para) {
		this.para = para;
	}

	
}
