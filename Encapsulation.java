class Human{
     int atm_pin_no;
    private int mob_password;
     int getAtm_pin_no() {
        return atm_pin_no;
    }
    public static void setAtm_pin_no(int atm_pin_no,Human obj) {
        obj.atm_pin_no = atm_pin_no;
    }
     int getMob_password() {
        return mob_password;
    }
     void setMob_password(int mob_password) {
        this.mob_password = mob_password;
    }

   
    
    
    

}
class Encapsulation {
    private int x;
    static void main(String[] args) {
        Human h1;
        h1=new Human();
    
        Human.setAtm_pin_no(344, h1);
        Encapsulation e1;
        e1=new Encapsulation();
        e1.x=5;
        System.out.println(e1.x);
        System.out.println(h1.getAtm_pin_no());
        

        
        

    }
}
