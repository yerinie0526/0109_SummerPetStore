package summerpetstore.model;

import java.util.Date;

public class GpModel {
	
	private String gpStatus;
	private Date deadline;
	private int numOfCon;
	private int currentCon;
	private int price;
	private int sale;
	private int itemId;
	
	
	public GpModel(String gpStatus, Date deadline, int numOfCon, int currentCon, int price, int sale, int itemId) {
		super();
		this.gpStatus = gpStatus;
		this.deadline = deadline;
		this.numOfCon = numOfCon;
		this.currentCon = currentCon;
		this.price = price;
		this.sale = sale;
		this.itemId = itemId;
	}
	
	public GpModel() {
		
	}
	
	
	public GpModel(int itemId, String gpStatus, Date deadline, int numOfCon, int price) {
		this.gpStatus = gpStatus;
		this.deadline = deadline;
		this.numOfCon = numOfCon;
		this.price = price;
		this.itemId = itemId;
	}
	
	public String getGpStatus() {
		return gpStatus;
	}
	public void setGpStatus(String gpStatus) {
		this.gpStatus = gpStatus;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public int getNumOfCon() {
		return numOfCon;
	}
	public void setNumOfCon(int numOfCon) {
		this.numOfCon = numOfCon;
	}
	public int getCurrentCon() {
		return currentCon;
	}
	public void setCurrentCon(int currentCon) {
		this.currentCon = currentCon;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	

}
