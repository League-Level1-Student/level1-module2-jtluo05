

public class Vault {
private int secretCode=0;

boolean tryCode(int guess) {
	return (guess==secretCode);
}
int getSecretCode() {
		return secretCode;
	}

	void setsecretcode(int secretcode) {
		this.secretCode = secretcode;
	}
}
