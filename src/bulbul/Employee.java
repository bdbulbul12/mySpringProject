package bulbul;




import java.util.Iterator;
import java.util.List;


public class Employee {
    
    private List<Address> address1;
    private List<Address> address2;

    public List<Address> getAddress1() {
        return address1;
    }

    public void setAddress1(List<Address> address1) {
        this.address1 = address1;
    }

    public List<Address> getAddress2() {
        return address2;
    }

    public void setAddress2(List<Address> address2) {
        this.address2 = address2;
    }

   
    
    
    public void show(){
        System.out.println(address1);
        System.out.println(address2);
    }
}