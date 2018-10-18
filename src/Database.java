import javax.xml.crypto.Data;

public class Database {

    private static Database db = new Database();

    public static Database getDB() {
        return db;
    }

    private Database(){

    }

    public void getDBName(){
        //Connect to db
        System.out.println("Users_Info");
    }

    public void printAllUserRecords(){
        //Connect DB
        //Got all the users
        System.out.println("Users:\nUser1: Ali\n...million more to view");
    }

    public void shutDownDB(){
        System.out.println("Backup.....\nSleep....\nUnix has been shutdown");
    }

}
