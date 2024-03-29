package gerenciabanco;

public class GerenciaBanco {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        BankingOperations userBanking = new BankingOperations();
        
        userInput.InsertData();
        userBanking.Menu();
    } 
    
}
