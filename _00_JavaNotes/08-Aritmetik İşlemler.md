Bölme işlemindeki özel durumlar

```java
	System.out.println("Bölme İşlemi = " + (a / b)); //1
	System.out.println("Bölme İşlemi küsuratlı = " + ((double)a / b)); //1.8
	System.out.println("Bölme İşlemi kalanı bulma = " + (a % b)); //4
	int kalan = 9 % 5; //4
```

sayaçlarla ilgili özel durumlar
// ++ sonra gelirse , once islem sonra artis   
// ++ once gelirse, once artis, sonra islem
// -- de ++ gibi
// += ise verilen miktar kadar artır
// -= ise verilen miktar kadar azaltır
// \*= ise verilen miktar kadar çarp
//  /= ise verilen miktar kadar böl
örneğin:
k = 5  a = 5
k = a++          => k = a, a = a + 1          => k = 5 , a = 6     önce a yı k ya eşitledi sonra a ya 1 ekledi
k = ++a          => a = a + 1, k = a          => k = 7 , a = 7     önce a ya 1 ekledi sonra k ya eşitledi
k = k + a++    => k = k + a, a = a +1    => k = 14, a = 8
k = k + ++a    => a = a + 1, k = k + a   => k = 23, a=9

a += 6             => a = a + 6                   => a = 15
a -= 6              => a = a - 6                    => a = 9
a \*= 2              => a = a \* 2                    => a = 18
a /= 2              => a = a / 2                    => a = 9

```java
int i = 0;  

//hepsi 1 artırır
i = i + 1;  
i++;  
++i;

//hepsi 1 azaltır
i = i - 1;  
i--;  
--i;

/********************/  
int toplam = 0, sayi = 1;  
  
toplam = toplam + sayi++;// önce işlemi yap, sonra sayı yı 1 artır, toplam=1 sayı=2 oldu
						 // toplam = 1, sayi = 2 -> ++ sadece sayiyi etkiler
toplam = 0; sayi = 1; // baslangic degerine getirildi  
toplam = toplam + ++sayi; // sayi=2, toplam= 2
// ++ sonra gelirse , once islem sonra artis  
// ++ once gelirse, once artis, sonra islem
```