import javax.imageio.ImageTypeSpecifier;

public class TeaParty {
	String name;
	boolean isWoman;
	boolean isKnighted;

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String message = "Hello";
		this.name = name;
		this.isWoman = isWoman;
		this.isKnighted = isKnighted;
		if (isKnighted & !isWoman) {
		message=	 message +" Sir " + name;
		}
		else if (isKnighted & isWoman) {
			message= message +" Lady " + name;
		} else if (isWoman) {
		message=	 message +" Ms. " + name;
		}else if (!isWoman){
		message=	 message +" Mr. " + name;
		}
		
		System.out.println(message);
return message;
	}

	String getName() {
		return name;
	}

	boolean getGender() {
		return isWoman;
	}

	boolean getEyes() {
		return isKnighted;
	}

}
