=> tekrar eden veri gelirse EKLEMEZ, yani TEKRAR EDİLEN VERİ OLMAZ, AYNI DEĞER OLMAZ! 
=> index tutmaz  
=> isteğe göre  
	 -> ya     ne eklersem ekleyeyim her zaman içindekileri SIRALI tutar  
	 -> ya     eklenme sırasında tutar  
	 -> ya da  kendi isteğine göre sırada tutsun  
  
=> #TreeSet               -> her zaman SIRALI  
=> #LinkedHashSet   -> EKLENME SIRASINA göre sıralı  
=> #HashSet              -> sırası önemli değil, HIZLI çalışır

=> #FOREACH            -> index i olmadığı için her zaman foreach kullanılır, örnek aşağıda
				  -> foreach sıralı getirmez, karışık sırayla getirir, o nedenle #ITERATOR kullanılır
=> #ITERATOR            -> index i olmadığı için, index gibi sıralı gelmesi için kullanılır, örnek aşağıda
				  ->  #hasNext( ) ve #next( ) metotları kullanılır

!TANIMLAMA
```java
HashSet<Integer> hashSet1 = new HashSet<>();
LinkedHashSet<String> lhs = new LinkedHashSet<>();
TreeSet<String> ts =new TreeSet<>();
```

!EKLEME
```java
hashSet1.add(1);
lhs.add("bir");
ts.add("bir");

System.out.println("hashSet1 = " + hashSet1);
```

! #FOREACH  #ITERATOR 
```java
TreeSet<String> renkler = new TreeSet<>();

for(String eleman : renkler)                      
    System.out.println("eleman = " + eleman);

// renkler SETinin başına konumladık  
Iterator gosterge = renkler.iterator();   

while (gosterge.hasNext()){                             // sırada eleman var ise  
    System.out.println("renkler = " + gosterge.next()); 
								// next() ITERATORün gösterdiği elemanı temsil eder  
}
```

