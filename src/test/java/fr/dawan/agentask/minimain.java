package fr.dawan.agentask;

public class minimain {

	public static void main(String[] args) {
		int i=0,j,phin2;
		int p=7829,q=7841;

		int n = p*q;
		int phin = (p-1)*(q-1);
		int o = (p>q)?p:q;
		int pgcd1 = 1000000;

		System.out.println("n = " + n);
		System.out.println("phin = " + phin);
		
		System.out.println("o = " + o);
		
		for(i=o;i<=phin;i++) {
			j=i;phin2=phin;
			
			while(j!=phin2) {
				if(j>phin2) {
					j=j-phin2;
					System.out.println(j + " - " + phin2);
				} else {
					phin2=phin2-j;
					System.out.println(j + " - " + phin2);
				}
			}
			
			if(j==1) {
				pgcd1 = i;
				break;
			}
			
		}
		
		System.out.println("i = " + i);
		System.out.println("pgcd1 = " + pgcd1);


		
		
//		CryptitudeDao crpdao = new CryptitudeDao();
//		
//		String key = "kamoulox";
//		String str1 = "test";
//		String str2 = crpdao.encrypt(str1, key);
//		String str3 = crpdao.decrypt(str2, key);
//		System.out.println(str2);
//		System.out.println(str3);
//		
//		String charsetName ="UTF-8";
//		byte[] b01 = str1.getBytes();
//		System.out.println(b01);
	}

}
