package Project_Java.Mid_Project;

public class Database {
    public static BankAccount allAccounts[] = new BankAccount[10];
    static{
        allAccounts[0] = new CityBankAccount("Anthony","Johnson",20000,"KZ010322312", "0102");
        allAccounts[1] = new CityBankAccount("James","Smith",30000,"KZ014622312", "0103");
        allAccounts[2] = new CityBankAccount("John","White",24000,"KZ010328694", "0104");
        allAccounts[3] = new CityBankAccount("Nathan","Brown",27000,"KZ010304869", "0105");
        allAccounts[4] = new CityBankAccount("Martin","Pitt",28000,"KZ010102967", "0106");
        allAccounts[5] = new NationalBankAccount("Johnatan",28500,"KZ0101112", "0107");
        allAccounts[6] = new NationalBankAccount("Jameson",26500,"KZ0109912", "0108");
        allAccounts[7] = new NationalBankAccount("Bryan",25700,"KZ0101423", "0109");
        allAccounts[8] = new NationalBankAccount("Cindy",24900,"KZ0106857", "0110");
        allAccounts[9] = new NationalBankAccount("Lilly",22400,"KZ0101145", "0111");
    }
}
