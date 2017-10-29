package pet_simulation_v2;
/*
 @author Nibir(BurstLinker)
 */
interface Common_I{ // this is the Interface here
    public void Type(String L_Type,Status_Page SPO);
}
class Player implements Common_I{
    
    private String P_Type;
    @Override
    public void Type(String L_Type,Status_Page SPO) { // did object passing here
        P_Type = L_Type;
        switch(P_Type){
            case "Pro" :
                SPO.Ans = true;
                break;
            case "Noob" :
                SPO.Ans = false;
                break;
            default:
                break;
        }
    }
    public String Get_Type(){
        return P_Type;
    }
    
}
// these are the classes that are based on the players level
class Pro{   
}
class Noob{    
}
// this is our base class for the animals
class Dog { 
    private double P_Health;
    public void Set_Health(double L_Health) {
        P_Health = L_Health;
    }
    public double Get_Health() { // did encapsulation here
        return P_Health;
    }  
}
// these are the classes that we inherited from the Dog class
class Beagle extends Dog{    
}
class Poodle extends Dog{    
}
class BullDog extends Dog{    
}
class Boxer extends Dog{    
}
class Pug extends Dog{
}
public class Pet_Simulation_V2 {
    public static void main(String[] args) {
       Log_In L_Obj = new Log_In();
       L_Obj.setVisible(true);
    }   
}
