package enumproject;
public enum Month {
JAN(1),FEB(2);
private int num;
Month(int num) {
this.num = num;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}

}
