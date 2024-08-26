```java
ArrayList<Integer> sayilar = new ArrayList<>();  
sayilar.add(50);
sayilar.add(5);

Collections.sort(sayilar);    // sıralar, küçükten büyüye  
Collections.reverse(sayilar); // tersine çevirir  
Collections.max(sayilar);     // max değeri verir  
Collections.min(sayilar);     // min değeri verir  
Collections.fill(sayilar, 0); // verilen değer ile tüm değerleri değiştirir  
Collections.replaceAll(sayilar, 0, 5); 
							// eski değeri(0) verilen değer(5) ile değiştirir  
                            // karşılaşılan bütün değerleri değiştirir
Collections.addAll(sayilar, 3, 4, 5); //varolan bir ArrayList e çoklu eleman ekleme
```
