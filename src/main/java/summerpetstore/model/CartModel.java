package summerpetstore.model;

public class CartModel {
	
	private int itemId;
	private String iname;
	private int price;
	private int inStock;
	private int quantity;
	private int orderId;
	private String userId;
	
	public CartModel() {
		
	}
	
	public CartModel(int itemId, String iname, int price, int inStock, int quantity, int orderId, String userId) {
		super();
		this.itemId = itemId;
		this.iname = iname;
		this.price = price;
		this.inStock = inStock;
		this.quantity = quantity;
		this.orderId = orderId;
		this.userId = userId;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getInStock() {
		return inStock;
	}
	public void setInStock(int inStock) {
		this.inStock = inStock;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
	

}
