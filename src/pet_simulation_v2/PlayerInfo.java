package pet_simulation_v2;
/*
 * @author Nibir(BurstLinker)
 */
public class PlayerInfo { // this is the singleton pattern
	private static PlayerInfo _instance;
	public static PlayerInfo getInstance() {
		if(PlayerInfo._instance == null)
			PlayerInfo._instance = new PlayerInfo();

		return PlayerInfo._instance;
	}
    // End of Singleton Pattern
	private PlayerInfo() { }

	private String Pet_Name = "Player";
    private double Owner_Health;
    private double Pet_Health;
	private int P_Balance = 0;
    private int factoryEarnings;
    private int P_Owner_Money;
    
	public String Get_Pet_Name() { 
        return this.Pet_Name; 
    }
	public void Set_Pet_Name(String name) {
		if(name == null || name.isEmpty())
			return;
		this.Pet_Name = name.trim();
	}

	public int get_pet_Balance() {
        return this.P_Balance; 
    }
	public void set_pet_Balance(int balance) {
		this.P_Balance = Math.max(balance, 0);
	}
    
	public boolean canAfford(int amount) {
		return this.P_Balance > amount;
	}
	public boolean deductFromBalance(int amount) {
		if(this.P_Balance < amount){
           return false; //Not enough
        }else{
           this.P_Balance = this.P_Balance - amount;
           return true; 
        }
	}
    
    public void addFactoryEarnings(int amount) {
        this.factoryEarnings += amount;
         this.P_Balance += amount;
    }
    // this is the owners health 
    public void Set_Owner_Health(double L_Owner_Health){
        Owner_Health = L_Owner_Health;
    }
    public double Get_Owner_Health(){
        return Owner_Health;
    }
    // this is the pets health
    public void Set_Pet_Health(double L_Pet_Health){
        Pet_Health = L_Pet_Health;
    }
    public double Get_Pet_Health(){
        return Pet_Health;
    }
    // this is the owners money
    public void Set_Owner_Money(int L_Money){
        P_Owner_Money = L_Money;
    }
    public int Get_Owner_Money(){
        return P_Owner_Money;
    }
    
}
