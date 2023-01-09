package Generic;


public class MyList<T> {

    public T[] genericArray;

    /**
     * Varsayılan Parametresiz Constructor.
     *
     */
    public MyList(){
        setGenericArray(new Object[10]); //Diziyi 10 eleman ile başlattığımız yer.
    }

    public MyList(int capacity) {
        setGenericArray(new Object[capacity]);

    }

    public boolean set(int index, T data){
        if(index>=0){
            //Eğer parametre 0 veya daha büyükse
            if(index<=getCapacity()-1){
                //Eğer index numarası, mevcut dizinin sınırları içerisindeyse çalışacak kod bloğu,
                //Aksi taktirde out of bounds hatası alırız, bunu önlemek için bu kontrolleri yapıyoruz.

                getGenericArray()[index] = data;

                return true; //İşlemin başarılı olduğunu bildirir.
            }
            else{
                System.out.println("HATA : Belirtilen index("+index+") dizi sınırları dışındadır."); //Hatayı kullanıcıya console aracılığıyla bildiriyoruz.
                return false; //Geriye false döndürüyoruz, işlem başarısız.

            }
        }
        else{
            //Bu noktada gönderilen parametre negatif değere sahip demektir. Geriye null döndürüp, console'a hata yazdır.
            System.out.println("HATA : setElement metoduna negatif değer girilmemelidir.");
            return false; //İşlem başarısız geriye false döndürüyoruz.

        }
    }

    public boolean remove(int index){
        //Gönderilen parametrenin geçerliliğinin kontrolü;
        if(index>=0){
            //Eğer parametre 0 veya daha büyükse
            if(index<=getCapacity()-1){
                //Eğer index numarası, mevcut dizinin sınırları içerisindeyse çalışacak kod bloğu,
                //Aksi taktirde out of bounds hatası alırız, bunu önlemek için bu kontrolleri yapıyoruz.
                for(int i = index;i<getCapacity()-1;i++){
                    getGenericArray()[i] = getGenericArray()[i+1];
                }
                getGenericArray()[getCapacity()-1] = null;
                return true; //İşlemin başarılı olduğunu bildirir.
            }
            else{
                System.out.println("HATA : Belirtilen index("+index+") dizi sınırları dışındadır."); //Hatayı kullanıcıya console aracılığıyla bildiriyoruz.
                return false; //Geriye false döndürüyoruz, işlem başarısız.

            }
        }
        else{
            //Bu noktada gönderilen parametre negatif değere sahip demektir. Geriye null döndürüp, console'a hata yazdır.
            System.out.println("HATA : getElement metoduna negatif değer girilmemelidir.");
            return false; //İşlem başarısız geriye false döndürüyoruz.

        }



    }

    public T get(int index){
        //Gönderilen parametrenin geçerliliğinin kontrolü;
        if(index>=0){
            //Eğer parametre 0 veya daha büyükse
            if(index<=getCapacity()-1){
                //Eğer index numarası, mevcut dizinin sınırları içerisindeyse çalışacak kod bloğu,
                //Aksi taktirde out of bounds hatası alırız, bunu önlemek için bu kontrolleri yapıyoruz.
                return getGenericArray()[index]; //İlgili indexte bulunan elemanı bulup, return ile metodun çağırıldığı yere geri yolluyoruz.

            }
            else{
                System.out.println("HATA : Belirtilen index("+index+") dizi sınırları dışındadır."); //Hatayı kullanıcıya console aracılığıyla bildiriyoruz.
                return null; //Geriye null döndürüyoruz

            }
        }
        else{
            //Bu noktada gönderilen parametre negatif değere sahip demektir. Geriye null döndürüp, console'a hata yazdır.
            System.out.println("HATA : getElement metoduna negatif değer girilmemelidir.");
            return null;

        }
    }

    public int indexOf(T data){
        for(int i = 0;i<getCapacity();i++){
            //Diziyi baştan sona dönen for döngüsü.
            if(get(i)==data){
                //Elemanı tespit ettik demektir, bu durumda geriye i değerini yani ilgili elemanın index değerini döndürüyoruz.
                return i;
            }
        }
        return -1;//Yukarıdaki return hiç çalışmamışsa, ilgili veri dizide yok demektir. Geriye -1 döndürüyorum.
        //Çünkü yukarıdaki return 1 kere çalışsaydı metod orada biterdi. Buraya gelmezdi.
    }

    public int lastIndexOf(T data){
        int lastIndex=-1; //İlk değer atamasını varsayılan olarak -1 ayarlıyorum. Çünkü eğer dizide belirtilen eleman yoksa -1 dönülecek.
        //Belirtilen eleman bulunursa lastIndex olarak atanacak.

        for(int i = 0;i<getCapacity();i++){
            if(get(i)==data){
                lastIndex=i; //Belirtilen data bulunursa index lastindex'e atanacak. Daha sonra tekrar bulunursa yine atama yapılacağı için
                //Otomatik olarak lastIndex'i güncellenmiş olacak.
            }
        }


        return lastIndex;
    }

    public void add(T element){
        checkCapacity(1); //Kapasite kontrol metodunu 1 elemanlık yer için çağırıyoruz.

        //Diyelim ki dizi 10 kapasitesine sahip, içerisinde 1 eleman var.
        //Dizideki son elemanın bulunduğu yerin indis numarası 0'dır.
        //Dizideki ilk boş yerin indis numarası 1'dir.
        //Dolayısıyla ilk boş yerin indis numarası, getSize metodundan dönen eleman sayısıdır.
        //Çünkü dizilerin indis numarası 0'dan başlamaktadır.

        getGenericArray()[size()]=element;

    }
    public void addMultipleElement(T... elements){

        checkCapacity(elements.length); //Gelen parametre sayısı kadar yer var mı kontrol ettiriyoruz.

        for (T element:
                elements) {
            int elementNumber = 0;
            getGenericArray()[size()+elementNumber++] = element;
            //Yukarıda getsize ile ilk boş yer dönüyor, ona element numberi ekliyoruz.
            //İlk eklemede getSize+0 ekliyor sonra elementNumber'i arttırıyor.
            //Dolayısıyla burayı da otomatize ediyoruz.
        }
    }

    public void checkCapacity(int elementCount){
        if(!(elementCount<=getAvailableCapacity())){
            //Eğer eklenmek istenen eleman sayısı, boş yerden daha fazlaysa; yani yeterli yer yok ise.
            //Kapasiteyi arttıran metodu çağır ve tekrar kontrol et.
            this.doubleCapacity();
            this.checkCapacity(elementCount);
        }

    }

    public int size(){
        int elementCounter = 0;

        for(int i=0;i<getCapacity();i++)
        {
            if(getGenericArray()[i]!=null){
                elementCounter++;
            }

        }
        return elementCounter;
    }

    public boolean isEmpty(){

        if(size()>0){
            //Size metodu dizide bulunan eleman sayısını verir(Kapasitesini Değil)
            //Eğer eleman sayısı 1 veya daha fazlaysa dizi boş değil demektir.
            //Bu durumda geriye false döndürüyorum çünkü is empty (Boş mu?) sorusuna false(hayır) yanıtını veriyoruz.
            return false;
        }
        else{
            //Dizideki eleman sayısı 0 ise yani dizi boş ise geriye evet is empty diyoruz :)
            return true;
        }

    }

    public int getCapacity(){
        return getGenericArray().length;
    }

    public int getAvailableCapacity(){
        return getCapacity()- size();
    }

    @Override
    public String toString(){
        if(isEmpty()==true){
            return "";
        }
        else {
            String stringData = "[";
            for (T element :
                    getGenericArray()) {
                if (element == null) {
                    //Eğer eleman null ise, string'e ekleme.
                    break; //Döngüyü kır. Çünkü eğer null elemanlara geldiysek, devamında veri yoktur.
                }
                stringData += element + ",";
            }
            char[] charArray = stringData.toCharArray();
            charArray[charArray.length - 1] = ']';
            stringData = new String(charArray);
            return stringData;
        }
    }

    public T[] getGenericArray(){
        return this.genericArray;
    }

    private void setGenericArray(Object[] array){
        this.genericArray = (T[]) array;
    }

    public void doubleCapacity(){
        T[] temporaryArray = getGenericArray(); //Diziyi aynı türde fakat geçici başka bir diziye aktarır. Böylece eleman kaybı yaşanmaz. Yedek almak gibi düşün.

        //this.genericArray = (T[]) new Object[getCapacity()*2];//Düz kullanım, fakat kapsülleme gereği bunu değil alttakini kullanıyorum. Bu da geçerli.

        setGenericArray(new Object[getCapacity()*2]); //Ana diziyi yeniden oluşturduğumuz yer burası, parametre olarak new diyerek yolluyoruz ki yeni ve boş oluştursun.
        //Kapasitesini ise 2 ile çarpıp veriyoruz.

        //Sıra geldi eski elemanları yerine yerleştirmeye;

        int i = 0; //İndis numarasını takip edebilmek için bu değişkeni oluşturuyoruz.
        for (T oldElements:
                temporaryArray) {
            this.genericArray[i++]=oldElements; //Burası çalışırken i++ şeklinde yazdığım için örneğin; 0. elemana atama yapar ve işlem sonunda değeri 1 arttırır.
        }
    }

    public T[] toArray(){
        T[] newArray = (T[]) new Object[size()]; //Dizinin eleman sayısı boyutunda yeni bir dizi oluşturuyorum.

        for(int i = 0;i<size();i++){
            newArray[i] = get(i);
        }
        return newArray;
    }


    public void clear(){
        setGenericArray(new Object[10]);
        //setGenericArray metodu ile diziyi baştan oluşturuyoruz, böylece içerisindeki her şey de otomatik olarak silinmiş oluyor.
    }

    public MyList<T> subList(int start, int finish){

        //Parametrelerin geçerliliğinin kontrolü, bu aralık mevcut dizi ile uyumlu mu?
        if(start>=0 && finish>=0){
            //Yani sayılar 0 ve daha büyükse negatif değilse;

            if((start<this.getCapacity())&&(finish<this.getCapacity())){
                //Sayıların aralığı dizinin içeriği ile uyumlu mu? Örneğin 20 elemanlı bir diziden 10-30 arası elemanları istemek hataya sebebiyet olacaktır.
                //Eğer her iki parametre de dizinin kapasitesinden düşük ise yani 10 kapasiteli dizide 10'dan küçük 9,8,7,... ise dizinin aralığında bir değer isteniyor demektir.
                //Artık parametrelerin hataya sebebiyet vermeyeceğinden emin olduğum için esas işlemi yapıyorum;

                int newListElementCount = (finish-start)+1;
                //0,3 parametresi geldiği durumda 3-0 = 3 fakat istenen toplam eleman sayısı 4. Bu durumda +1 eklerim.
                //1,3 parametresi geldiği durumda 3-1 = 2 fakat istenen toplam eleman sayısı 3. Bu durumda +1 eklerim.
                //Yukarıdaki değişken istenen toplam eleman sayısını bulmaktadır.


                MyList<T> newList = new MyList<>(newListElementCount);
                for(int i=start;i<=finish;i++){
                    newList.add(get(i)); //get(i) ile mevcut generic dizinin elemanına erişiyor, add ile yeni generic diziye ekliyoruz.
                }

                return newList;//Yeni oluşturulan nesneyi verileri girdikten sonra geri yolluyorum.

            }
            else {
                //Bu durumda girilen parametreler 0 veya daha büyük fakat
                //Dizinin aralığının üzerine çıkıyor demektir. Çünkü parametrelerden bazıları kapasite değerinden büyük.
                //Geriye null döndürüp, hatayı console'a yazdırıyorum.
                System.out.println("HATA : Parametrelerin dizinin sınırlarından büyük olmaması gerekiyor.");
                return null;

            }

        }
        else{
            //Bu durumda parametreler negatif değer içermektedir. Hata mesajı ile kullanıcıyı bildiriyoruz.
            System.out.println("HATA : Parametrelerin 0 ve daha yüksek değerlere sahip olması gerekmektedir.");
            return null;
        }
    }

    public boolean contains(T data){

        for(int i =0;i<getCapacity();i++){
            if(get(i)==data){
                //Datayı dizi içerisinde bulduk demektir.
                return true;

            }
        }
        return false; //Yukarıdaki true dönmediyse, bu eleman dizide mevcut değildir. False dönüyorum.


    }

}