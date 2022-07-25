import java.util.Objects;

public class u {
	private int UID;
	private String UName;
	private String password;
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public u(int uID, String uName, String password) {
		super();
		UID = uID;
		UName = uName;
		this.password = password;
	}
	public u() {}
	@Override
	public String toString() {
		return "u [UID=" + UID + ", UName=" + UName + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(UID, UName, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		u other = (u) obj;
		return UID == other.UID && Objects.equals(UName, other.UName) && Objects.equals(password, other.password);
	}
	
}
