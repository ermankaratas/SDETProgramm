        /*
        scan.next();            -> bir kelime okur
        scan.nextLine();        -> satırın tümünü okur

        scan.nextInt();         -> bir tam sayı okur
        scan.nextShort();       -> bir short tam sayı okur
        scan.nextByte();        -> bir byte tam sayı okur
        scan.nextLong();        -> bir long tam sayı okur

        scan.nextFloat();       -> bir ondalıklı sayı okur
        scan.nextDouble();      -> bir ondalıklı uzun sayı okur

        scan.nextBoolean();     -> bir boolean değer okur
         */


Eğer integer okuduktan sonra string okunmasını istiyorsan boş bir komut ile string okutursun böylece integer defaulttan gitmiş olur.

```java
int option = scan.nextInt();
scan.nextLine();  // Consume newline left-over
				 // This line you have to add (It consumes the \n character)

String str1 = scan.nextLine();
```
