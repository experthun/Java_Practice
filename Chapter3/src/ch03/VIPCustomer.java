package ch03; //���� Ŭ����

public class VIPCustomer extends Customer { //��������� ������ �޸𸮰� �־����
	
	double salesRatio;
	String agentID;
	
	/*public VIPCustomer() {
		
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
				
	}*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) call");
	}
	
	public String getAgentID() {
		
		return agentID;
	}
}