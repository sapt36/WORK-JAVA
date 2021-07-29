class CredictCard{
	
	private String id;
	private int money;
	
	CredictCard(){
		this.id = "";
		this.money = 0;
	}
	
	CredictCard(String newID,int newMoney){
		this.id = newID;
		this.money = newMoney;
	}
	
	public String getID(){
		return id;
	}
	
	public void setID(String newID){
		this.id = newID;
	}
	
	public int getMoney(){
		return money;
	}
	
	public void setMoney(int newMoney){
		this.money = newMoney;
	}
}
class CredictCard_2{
	public static void main(String args[]){
		CredictCard cd = new CredictCard();
		cd.setID("sapt");
		String cdID = cd.getID();
		System.out.println(cdID);
		cd.setMoney(8888);
		int cdMoney = cd.getMoney();
		System.out.println(cd.getMoney());
	}
}