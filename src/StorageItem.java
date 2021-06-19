import java.time.LocalDate;

public class StorageItem {
    String name;
    LocalDate myDate;
    public StorageItem(String name){
        this.name=name;
        myDate=LocalDate.of(1980,1,1);


    }

    public  String getName(){
        return  name;
    }

    public  LocalDate getDate(){
        return myDate;
    }
    public  void  setName(String newName){
        name=newName;
    }
    public  void  setDate(LocalDate date){
        myDate=date;
    }
    public int getSize(){
        int size=0;

        return size;

    }
}
