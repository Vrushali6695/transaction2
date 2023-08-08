package transaction;

import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class transaction {
private String userName;
private int email;
private int busId;
private String busName;
private int price;
private int total;
private int date;
@Id
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getEmail() {
	return email;
}
public void setEmail(int email) {
	this.email = email;
}
public int getBusId() {
	return busId;
}
public void setBusId(int busId) {
	this.busId = busId;
}
public String getBusName() {
	return busName;
}
public void setBusName(String busName) {
	this.busName = busName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
@Override
public String toString() {
	return "transaction [userName=" + userName + ", email=" + email + ", busId=" + busId + ", busName=" + busName
			+ ", price=" + price + ", total=" + total + ", date=" + date + "]";
}

}
