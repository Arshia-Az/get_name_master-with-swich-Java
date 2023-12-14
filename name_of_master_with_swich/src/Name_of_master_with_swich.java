import java.util.*;

public class Name_of_master_with_swich {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many master work in faculty?:");
        int totalmaster = in.nextInt();
        in.nextLine();
        String mastername[] = new String[totalmaster];

        for (int i = 0; i < mastername.length; i++) {
            int x = i;
            System.out.format("Enter name for master %d:", x += 1);
            mastername[i] = in.nextLine();
        }

        System.out.print("enter a name for search:");
        String search = in.nextLine();

        switch (Arrays.asList(mastername).contains(search) ? 1 : 0) {
            case 1:
                System.out.format("master '%s' exist\n", search);
                break;
            case 0:
                System.out.print("the master not found!!!\n");
                break;
        }
    }
}
