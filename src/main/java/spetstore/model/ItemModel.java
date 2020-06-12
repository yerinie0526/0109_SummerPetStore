package spetstore.model;

public class ItemModel {
	private int itemId;
	private String istatus;
	private String itemKind;
	private String name;
	private int price;
	private String description;
	private int isGP;
	private int cateogryId;
	private int productId;
	public ItemModel() {
		
	}
	public ItemModel(int itemId, String istatus, String itemKind, String name, int price, String description, int isGP,
			int cateogryId, int productId) {
		super();
		this.itemId = itemId;
		this.istatus = istatus;
		this.itemKind = itemKind;
		this.name = name;
		this.price = price;
		this.description = description;
		this.isGP = isGP;
		this.cateogryId = cateogryId;
		this.productId = productId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getIstatus() {
		return istatus;
	}
	public void setIstatus(String istatus) {
		this.istatus = istatus;
	}
	public String getItemKind() {
		return itemKind;
	}
	public void setItemKind(String itemKind) {
		this.itemKind = itemKind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIsGP() {
		return isGP;
	}
	public void setIsGP(int isGP) {
		this.isGP = isGP;
	}
	public int getCateogryId() {
		return cateogryId;
	}
	public void setCateogryId(int cateogryId) {
		this.cateogryId = cateogryId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
}
