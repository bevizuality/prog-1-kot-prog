import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                "                                           o\n" +
                "                                         o |\n" +
                "                                         |\n" +
                "      .       .           ._._.    _                     .===.\n" +
                "      |`      |`        ..'\\ /`.. |H|        .--.      .:'   `:.\n" +
                "     //\\-...-/|\\         |- o -|  |H|`.     /||||\\     ||     ||\n" +
                " ._.'//////,'|||`._.    '`./|\\.'` |\\\\||:. .'||||||`.   `:.   .:'\n" +
                " ||||||||||||[ ]||||      /_T_\\   |:`:.--'||||||||||`--..`=:='...\n" +
                "\n" +
                "\n" +
                "Koszontelek a vidampark uzemeltetok nehez,\n" +
                "de mosolyban gazdag vilagaban! Az én nevem\n" +
                "Beviz Zoltan es en segitek a kezdetekben.\n" +
                "Hogyan szolithatlak?\n"
        );

        Scanner input = new Scanner(System.in);

        String boss = input.nextLine();

        System.out.println(
                "\nKedves " + boss + "! A legfontosabb teendod most, hogy\n" +
                "nevet adj a cegednek. Mi legyen az?\n"
        );

        String company = input.nextLine();

        System.out.println(
                company + " Ez egy sikeres vallalkozas nevenek hangzik!\n" +
                "Milyen nehezsegi szinten szeretned kiprobalni az ugyessegedet?\n" +
                "1 - konnyu\n" +
                "2 - kozepes\n" +
                "3 - nehez\n" +
                "A kivant szint sorszama:"
        );

        int level = input.nextInt();

        System.out.println(
                "\nEljott a megnyito napja.\n" +
                "itt az ideje, hogy a " + company + " vidamparkja megnyissa kapuit.\n"
        );

        // TODO: Épületek listázása, hirdetések listázása, dolgozók listázása
        String daily_message = "\nA megfelelo muvelet sorszamanak megadasaval\n" +
                "ird meg, hogy mit szeretnél tenni:\n" +
                "1 - Epitkezes\n" +
                "2 - Epuletek fejlesztese\n" +
                "3 - Reklamozas\n" +
                "4 - Szemelyzet felvetele\n" +
                "5 - Nap vege\n";
        int action;
        Double money = 150000.0;
        int actual_day = 1;
        int visitor = 10;


        while (money > 0) {
            System.out.println(daily_message);
            action = input.nextInt();
            switch (action) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                default:
            }
        }
    }

}
