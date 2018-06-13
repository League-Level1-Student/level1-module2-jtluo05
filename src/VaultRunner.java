import java.util.Random;

public class VaultRunner {


	public static void main(String[] args) {
		Vault vault = new Vault();
Random r=new Random();

		vault.setsecretcode(r.nextInt(1000000));
	JamesBond jb=new JamesBond();
int rt=	jb.findCode(vault);

	if (rt==-1) {
	System.out.println("uh oh you didnt crack the safe "
			+ "nice try");	
	}
	else {
		System.out.println("Good job James Bond! You have "
			+ "unlocked the vault and you are now able to "
			+ "take all of the money in the vault. Just "
			+ "so you know, the "
			+ "code was "+ vault.getSecretCode());
	}
	}

	}
