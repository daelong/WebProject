package Model;

public class FourRulesModel {
	private int num1;
	private int num2;
	private int sum;
	private int delete;
	private int product;
	private int quotient;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getSum() {
		return num1 + num2;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getDelete() {
		return num1 - num2;
	}
	public void setDelete(int delete) {
		this.delete = delete;
	}
	public int getProduct() {
		return num1*num2;
	}
	public void setProduct(int product) {
		this.product = product;
	}
	public int getQuotient() {
		return num1/num2;
	}
	public void setQuotient(int quotient) {
		this.quotient = quotient;
	}
}
