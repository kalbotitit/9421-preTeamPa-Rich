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

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    private Calendar cal = Calendar.getInstance();
    private Scanner kbd = new Scanner(System.in);

    NestedList<NestedList<sluPortal>> sluPortalList = new NestedList<>();
    NestedList<sluPortal> homeMenu = new NestedList<>();
    NestedList<sluPortal> schedMenu = new NestedList<>();
    NestedList<sluPortal> attendanceMenu = new NestedList<>();
    NestedList<sluPortal> statementOfAccMenu = new NestedList<>();
    //TODO grd
    //TODO trns of rec
    NestedList<sluPortal> journalMenu = new NestedList<>();
    //TODO curri check
    NestedList<sluPortal> schoolCalendarMenu = new NestedList<>();
    NestedList<sluPortal> perDet = new NestedList<>();
    NestedList<sluPortal> downAbout = new NestedList<>();
    NestedList<sluPortal> ptuRes = new NestedList<>();

    public static void main(String[] args) {
        Main obj = new Main();
        obj.run();

    }

    private void run(){
        // home menu
        sluPortal home = new sluPortal("Home", null);
        sluPortal announcement = new sluPortal("Events, News and Announcement", "DRAGONPAY - SLU Payment Procedures -view attachment");
        sluPortal studStatus = new sluPortal("Student Status", "Status:\n" +
                "- CURRENTLY ENROLLED THIS FIRST SEMESTER, 2021-2022 IN BSCS 2.");
        homeMenu.insert(home);
        homeMenu.insert(announcement);
        homeMenu.insert(studStatus);
        sluPortalList.insert(homeMenu);
        // schedule
        sluPortal schedule = new sluPortal("Schedule", null);
        sluPortal classSchedule = new sluPortal("Class Schedule (FIRST SEMESTER, 2021-2022)", """
            Class Code      Course Number       Course Description                  Units      Schedule             Days    Room\n
            7025	        NSTP-CWTS 1	        FOUNDATIONS OF SERVICE	            3	        0730 - 1200 PM	    FS	    BATCH2\n
            7897	        FIT OA	            PHYSICAL ACTIVITY                   2	        0730 - 1030 AM	    WTH	    BATCH2\n
                                                TOWARDS HEALTH\n
                                                AND FITNESS\n       
            9421A	        CS 211	            DATA STRUCTURES (LEC)	            2	        1200 - 0100 PM	    WS	    SEMESTRAL\n
            9421B	        CS 211L	            DATA STRUCTURES (LAB)	            1	        1230 - 0200 PM	    MTH	    SEMESTRAL\n
            9422A	        CS 212	            OPERATING SYSTEMS (LEC)	            2	        0300 - 0400 PM	    TF	    SEMESTRAL\n
            9422B	        CS 212L	            OPERATING SYSTEMS (LAB)	            1	        0230 - 0400 PM	    MTH	    SEMESTRAL\n
            9423	        CS 213	            HUMAN COMPUTER INTERACTION	        3	        0500 - 0600 PM	    TTHS	SEMESTRAL\n
            9424	        GSTS	            SCIENCE, TECHNOLOGY, AND SOCIETY	3	        0730 - 1200 PM	    MT	    BATCH1\n
            9425	        GRVA	            READING VISUAL ART	                3	        0730 - 1200 PM	    MT	    BATCH3\n
            9426	        CFE 103	            CATHOLIC FOUNDATION OF MISSION	    3	        0430 - 0530 PM	    MWF	    SEMESTRAL\n""");
        sluPortal totalUnits = new sluPortal("23", null);
        schedMenu.insert(schedule);
        schedMenu.insert(classSchedule);
        schedMenu.insert(totalUnits);
        //  attendance
        sluPortal attendance = new sluPortal("Attendance", null);
        sluPortal studBehaviour = new sluPortal("Student Behavior","Bahaviour:\n"+"Great! No Absences/Tardiness were found.");
        attendanceMenu.insert(attendance);
        attendanceMenu.insert(studBehaviour);

        //  stt of acc
        sluPortal statementOfAcc = new sluPortal("Statement of Account", null);
        sluPortal firstSemStatOfAcc = new sluPortal ("Statement of Accounts (FIRST SEMESTER, 2021-2022)", """
            Your amount due for PRELIM is:\s
            P X,XXX.XX\s
            Your Remaining Balance as of October 2021 is:\s
            P XX,XXX.XX""");
        sluPortal mode = new sluPortal("Mode of Payment", "Dragonpay \n" + "Pay with Bukas");
        sluPortal brkOfFees = new sluPortal("Breakdown of fees as of October 2021", "Date, Description, Amount");
        sluPortal payTransacs = new sluPortal ("Dragonpay Payment Transactions (FIRST SEMESTER, 2021-2022)", "Date, Channel, Reference, Amount");
        statementOfAccMenu.insert(statementOfAcc);
        statementOfAccMenu.insert(firstSemStatOfAcc);
        statementOfAccMenu.insert(mode);
        statementOfAccMenu.insert(brkOfFees);
        statementOfAccMenu.insert(payTransacs);
        //  grd
        //  trns of rec
        //  journ
        sluPortal journal = new sluPortal("Journal", null);
        sluPortal journalIndexes = new sluPortal("Saint Louis University Libraries Periodical Article Indexes", null);
        sluPortal whatJournalIndexes = new sluPortal("WHAT ARE JOURNAL INDEXES?", """
                                                    An index is a list of items pulled together for a purpose. Journal indexes also\s
                                                    called bibliographic indexes or bibliographic databases are lists of journals,\s 
                                                    organized by discipline, subject, or type of publication.""");
        sluPortal periodicalLibrariesIndexes = new sluPortal("THE SLU LIBRARIES’ PERIODICAL ARTICLE INDEXES", """
                                                    One of the Home Library Services that the University Libraries offer\s 
                                                    is the Periodical Article Indexes where the subscribed print journals\s 
                                                    are being indexed and can be accessed through an online bibliographic database.\s

                                                    The Periodical Article Indexes database provides access to periodical articles\s 
                                                    by subject or author and it can help you find articles about a specific topic.""");
        sluPortal accessingArticleIndexes = new sluPortal("STEPS IN ACCESSING THE PERIODICAL ARTICLE INDEXES", """
                                                            1. Enter your topic on the search box and click Search\s
                                                            2. You will see the various bibliographic details (i.e. title of the journal, the specific date,\s 
                                                                volume and issue, and page numbers for the article) that contain your topic.\s
                                                            3. Should you opt to read the full text of the article,\s 
                                                                you may request it by sending an email to uldir@slu.edu.ph""");
        journalMenu.insert(journal);
        journalMenu.insert(journalIndexes);
        journalMenu.insert(whatJournalIndexes);
        journalMenu.insert(periodicalLibrariesIndexes);
        journalMenu.insert(accessingArticleIndexes);
        //  curri check
        //  schl clndr
        sluPortal schoolCalendar = new sluPortal("School Calendar", null);
        sluPortal calendar = new sluPortal("School Calendar SY 2021-2022\n", "At present date and time is: " + cal.getTime() + """
                                            \nGeneral Events:\n
                                                FIRST SEMESTER, 2021-2022\n
                                                Registration (No Classes)	August 09, 2021 Monday\n
                                            Holiday:\n
                                                No events to display!\n
                                            Holiday not in school calendar:\n
                                                No events to display!\n
                                            Exam:\n
                                                No events to display!\n
                                            Calamity:\n
                                                No events to display!\n
                                            Others:\n
                                                No events to display!\n
                                            """);
        schoolCalendarMenu.insert(schoolCalendar);
        schoolCalendarMenu.insert(calendar);
        
       // Personal Details
        sluPortal perD = new sluPortal("Personal Test Developement", null);
        sluPortal genInfo = new sluPortal("General Information", "Gender:Male\n Birthday:September 30, 2000\n" +
                "Religion: Roman Catholic\n Birthplace:Baguio City\n Nationality: ");
        sluPortal conInfo = new sluPortal("Contact Information", "Home Address:Null\n Home Telephone Number:Null\n" +
                "Baguio Address:Null\n Cellphone Number:Null\n Email:juandealcruz@gmail.com");
        sluPortal conPersons = new sluPortal("Contact Persons", "Father:N/A\n Occupation:N/A\n Mother:N/A\n");
        perDet.insert(perD);
        perDet.insert(genInfo);
        perDet.insert(conInfo);
        perDet.insert(conPersons);
        
        // Downloadables & About iSLU
        sluPortal downloadAbout = new sluPortal("Downloadables & About SLU", null);
        sluPortal downloadables = new sluPortal("Downloadables","<1>Student Handbok\n<2>Safety Orientation Manual\n" +
                "<3>Ordinance 021-2018 - Harassement\n<4>Gsuite For Education\n<5>The Mission and Identity Cluster");
        sluPortal aboutSLU = new sluPortal("About iSLU Portal","iSLU portal is for saint Louis university students and parents, that serves as a personal assistant in carrying out " +
                "university related tasks.");
        downAbout.insert(downloadAbout);
        downAbout.insert(downloadables);
        downAbout.insert(aboutSLU);
        
        //PTU test result
        sluPortal ptu = new sluPortal("PTU Test Result", null);
        sluPortal slucee = new sluPortal("SLU-COLLEGE ENTRANCE EXAMINATION (SLU-CEE) RESULTS", "No Results found");
        sluPortal sosr = new sluPortal("STUDY ORIENTATION SURVEY-REVISED (SOS-R) TEST RESULTS", "No Results found");
        sluPortal picrs = new sluPortal("POSITIVE INTERNAL COPING RESOURCES SCALES (PICRS) TEST RESULTS", "No Results found");
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
            System.out.println(menu.getSize() + 1 + " Logout");
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
            System.out.println(subMenu.getSize() + " Back");
            System.out.print("Enter your choice: ");
            choice = Byte.parseByte(kbd.nextLine());
        }while (!isValid(subMenu.getSize(), choice));

        if (choice == subMenu.getSize()) mainMenu(sluPortalList);
        else printContent(subMenu.get(choice));
        // return to subMenu method
        System.out.print("\nPress Enter to continue");
        String x = kbd.nextLine();
        subMenu(subMenu);

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
