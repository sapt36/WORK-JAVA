class classroom{
	private int door;
	private int chair;
	public void setDoorChair(int door,int chair){
		this.chair = chair;
		this.door = door;
	}

}
public class ClassLoading{
	public static void main(String[] args) {
		classroom class307 = new classroom();
		class307.setDoorChair(25,46);
		System.out.println("what u want is: "+setDoorChair());
	}
}