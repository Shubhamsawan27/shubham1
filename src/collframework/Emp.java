package collframework;

public class Emp {
	private int empNo;
	private String ename;
	private double empSal;
	
	


	public Emp(int empNo, String ename, double empSal) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.empSal = empSal;
	}
	
	
	public int getEmpNo() {
		return empNo;
	}



	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public double getEmpSal() {
		return empSal;
	}



	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}





	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", ename=" + ename + ", empSal=" + empSal + "]";
	}


	public static void main(String[] args) {
		
	}

}
