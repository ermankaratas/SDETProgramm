//küsurat önemli ise sadece bir tanesini double tanımlamamız yeterli oluyor  
		double averageDouble = ((double) numberNot1 + numberNot2 + numberNot3) / 3;
		
```java
package Day04;

public class _01_TypeConversions {
    public static void main(String[] args) {
        byte not1 = 98;
        byte not2 = 97;
        byte not3 = 99;
        byte not4 = 100;

        //küçük kovayı büyük kovaya koyarken bir sıkıntı yok
        int sum = not1 + not2 + not3 + not4;

        //sum ın tipi int idi, onu byte dönüştürdük
        byte sum2 = (byte) sum;
        //büyük kovayı küçüğe boşaltırken veri kaybı ihtimali olduğu için
        // başına yazmamız gerekiyor, bunu bilerek yaptığımızı gösteriyoruz
        // yoksa uyarı verir ve çalışmaz

        int sum = 6700;
        byte number = 5;

        //number = sum; // int -> byte yazdığımızda uyaır verir ve veri kaybı olabilir
        number = (byte) sum;
        System.out.println("number = " + number); // 44 yazdı, yani gerçek değer gelmedi
        //o nedenle veri kaybı olmasa bile dikkat edilmesi gereken bir durumdur
        
		//küsurat önemli ise sadece bir tanesini double tanımlamamız yeterli oluyor  
  
		double averageDouble = ((double) numberNot1 + numberNot2 + numberNot3) / 3;  
  
		System.out.println("averageDouble = " + averageDouble);
    }
}

```

