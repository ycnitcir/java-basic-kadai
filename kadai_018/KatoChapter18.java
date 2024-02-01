package kadai_018;

abstract public class KatoChapter18 {
	
			public String familyName = "加藤";	//姓
			public String givenName = "";		//名
			public String address = "";			//住所
			
			public void commonIntroduce() {
				System.out.println("名前は" + this.familyName + this.givenName +"です");
				System.out.println("住所は" + this.address +"です");				
			}
			
			abstract public void eachIntroduce();
			
			public void execIntroduce() {
				
				commonIntroduce();
				eachIntroduce();
				System.out.println("");
			}
			
}
