/**
 * Create multiple AddressBook for Each person's contact
 */

import java.util.Scanner;

public class Uc6 {

    // print name of every contact person

    public static void AllAddressBook(){
        Scanner sc6 = new Scanner(System.in);

        for (String i : ContactsMain.HasMap.keySet()) {
            System.out.println(i);

        }

        // show briefly of which contact you want

        System.out.println("Enter name of which contact you want to briefly");
        String brief = sc6.next();

        for(Contacts c : ContactsMain.arr){

            if(c.getFirstName().equals(brief)) {
                System.out.println(c);
                break;
            }
        }
    }
}
