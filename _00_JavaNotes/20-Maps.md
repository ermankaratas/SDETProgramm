SET ler ile aynıdır, tekrar etmez, yalnız KEY in tekrar edip etmediğine bakar, eğer aynı KEY gelirse değeri günceller, index tutmaz

Map = #Key + #Value

#FOREACH  => #Map te yapı farklıdır, #Key ve #Value değerleri olduğu için #entrySet'lerle kullanılır, örnek aşağıda.

=> #TreeMap               -> her zaman SIRALI  
=> #LinkedHashMap     -> EKLENME SIRASINA göre sıralı  
=> #HashMap              -> sırası önemli değil, HIZLI çalışır

	put()       => add() metodu yerine kullanılır
	get()       => verilen KEY değerinin VALUE sunu getirir
	containsKey => verilen KEY değeri KEY değerlerinin içinde var mı, yok mu
	keySet()    => tüm KEY değerlerini getirir
	values()    => tüm VALUE değerlerini getirir
	remove()    => verilen KEY değerine ait kaydı siler
	size()      => uzunluğunu verir
	clear()     => komple içini boşaltır
	Map.Entry   => FOREACH yapısında kullanılır
	entrySet()  => FOREACH yapısında kullanılır
	    getKey()     => FOREACH de key değerini getirir
	    getValue()   => FOREACH de value değerini getirir
				böylece her elamanı dolaşarak key ve value değerlerini yazdırabiliriz

!MAPinMAP örneği için aşağıya bakınız.

ÖRNEKLER
```java
HashMap<Integer, String> hm = new HashMap<>();  
hm.put(1001, "İsmet Temur");  
hm.put(2001, "Esma");  
hm.put(2, "Oğuzhan");  
hm.put(1003, "Kaan");  
hm.put(1001, "Ahmet Kaya");  
System.out.println("hm = " + hm);  
  
System.out.println("hm.get(2001) = " + hm.get(2001));  
  
System.out.println("hm.containsKey(1003) = " + hm.containsKey(1003));  
  
System.out.println("hm.keySet() = " + hm.keySet());  
System.out.println("hm.values() = " + hm.values());  
  
hm.remove(1001);  
System.out.println("hm = " + hm);  
  
System.out.println("hm.size() = " + hm.size());  
  
hm.clear();  
System.out.println("hm = " + hm);
```

#FOREACH 
```java
// key ve valueları aynı anda yazma, beraber dolaşır
for(Map.Entry<Integer,String> kv : hm.entrySet())              
    System.out.println(kv.getKey() + "-" + kv.getValue());    

// sadece key değerleri yazma: normal foreach yapısı ile  
for(Integer k : hm.keySet())                
    System.out.println("k = " + k);

// sadece value ları yazma: normal foreach yapısı ile  
for(String v : hm.values())                 
    System.out.println("v = " + v);
```

MAPinMAP
```java
// Bir kartvizit uygulamasını 2 kişi için yapınız  
// isim, email, telefon, adres  
// bunları tek bir yapıda tutunuz  
  
HashMap<String, String> ZKartVizit = new HashMap<>();  
ZKartVizit.put("isim", "Zehra");  
ZKartVizit.put("email", "zehra@gmail.com");  
ZKartVizit.put("telefon", "0505676767");  
ZKartVizit.put("adres", "Çekmeköy");  
  
System.out.println("ZKartVizit.get(isim) = " + ZKartVizit.get("isim"));  
System.out.println("ZKartVizit.get(email) = " + ZKartVizit.get("email"));  
  
HashMap<String, String> EKartVizit = new HashMap<>();  
EKartVizit.put("isim", "Esma");  
EKartVizit.put("email", "esma@gmail.com");  
EKartVizit.put("telefon", "0505878787");  
EKartVizit.put("adres", "Başakşehir");  
  
System.out.println("EKartVizit.get(isim) = " + EKartVizit.get("isim"));  
System.out.println("EKartVizit.get(email) = " + EKartVizit.get("email"));  
  
HashMap<String ,HashMap<String, String> > kartvizitler = new HashMap<>();  
//string ile çağıracağım için key değeri string olacak, değerlerse karvizit olacağı için HashMap oldu  
  
kartvizitler.put("Zehra", ZKartVizit);    //Zehranın kartviziti  
kartvizitler.put("Esma", EKartVizit);  
  
System.out.println("Zehranın emaili = " + kartvizitler.get("Zehra").get("email"));  
System.out.println("Zehranın kartviziti = " + kartvizitler.get("Zehra"));
```
