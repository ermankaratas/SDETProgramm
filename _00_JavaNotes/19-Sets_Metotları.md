	size()     => uzunluğunu verir
	remove()   => verilen değeri siler
	contains() => verilen değer SET in içinde var mı, yok mu
	clear()    => SET in içini komple siler
	addAll()   => verilen SET i diğer bir SET in içine atar
	add()      => verilen değeri SET in içine atar
	removeAll()=> verilen SET i diğer bir SET ten çıkarır
	retainAll()=> verilen SET ile diğer SET arasında kesişen elemanlar kalır


```java
HashSet<Integer> hs = new HashSet<>();  
hs.add(1);hs.add(5);hs.add(7);hs.add(34);hs.add(3);hs.add(4);  
  
  
System.out.println("hs.size() = " + hs.size());   // size  
hs.remove(5);                                     // remove  
System.out.println("hs = " + hs);  
if(hs.contains(7))                                // contains  
    System.out.println("Var");  
else  
    System.out.println("Yok");  
hs.clear();                                       // clear  
System.out.println("hs = " + hs);  
  
// BİRLEŞTİRME  
HashSet<Integer> setA = new HashSet<>();  
HashSet<Integer> setB = new HashSet<>();  
setA.add(1);setA.add(2);setA.add(3);setA.add(4);setA.add(5);  
setB.add(4);setB.add(5);setB.add(6);setB.add(7);  
  
System.out.println("setA = " + setA);  
System.out.println("setB = " + setB);  
  
HashSet<Integer> birlesikHali = new HashSet<>();  
birlesikHali.addAll(setA);  
birlesikHali.addAll(setB);  
System.out.println("birlesikHali = " + birlesikHali);  
  
// setA.addAll(setB);      // setA daki elemanlara setB dekileri ekler  
// System.out.println("setA = " + setA);  
  
// FARKINI BULMA  
HashSet<Integer> farki = new HashSet<>();  
farki.addAll(setA);  
farki.removeAll(setB);              // setA daki elemanlardan setB de olanları çıkarır  
System.out.println("farki = " + farki);  
  
// KESİŞİM BULMA  
HashSet<Integer> ortakElemanlar = new HashSet<>();  
ortakElemanlar.addAll(setA);  
ortakElemanlar.retainAll(setB);         // setA daki elemanlardan setB de olanlar kalır  
System.out.println("ortakElemanlar = " + ortakElemanlar);
```

!ÖRNEK, bir SET e dizi atmak, 4 Farklı Yöntem:
```java
// 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla  
// doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir  
// diziye atınız.  
  
int[] dizi = new int[10];  
for (int i = 0; i < dizi.length; i++)  
    dizi[i] = (int)(Math.random() * 11);  
  
System.out.println("dizi = " + Arrays.toString(dizi));  

// 1.Yöntem  
HashSet<Integer> hs = new HashSet<>();  
for (int i = 0; i < dizi.length; i++)  
    hs.add(dizi[i]);  
System.out.println("hs = " + hs);  
  
// 2.Yöntem  
Integer[] dizi2 = new Integer[10];  
for (int i = 0; i < dizi2.length; i++)  
    dizi2[i] = (int)(Math.random() * 11);  
System.out.println("dizi2 = " + Arrays.toString(dizi2));  
HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(dizi2));  
System.out.println("hs2 = " + hs2);  
  
// 3.Yöntem  
HashSet<Integer> hs3 = new HashSet<>();  
hs3.addAll(Arrays.asList(dizi2));  
System.out.println("hs3 = " + hs3);  
  
// 4.Yöntem  
HashSet<Integer> hs4 = new HashSet<>();  
Collections.addAll(hs4,dizi2);  
System.out.println("hs4 = " + hs4);
```