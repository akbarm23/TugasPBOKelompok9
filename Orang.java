public class abstract Orang {
	private long id;
	private String name;
	private String email;
	private long noTlp;
	
	public Orang(long id, String name, String email, long noTlp){
		this.id=id;
		this.name=name;
		this.email=email;
		this.noTlp=noTlp;
	}
	public void setId(long id){
		this.id=id;
	}
	public long getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public long getNoTlp(){
		return noTlp;
	}
	public void setNoTlp(long noTlp){
		this.noTlp=noTlp;
	}
}

