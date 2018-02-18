
public class AnObject {

	int number;
	String text;
	double decimalVal;
		
	AnObject(){		
		this.number = 0;
		this.text = "";
		this.decimalVal = 0.0;		
	}
	
	AnObject(int num,String txt,double dec){		
		this.number = num;
		this.text = txt;
		this.decimalVal = dec;		
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public double getDecimalVal() {
		return decimalVal;
	}

	public void setDecimalVal(double decimalVal) {
		this.decimalVal = decimalVal;
	}

	
}
