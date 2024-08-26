Integer.parseInt( )
Double.parseDouble( )
String.valueOf( )

```java
package Day04;

public class _05_StringConversion {
    public static void main(String[] args) {
        String donate1 = "500";
        String donate2 = "700";

        System.out.println(donate1 + donate2); // 500700 yazar, dönüşüm yapmamız gerekir

        int numberDonate1 = Integer.parseInt(donate1);   
								    // parse düzenleyip dönüştürmek demektir
        int numberDonate2 = Integer.parseInt(donate2);   
								    // benzer şekilde Double.parseDouble vs. de vardır

        int sum = numberDonate1 + numberDonate2;
        System.out.println(sum);


        //sayıları Stringe çevirirken valueOf kullanıyoruz
        int number = 56;
        String strNumber = String.valueOf(number);

        System.out.println("string Number = " + strNumber);
    }
}
