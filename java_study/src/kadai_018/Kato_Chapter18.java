package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	
	
	public static void commonIntroduce(String setGiveName, String familyName, String address){
		System.out.println("名前は" + familyName + setGiveName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	abstract public void eachIntroduce();
	
	public void execIntoduce() {
		commonIntroduce(this.givenName, this.familyName, this.address);
		eachIntroduce();
	}
	}
