package adapter;

public class Shirut {
	
	private String shemShelShirut;
	private String shemShelShirutSheni;
	
	public Shirut(String shemShelShirut, String shemShelShirutSheni) {
		this.shemShelShirut = shemShelShirut;
		this.shemShelShirutSheni = shemShelShirutSheni;
	}
	
	public void taseEtZe(){
		System.out.println("Ose et ze: " + this.shemShelShirut);
	}
	
	public void taseEtZeGam(){
		System.out.println("Ose et ze gam: " + this.shemShelShirutSheni);
	}


}
