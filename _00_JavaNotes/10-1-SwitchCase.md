default:

eğer switch case işlemlerinde case durumları gerçekleşmiyorsa yapmasını istediğimiz durumu default olarak yazıyoruz

Gruplama:

eğer gruplama imkanı varsa case in içine tekrar yazmamımaz gerek olmuyor

```java
Scanner scan = new Scanner(System.in);  
System.out.print("enter a number = ");  
int firstNumber = scan.nextInt();  
System.out.print("enter a number = ");  
int secondNumber = scan.nextInt();  
  
System.out.println("Toplama için T");  
System.out.println("Çıkarma için Ç");  
System.out.println("Çarpma için P");  
System.out.println("Bölme için B");  
System.out.println("Seçiminiz = ");  
scan.nextLine();  
String choice = scan.nextLine();  
  
switch (choice){  
    case "T" :  
        System.out.println("toplam = " + (firstNumber + secondNumber));  
        break;  
    case "Ç" :  
        System.out.println("çıkarma = " + (firstNumber - secondNumber));  
        break;  
    case "P" :  
        System.out.println("çarpma = " + (firstNumber * secondNumber));  
        break;  
    case "B" :  
        System.out.println("bölme = " + ((double)firstNumber / secondNumber));  
        break;  
    default:  
        System.out.println("Hatalı giriş yaptınız");  
        break;

	//GRUPLAMA DURUMU
	switch (month){  
	    case 1 :  
	    case 3 :  
	    case 5 :  
	    case 7 :  
	    case 8 :  
	    case 10:  
	    case 12:  
	        System.out.println("31 çeker");  
	        break;  
	    case 4 :  
	    case 6 :  
	    case 9 :  
	    case 11 :  
	        System.out.println("30 çeker");  
	        break;
```