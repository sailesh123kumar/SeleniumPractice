package BuilderPatter;

public class Register {
	private String firstName;
	private String lastNmae;
	private String email;
	private String telephone;
	private String password;
	private String confirm;

	public Register(RegisterBuilder builder) {
		this.firstName = builder.firstName;
		this.lastNmae = builder.lastNmae;
		this.email = builder.email;
		this.telephone = builder.telephone;
		this.password = builder.password;
		this.confirm = builder.confirm;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastNmae() {
		return lastNmae;
	}

	public String getEmail() {
		return email;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirm() {
		return confirm;
	}

	public static class RegisterBuilder {

		private String firstName;
		private String lastNmae;
		private String email;
		private String telephone;
		private String password;
		private String confirm;

		public RegisterBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public RegisterBuilder setLastNmae(String lastNmae) {
			this.lastNmae = lastNmae;
			return this;
		}

		public RegisterBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public RegisterBuilder setTelephone(String telephone) {
			this.telephone = telephone;
			return this;
		}

		public RegisterBuilder setPassword(String password) {
			this.password = password;
			return this;
		}

		public RegisterBuilder setConfirm(String confirm) {
			this.confirm = confirm;
			return this;
		}

		public Register build() {
			return new Register(this);
		}

	}

}
