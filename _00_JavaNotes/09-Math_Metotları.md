Math.max(a,b)  => büyük olanı verir
Math.min(a,b)   => küçük olanı verir
Math.pow(a,b)  => a üssü b yi verir
Math.sqrt(b)      => b nin karekökünü verir
Math.round(3.5) => 3.5 u yuvarlar 4 verir
Math.ceil(3.1)      => 3.1 i yukarı yuvarlar 4 verir
Math.floor(3.9)    => 3.9 u aşağı yuvarlar 3 verir
Math.random( )   => rastgele bir sayı verir, double olarak 0 ile 1 arasında sayı verir, o nedenle

int randomNumber = (int)(Math.random() * 10); // kullanarak 1-10 arası bir sayı oluşturuuz

bir aralık girmek içinse
int randomNumber = (int)(Math.random( ) * (max - min) ) + min;