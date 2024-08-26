RETURN
-> veri döndürmek için => #void yerine #return edilen veri tipi yazılarak kullanılır
-> metotdan çıkmak için => #return yanına hiçbir şey yazılmaz


```java
package Day20;  
  
public class _01_MethodFunktion {             //fonksiyon ya da method, ikisi de aynı  
  
    //buraya yazılabilir  
    public static void main(String[] args) {  
  
        //buraya yazılamaz  
  
        diziDoldur();  
  
    }  
  
    //buraya yazılabilir  
  
    public static void diziDoldur(){  
        System.out.println("Hello World");  
    }  
}
``` 

```java
package Day20;  
  
public class _02_MethodFunktion {  
    public static void main(String[] args) {  
  
        // çağrırken izlenilen yol package.class.method()  
		// aynı package da ise class.method       
		Day20._01_MethodFunktion.diziDoldur();  
        _01_MethodFunktion.diziDoldur();  

		merhabaYazAd("İsmet");  
		merhabaYazCok(5);

		enbuyukYaz();               //iki tane aynı isimli metodda java kendi bulur
		enbuyukYaz(56,70);          //parametreli olan için otom. oraya gider
    }  

	public static int toplamBul(int ... dizi){     // kaç tane gelirse gelsin hepsini 
												  // dizi array ına atar  
	    return 0;  
}
    public static void merhabaYazAd(String ad){   // void tipsiz demek, yani veri 
												// döndürmüyor
	    System.out.println("Merhaba" + ad);  
	}  
	public static void merhabaYazCok(int miktar){  
	    for (int i = 0; i < miktar; i++) {  
	        System.out.println("Merhaba");  
	    }  
	    merhabaYazAd("Ali");      // heryerden çağrılabiliyor
	}
	public static void enbuyukYaz(){  
	    Scanner scanner = new Scanner(System.in);  
	    System.out.print("enter a number");  
	    int s1 = scanner.nextInt();  
	    System.out.print("enter a number");  
	    int s2 = scanner.nextInt();  
	    /*if (s1>s2)  
	        System.out.println(s1 + "büyük");  
	        else  
	            if (s1<s2)  
	                System.out.println(s2 + "büyük");  
	            else  
	                System.out.println("eşit");*/
	    enbuyukYaz(s1,s2);                   // if li kısmı kısaca böyle yazabiliyoruz  
	}  
	public static void enbuyukYaz(int s1, int s2){  
	    if (s1>s2)  
	        System.out.println(s1 + "büyük");  
	    else  
	        if (s1<s2)  
	            System.out.println(s2 + "büyük");  
	        else  
	            System.out.println("eşit");  
	}
}

```

