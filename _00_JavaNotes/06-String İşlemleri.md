!!! Harfler tek tırnakla yazılır, Stringler çif tırnakla
			Örnek : char a = 'a';     String a = "Bugün hava çok güzel";

==length( )==
==charAt( )==
==indexOf( )== -> verilen harflerin Indexini verir, 
                    -1 gelirse yok demektir
                    ikinci harfi bulmak için, örneğin a 2 tane geçiyorsa 2. a'yı bulmak için arama noktasını ileri kaydırırız, (a,5) gibi
==lastIndexOf( )== -> sondan aramaya başlar

```java
package Day06;  
  
public class _06_StringLength {  
    public static void main(String[] args) {  
        String x = "It is rainy today.";  
  
        int length = x.length();  
        System.out.println("length = " + length);  

        char firstChar = x.charAt(0);
        System.out.println("first character of the sentence is " + firstChar);

		Scanner scanner = new Scanner(System.in);  
		System.out.print("enter a sentence = ");  		  
		String sentence = scanner.nextLine();  
		int length = sentence.length();  
		char lastChar = sentence.charAt(length - 1);  	  
		System.out.println("last character is = " + lastChar);

        String sentence = "Merhaba Dünya";
        // h nin oda numarası kaç 3     oda numaraları hep aynı olduğu gibi index numaraları da hep aynıdır
        // a nın oda numarası kaç 4
        // Dü nün indexi kaç 8

        System.out.println("sentence.indexOf(M) = " + sentence.indexOf("M"));  //0
        System.out.println("sentence.indexOf(h) = " + sentence.indexOf("h"));  //3
        System.out.println("sentence.indexOf(a) = " + sentence.indexOf("a"));  //4
        System.out.println("sentence.indexOf(Dü) = " + sentence.indexOf("Dü"));  //8
        System.out.println("sentence.indexOf( ) = " + sentence.indexOf(" "));  //7
        System.out.println("sentence.lastIndexOf(a) = " + sentence.lastIndexOf("a"));  //12
    }  
}
```