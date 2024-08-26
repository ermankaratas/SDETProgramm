While dan farklı olarak loop u bir kere çalıştırır, sonra şartı kontrol eder; yani Do While döngüyü şarta bağlı olmaksızın bir tur çalıştırır.

Döngü Kuralı
	bir döngünün kaç kere döneceği belli ise     =>  #FOR
													belli değilse   =>  #WHILE
	kontrol sonda olsun istiyorsan                      =>  #DO_WHILE

ayrıca #FOR da döngünün başı bellidir, sonu bellidir, artış değeri bellidir:

 ```java
 for(int counter = 1; counter <= 5 ; counter++)  
    System.out.println("counter = " + counter);
```

 #BREAK      => şartı karşılıyorsa break yapar, yani döngüyü kırar, döngüden çıkar, döngünün yeni
					      turu olmaz
#CONTINUE  => şartı karşılıyorsa pass geç, döngüyü kırmaz, döngü çalışmaya devam eder, 
						  döngünün başa dönmesini sağlar, bunun altında kalan kısım çalışmaz, döngü tekrar baştan başlayarak devam eder ve şartı yeni turda tekrar kontrol eder. 


#FOREACH => sets e bkz.