/*
    Author:
        Cortez, Leo Anthony
        Ecleo, Kent John
        Estrada, Dhuanne
        Jacinto, Josef Luis
        Quedado, Reina May
        
        
    Algorithm:
        1. Get the selected in Main Menu
        2. Get the selected in Sub menu
            If Sub Menu has another sub menu
                Repeat step 2
        3. Display the content of the selected menu
 */

package prelim;

import java.util.Scanner;

public class Main {

    private Scanner kbd = new Scanner(System.in);
    NestedList<NestedList<sluPortal>> sluPortalList = new NestedList<>();
    NestedList<sluPortal> homeMenu = new NestedList<>();
    sluPortal home = new sluPortal("Home", null);
    sluPortal announcement = new sluPortal("Events, News and Announcement", "DRAGONPAY - SLU Payment Procedures -view attachment");
    sluPortal studStatus = new sluPortal("Student Status", "Status:\n" +
            "- CURRENTLY ENROLLED THIS FIRST SEMESTER, 2021-2022 IN BSCS 2.");
    // TODO schedule


    NestedList<sluPortal> attendanceMenu = new NestedList<>();
    sluPortal attendance = new sluPortal("Attendance", null);
    sluPortal studBehaviour = new sluPortal("Student Behavior","Bahaviour:\n"+"Great! No Absences/Tardiness were found.");

    NestedList<sluPortal> statementOfAccMenu = new NestedList<>();
    sluPortal statementOfAcc = new sluPortal("Statement of Account", null);
    sluPortal firstSemStatOfAcc = new sluPortal ("Statement of Accounts (FIRST SEMESTER, 2021-2022)", """
            Your amount due for PRELIM is:\s
            P X,XXX.XX\s
            Your Remaining Balance as of October 2021 is:\s
            P XX,XXX.XX""");
    sluPortal mode = new sluPortal("Mode of Payment", "Dragonpay \n" + "Pay with Bukas");
    sluPortal brkOfFees = new sluPortal("Breakdown of fees as of October 2021", "Date, Description, Amount");
    sluPortal payTransacs = new sluPortal ("Dragonpay Payment Transactions (FIRST SEMESTER, 2021-2022)", "Date, Channel, Reference, Amount");

    // TODO grd
    //TODO trns of rec
    // TODO journ
    // TODO curri check
    // TODO schl cal
    NestedList<sluPortal> perDet = new NestedList<>();
    sluPortal perD = new sluPortal("Personal Test Developement", null);
    sluPortal genInfo = new sluPortal("General Information", "Gender:Male\n Birthday:September 30, 2000\n" +
                                           "Religion: Roman Catholic\n Birthplace:Baguio City\n Nationality: ");
    sluPortal conInfo = new sluPortal("Contact Information", "Home Address:Null\n Home Telephone Number:Null\n" +
                                          "Baguio Address:Null\n Cellphone Number:Null\n Email:juandealcruz@gmail.com");
    sluPortal conPersons = new sluPortal("Contact Persons", "Father:N/A\n Occupation:N/A\n Mother:N/A\n");
    // TODO dl/abtslu
    NestedList<sluPortal> ptuRes = new NestedList<>();
    sluPortal ptu = new sluPortal("PTU Test Result", null);
    sluPortal slucee = new sluPortal("SLU-COLLEGE ENTRANCE EXAMINATION (SLU-CEE) RESULTS", "No Results found");
    sluPortal sosr = new sluPortal("STUDY ORIENTATION SURVEY-REVISED (SOS-R) TEST RESULTS", "No Results found");
    sluPortal picrs = new sluPortal("POSITIVE INTERNAL COPING RESOURCES SCALES (PICRS) TEST RESULTS", "No Results found");

    public static void main(String[] args) {
        Main obj = new Main();
        obj.run();

    }

    private void run(){
        // home menu
        homeMenu.insert(home);
        homeMenu.insert(announcement);
        homeMenu.insert(studStatus);
        sluPortalList.insert(homeMenu);

        // schedule
        //  attendance
        attendanceMenu.insert(attendance);
        attendanceMenu.insert(studBehaviour);
        //  stt of acc
        statementOfAccMenu.insert(statementOfAcc);
        statementOfAccMenu.insert(firstSemStatOfAcc);
        statementOfAccMenu.insert(mode);
        statementOfAccMenu.insert(brkOfFees);
        statementOfAccMenu.insert(payTransacs);
        //  grd
        //  trns of rec
        //  journ
        //  curri check
        //  schl cal
        //  per detl
        //  dl/abtslu

        //PTU test result
        ptuRes.insert(ptu);
        ptuRes.insert(slucee);
        ptuRes.insert(sosr);
        ptuRes.insert(picrs);
        sluPortalList.insert(ptuRes);


        mainMenu(sluPortalList);
    }

    /**
     * Display the main menu(main list) of the portal
     */
    private void mainMenu(NestedList<NestedList<sluPortal>> menu){

        byte choice = 0;
        do {
            System.out.println("\n====Main Menu=====");
            printMainMenu(menu);
            System.out.println(menu.getSize() + 1 + " Exit");
            System.out.print("Enter your choice: ");
            choice = Byte.parseByte(kbd.nextLine());
        } while (!isValid(menu.getSize(), choice));

        if (choice == menu.getSize() + 1) {
            System.out.println("\nLogout");
            System.exit(0);
        } else subMenu(menu.get(choice - 1));

    }// end of mainMenu method

    /**
     * Display the sub menu (sub list)
     * @param subMenu sub list
     */
    private void subMenu(NestedList<sluPortal> subMenu){
        byte choice = 0;
        do {
            System.out.printf("====== %s Menu =====\n", subMenu.get(0).getMenuNm());
            printSubMenu(subMenu);
            System.out.println(subMenu.getSize() + " Exit");
            System.out.print("Enter your choice: ");
            choice = Byte.parseByte(kbd.nextLine());
        }while (!isValid(subMenu.getSize(), choice));

        if (choice == subMenu.getSize()) mainMenu(sluPortalList);
        else printContent(subMenu.get(choice));
        // TODO code that return to subMenu after printing content

    }

    /**
     * Traverse through all node and print the element of main list
     * @param menu main list
     */
    private void printMainMenu(NestedList<NestedList<sluPortal>> menu){
        for(int node = 0; node < menu.getSize(); node++){
            System.out.println(node + 1 + " " + menu.get(node).get(0).getMenuNm());
        }
    }// end of printMainMenu method

    /**
     * Travers through all nodes and print the element sub list
     * @param sub sub list
     */
    private void printSubMenu(NestedList<sluPortal> sub){
        for (int node = 1; node < sub.getSize(); node++){
            System.out.println(node  + " " + sub.get(node).getMenuNm());
        }
    }

    /**
     * Print the element of each node in the sub list
     * @param c element
     */
    private void printContent(sluPortal c){
        System.out.println(c.getContent());
    }

    /**
     * Return boolean value if the input is in range of the size of list
     * @param max size of the list
     * @param choice input of the uer
     * @return boolean value
     */
    private boolean isValid(int max, byte choice){
        return choice > 0 && choice <= max + 1;
    }
}
