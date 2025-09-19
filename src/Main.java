//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
String partyChoice = "";
String party = "D - Democrat R - Republican I - Independent";
        System.out.println(party);
        partyChoice = "E";
        switch (partyChoice) {
            case "R":
                System.out.println("You get a Republican Elephant");
                break;
                case "D":
                    System.out.println("You get a Democrat Donkey");
                    break;
            case "I":
                    System.out.println("You get a Independent Man");
                    break;
                    default:
                        System.out.println("Invalid Party Choice " + partyChoice);
        }
    }
}