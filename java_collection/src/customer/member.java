package customer;

public class member {
	private String id;			// 아이디
	private String email;		// 이메일
	private String password;	// 비밀번호
	private String tel;			// 연락천
	private String nickName;	// 닉네임
	private int midd; 			// 회원번호 - 1000001
	

	public member() {}
	public member(String id, String password) {
		this.id=id;
		this.password=password;
	}
	public member(String id,String password,String email,String tel,String name, int midd) {
		this.id=id;
		this.password=password;
		this.email=email;
		this.tel=tel;
		this.nickName=name;
		this.midd=midd;
		
	}
	@Override
	public boolean equals(Object o) {
		member tmp = (member)o;		// 멤버타입으로 형변화
		if( this.id.equals(tmp.id)) {					// 입력한 아이디와 일치하는가?
			return this.password.equals(tmp.password);	// 입력한 비밀번호와 일치하는가?
		}
		return false;	// 아이디가 일치하지않으면 false 변환
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	private int mid;			// 회원번호 - 1000001
}
