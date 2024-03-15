package player;

import java.util.Scanner;

public class Player {
    private String name;
    private String MobNo;
    private String emailId;
    private String address;
    private int age;
    private Scanner sc = new Scanner(System.in);
    public Player setPlayerNameFromUserInput()
    {
            System.out.print("Enter Player Name: ");
            String name = sc.nextLine();
            Player p = new Player();
            p.setPlayerName(name);
            return p;
    }
    public Player setPlayerDetailsFromUserInput()
    {
            System.out.print("Enter Player1 Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Player1 MobNo: ");
            String MobNo = sc.nextLine();
            System.out.println("Enter Player1 emailId: ");
            String emailId = sc.nextLine();
            System.out.println("Enter Player1 address: ");
            String address = sc.nextLine();
            System.out.println("Enter Player1 age: ");
            int age = sc.nextInt();
            Player p = new Player();
            p.setPlayerDetails(name,MobNo,emailId,address,age);
            return p;
    }
    public void setPlayerName(String name){
        this.name = name;
    }
    public void setPlayerDetails(String name, String MobNo, String emailId, String address, int age){
        this.name = name;
        this.MobNo = MobNo;
        this.emailId = emailId;
        this.address = address;
        this.age = age;
    }
    public void displayPlayerName(){
        System.out.println("Player Name: " + name );
    }

    public void displayPlayer(){
        System.out.println("Player Name: " + name + " MobNo: " + MobNo + " emailId: " + emailId + " address: " + address + " age: " + age);
    }

    public String getPlayerName(){
        return name;
    }
}
