==split( )==  -> verilen karaktere göre String i bölerek String dizisine atar
==concat( )== -> bir stringi diğeri ile birleştirir, + yerine concat getiriyoruz 
==contains( )== -> aranan harfler stringin içinde var mı yok mu onu verir, boolean döndürür
==equals( )== -> stringleri birbirleriyle karşılaştırır, boolean döndürür
					integer larda == kullanılıyordu
==equalsIgnoreCase( )== -> büyük küçük harf ayrımı yapmaz
==isEmpty( )== -> string içinde karakter var mı yok mu
==substring( )== -> string den parça alır, örneğin:
                      substring(3,9) -> 3 den başla 9 a kadar al, 9 dahil değil
                      tek parametre verilirse, oradan sona kadar gidiyor
==startsWith( )== -> bununla başlıyor mu, boolean döndürür
==endsWith( )== -> verilen karakter ile bitiyor mu, boolean döndürür
==toLowerCase( )==
==toUpperCase( )==
==trim( )== -> stringin başındaki ve sonundaki gereksiz boşlukları siler
==replace( )== -> bir stringin içindeki karakterlerin hepsini verilen değerle değiştirir
					``replace("a","e") -> a harfi yerine e harfi yazılır
					``replace("a","")-> daha çok istenmeyen karakterin silinmesi için kullanılır	
==replaceFirst( )== -> bir stringin içindeki karakterlerin sadece ilkini verilen değerle değiştirir				
==replaceAll("[ ]","")== -> farklı yerlerde geçen birden fazla karakteri verilen değerle değiştirir, 
					örneğin: "Merhaba12 Dünya23"
					``replaceAll("[abn]", "_") -> Merh_ _ _ _ 12 Dü_y_
					``replaceAll("[0-9]","") -> bütün rakamlar gider
					``replaceAll("[a-z]","") -> tüm küçük harfler gider
					``replaceAll("[^0-9]","") -> rakamlar dışındaki herşey gider 
					``replaceAll("[A-Z,a-z]","") -> hem büyük hem üçük harfler gider
					

```java
package Day07;  
  
public class _03_StringConcat {  
    public static void main(String[] args) {  
        String s1 = "Merhaba";  
        String s2 = "Dünya";  
  
        System.out.println("birleşik hali = " + s1 + s2);  
  
        System.out.println("birleşik hali = " + s1.concat(s2));  
        System.out.println("birleşik hali = " + s1.concat(" ").concat(s2));  
        System.out.println("birleşik hali = " + s1.concat(" " + s2));  

		String cumle = "Merhaba Dünya";

        boolean varMi = cumle.contains("a"); //true
        System.out.println("var mi ya =" + cumle.contains("ya")); //true
        System.out.println("var mi aü =" + cumle.contains("aü")); //false

		String s1 = "hello";  
		String s2 = "HELLO";  
		String s3 = "";  
		  
		boolean esitMi = s1.equals(s2);  
		  
		System.out.println("esitMi = " + esitMi); //false  
		System.out.println("esitMi = " + s1.equals("hello")); //true  		   
		System.out.println("esitMi Ignore Case= " + s1.equalsIgnoreCase(s2)); //true 	
		System.out.println("s3.isEmpty = " + s3.isEmpty()); //true  
		System.out.println("s2.isEmpty = " + s2.isEmpty()); //false

		String s1 = "Merhaba Java yı sevenler";  		  
		String parca1 = s1.substring(3,9); // 3 den başla 9 a kadar al, 9 dahil değil  
		System.out.println("parca1 = " + parca1); //haba J  		  
		System.out.println("parca2 = " + s1.substring(3)); //haba Java yı sevenler

		String text = "Manisa";  
		  
		System.out.println("text.startsWith(M) = " + text.startsWith("M")); //true  
		System.out.println("text.startsWith(Man) = " + text.startsWith("Man")); //true  
		System.out.println("text.startsWith(ni) = " + text.startsWith("ni")); //false

		System.out.println("text.endsWith(sa) = " + text.endsWith("sa")); //true  
		System.out.println("text.endsWith(a) = " + text.endsWith("a")); //true  
		System.out.println("text.endsWith(Ma) = " + text.endsWith("Ma")); //false

		String text = "Merhaba Dünya";  
		System.out.println("toLowerCase() = " + text.toLowerCase());   //merhaba dünya  
		System.out.println("text = " + text.toLowerCase().startsWith("m")); //true  
		  
		System.out.println("toUpperCase() = " + text.toUpperCase()); //MERHABA DÜNYA

		String text = "                   İsmet               ";  
		System.out.println("text =  ->" + text + "<-");  
		System.out.println("text =  ->" + text.trim() + "<-");

        String text = "Merhaba Dünya";
        System.out.println("replace(a,e) = " + text.replace("a","e"));//Merhebe Dünye
        System.out.println("replace(ba,de) = "+ text.replace("ba","de"));//Merhade Dünya
        System.out.println("replace(a,aaa) = " + text.replace("a","aaa"));//Merhaaabaaa Dünyaaa
        System.out.println("replace(a,'') = " + text.replace("a",""));//Merhb Düny

		String text2 = "Merhaba12 Dünya23";  
		System.out.println("abn -> = " + text2.replaceAll("[abn]",""));  
		System.out.println("123 -> = " + text2.replaceAll("[123]",""));  
		System.out.println("0-9 -> = " + text2.replaceAll("[0-9]",""));  
		System.out.println("a-z -> = " + text2.replaceAll("[a-z]",""));  
		System.out.println("abn -> = " + text2.replaceAll("[^0-9]",""));
  
    }  
}
```
