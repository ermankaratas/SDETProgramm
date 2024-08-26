1 tanımlamada yani 1 kalemde çoklu veri tutabilecek değişkenler için kullanılır

!TANIMLAMA
int[ ] notes = new int[50];   // içinde 50 tane sayı saklayabilir anlamına gelir
int[ ] notes = {3,6,56,88};
int notes[ ]= {3,6,56,88};
String[ ] words = new String[5];

!2D ARRAY tanımlamaları için aşağıdaki örneğe bakınız

!DİZİLERİN İÇİ BOŞ İSE -> (DEFAULT DEĞERLER)
int           -> 0
string      -> null
boolean  -> false
double    -> 0.0

! DİKKAT
length     -> array.length  -- arraylerde dizinin kullanımı
					 for döngüsünde sayacın üs değerini array ın uzunluğu olarak girmek, sonradan arrayın uzunluğu değiştiğinde kodda sadece tanımlama yerinde değişiklik yapmamız 
					 yeterli oluyor. Bütün for döngülerini kontrol etmeye gerek kalmıyor.
length( )  -> string.length() -- stringlerde dizinin kullanımı


 ```java
       int[] notes = new int[50]; // içinde 50 tane sayı saklayabilir anlamına gelir
       int[] notes = {3,6,56,88};
       int notes[]= {3,6,56,88};
       String[ ] words = new String[5];

        notes[0] = 50;
        notes[1] = 50;
        //..
        //..
        notes[49]=89;

        System.out.println("notlar[0], 1.Öğrenci notu = " + notes[0]);
        System.out.println("notlar[49], 50.Öğrenci notu = " + notes[49]);
        System.out.println("kaç tane not var = " + notes.length); 


		int[][] array2D = new int[3][5];  
		  
		int[][] array_2D = {            //yukarıdaki tanımlama ile aynı  
		        {1,2,3,4,5},            //1.satır  
		        {1,2,3,4,5},            //2.satır  
		        {1,2,3,4,5}             //3.satır  
		};

		for (int i = 0; i < 3; i++) {            // arrayı yazdırma  
		    for (int j = 0; j < 5 ; j++)  
		        System.out.println(array_2D[i][j]);  
		}
		// tablonun satır ve sütun sayısını girerek döngüyü çalıştırma  
		for (int i = 0; i < array_2D.length; i++) {  
		 // burda i ye dikkat et, her satırdaki sütun sayısını bulmak için  
		    for (int j = 0; j < array_2D[i].length ; j++)     
		      // her satırdaki sütun sayısı aynı olmayabilir  
		        System.out.println(array_2D[i][j]);          
		}
```
