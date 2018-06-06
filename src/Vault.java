

public class Vault {
private int secretcode=0;

boolean tryCode(int guess) {
	return (guess==secretcode);
}
int getsecretcode() {
		return secretcode;
	}

	void setsecretcode(int secretcode) {
		this.secretcode = secretcode;
	}
}
