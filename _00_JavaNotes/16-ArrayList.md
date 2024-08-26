size( ) => length yerine size kullanılır 

!TANIMLAMA
```java
ArrayList<Integer> list = new ArrayList<>();  
ArrayList<String> stringList = new ArrayList<>();  
ArrayList<Double> doubleList = new ArrayList<>();  
  
ArrayList<String> isimler = new ArrayList<>();  

// farklı tanımlama şekli  
ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(3,45,6,7));  

// 2D tanımlama şekli
ArrayList<ArrayList<Integer>> table = new ArrayList<>();

```

!KOPYALAMA
```java
Integer[] dizi = {2, 3, 4, 5};  

// diziyi ArrayList e ekleme
ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(dizi)); 

// Listi ArrayList in içine atma
ArrayList<Integer> liste2 = new ArrayList<>(liste);              
```

!METODLARI  (ekleme, okuma, değiştirme, silme, arama...)
```java
isimler.add("Burak");  
isimler.add("Burak");

isimler.add(1,"Mertcan");   // insert, araya ekler, indexi veririz, diğerleri yana kayar

// 2D ye ekleme şekli, eklenenlerin hepsi ArrayList
table.add(matNotes);                    // 2BArrayList e ilk satırımızı ekledik  
table.add(fizNotes);                    // 2. satırı ekledik  
table.add(kimNotes);                    // 3. satırı ekledik
table.get(0).add(67);                  //ilk satırdaki ArrayListe eleman ekledik

isimler.set(2, "Ulvi");  //set eder, verilen indexteki elemanı değiştirir

isimler.remove(1);      //delete eder, rakam verildiğinde o indexdeki gider  
	                    // isim verildiğinde karşılaşılan ilk ismi siler

		boolean varMi = 
isimler.contains("Ulvi"); // dizinin içinde geçip geçmediği check ederiz

		int indexOfBurak = 
isimler.indexOf("Burak");   // aranan değerin index ini verir

		String ilkEleman = 
isimler.get(0);             // verilen indexdeki elemanı getirir
tables.get(0).get(0)        // 2D ArrayList de elemanı getirme şekli

isimler.clear();    //Listi temizler

System.out.println("isimler = " + isimler);  
System.out.println("isimler.size length i verir = " + isimler.size());
```

!LOOP
```java
ArrayList<Integer> tekler = new ArrayList<>();  

for (int i = 0; i < tekler.size(); i++)  
    System.out.print(tekler.get(i) + " ");

// 2D ArrayList ler için
for (int i = 0; i < notesList.size(); i++) {  
    for (int j = 0; j < notesList.get(i).size(); j++) {  
        System.out.print(notesList.get(i).get(j) + " ");  
    }  
    System.out.println();  
}
```
