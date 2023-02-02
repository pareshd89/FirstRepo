package AccessSpecefiers;

public class Acess_Specefiers_Demo {
	
	private int studid;
	private String studnm;
	
	

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}
	
	public String getStudnm() {
		return studnm;
	}
	
	public void setStudnm(String studnm) {
		this.studnm = studnm;
	}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Acess_Specefiers_Demo asd=new Acess_Specefiers_Demo();
			asd.setStudid(101);
			asd.setStudnm("paresh");
			System.out.println(asd.getStudid());
			System.out.println(asd.getStudnm());
	}

}
