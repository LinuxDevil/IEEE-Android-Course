public class Admin {
    private static Admin AD = new Admin();

    public static Admin getAD() {
        return AD;
    }

    private Admin() {

    }

    public void DeleteUser(){
        System.out.println("User privileges revoked");

    }
    public void AddUser(){
        System.out.println("New User initiating");
    }
}
