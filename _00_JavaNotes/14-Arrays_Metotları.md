Arrays.toString(names);     -> dizinin içini görmek için kullanılır, dizinin içinde ne var görürüz
										örneğin burada names dizisinin içini gösterir
										
Arrays.sort(numbers);        -> dizinin içindeki değerleri sıralar ama yazdırmadan önce bir tur 
										çalıştırmalıyız ki sıralama gerçekleşsin
										örneğin burada numbers dizisini sıralıyor
										
Arrays.fill(a,5);                    -> dizinin elemanlarını hızlıca doldurur, burada a dizisinin tüm 
												elemanlarına 5 atar

Arrays.asList(dizi)               -> diziyi ArrayList e çevirir, örneğin:
					ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(3,45,6,7));