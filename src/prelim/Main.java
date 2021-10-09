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
    NestedList<sluPortal> gradesMenu = new NestedList<>();
    NestedList<sluPortal> transOfRecMenu = new NestedList<>();
    NestedList<sluPortal> journalMenu = new NestedList<>();
    NestedList<sluPortal> curriculumMenu = new NestedList();
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
        sluPortal totalUnits = new sluPortal("Total Units", "23");
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
        sluPortal grd = new sluPortal("Grades",null);
        sluPortal grades = new sluPortal("Grades (FIRST SEMESTER, 2021-2022)", String.format("%-12s%-15s%-98s%-8s%-8s%-8s%-17s%-8s%-8s%n", "Class code","Course number", "Descriptive Title", "Units", "Prelim", "Midterm", "Tentative Final", "Final","Weights\n" +
                String.format("%-12s%-15s%-100s%-8s%-8s%-12s%-12s%-8s%n", "7025", "NSTP-CWTS 1", "FOUNDATIONS OF SERVICE", "3", "99", "99", "99", "99")+
                String.format("%-12s%-15s%-100s%-8s%-8s%-12s%-12s%-8s%n", "7897", "FIT OA", "PHYSICAL ACTIVITY TOWARDS HEALTH AND FITNESS (OUTDOOR AND ADVENTURE ACTIVITIES)", "2", "99", "99", "99", "99")+
                String.format("%-12s%-15s%-100s%-8s%-8s%-12s%-12s%-8s%n", "9421A", "CS 211", "DATA STRUCTURES (LEC)", "2", "99", "99", "99", "99")+
                String.format("%-12s%-15s%-100s%-8s%-8s%-12s%-12s%-8s%n", "9421B", "CS 211L", "DATA STRUCTURES (LAB)", "1", "99", "99", "99", "99")+
                String.format("%-12s%-15s%-100s%-8s%-8s%-12s%-12s%-8s%n", "9422A", "CS 212", "OPERATING SYSTEMS (LEC)", "2", "99", "99", "99", "99")+
                String.format("%-12s%-15s%-100s%-8s%-8s%-12s%-12s%-8s%n", "9422B", "CS 212L", "OPERATING SYSTEMS (LAB)", "1", "99", "99", "99", "99")+
                String.format("%-12s%-15s%-100s%-8s%-8s%-12s%-12s%-8s%n", "9423", "CS 213", "HUMAN COMPUTER INTERACTION", "3", "99", "99", "99", "99")+
                String.format("%-12s%-15s%-100s%-8s%-8s%-12s%-12s%-8s%n", "9424", "GSTS", "SCIENCE, TECHNOLOGY, AND SOCIETY", "3","99", "99", "99", "99")+
                String.format("%-12s%-15s%-100s%-8s%-8s%-12s%-12s%-8s%n", "9425", "GRVA", "READING VISUAL ART", "3", "99", "99", "99", "99")+
                String.format("%-12s%-15s%-100s%-8s%-8s%-12s%-12s%-8s%n", "9426", "CFE 103", "CATHOLIC FOUNDATION OF MISSION", "3", "99", "99", "99", "99")));
        gradesMenu.insert(grd);
        gradesMenu.insert(grades);
        sluPortalList.insert(gradesMenu);

        //  trns of rec
        sluPortal transcript = new sluPortal("Transcript of Records", null);
        sluPortal transcriptOfRecords = new sluPortal("Transcript of Records", "FIRST SEMESTER, 2020-2021\n" +
                String.format("%-15s%-98s%-8s%-8s%n", "Course number", "Descriptive Title", "Grades", "Units\n"+
                        String.format("%-15s%-100s%-8s%-8s%n","CFE 101", "GOD'S JOURNEY WITH HIS PEOPLE", "99", "3")+
                        String.format("%-15s%-100s%-8s%-8s%n","CS 111", "INTRODUCTION TO COMPUTING (LEC)", "99", "2")+
                        String.format("%-15s%-100s%-8s%-8s%n","CS 111L", "INTRODUCTION TO COMPUTING (LAB)", "99", "1")+
                        String.format("%-15s%-100s%-8s%-8s%n","CS 112", "COMPUTER PROGRAMMING 1 (LEC)", "99", "2")+
                        String.format("%-15s%-100s%-8s%-8s%n","CS 112L", "COMPUTER PROGRAMMING 1 (LAB)", "99", "1")+
                        String.format("%-15s%-100s%-8s%-8s%n","CS 113", "DISCRETE STRUCTURES", "99", "3")+
                        String.format("%-15s%-100s%-8s%-8s%n","FIT HW", "PHYSICAL ACTIVITY TOWARDS HEALTH AND FITNESS (HEALTH AND WELLNESS)", "99", "2")+
                        String.format("%-15s%-100s%-8s%-8s%n","GART", "ART APPRECIATION", "99", "3")+
                        String.format("%-15s%-100s%-8s%-8s%n","GHIST", "READINGS IN PHILIPPINE HISTORY", "99", "3")+
                        String.format("%-15s%-100s%-8s%-8s%n","GMATH", "MATHEMATICS IN THE MODERN WORLD", "99", "3")+
                        "SECOND SEMESTER, 2020-2021\n"+
                        String.format("%-15s%-100s%-8s%-8s%n","CFE 102", "CHRISTIAN MORALITY IN OUR TIMES", "99", "3")+
                        String.format("%-15s%-100s%-8s%-8s%n","CS 121", "DIGITAL LOGIC DESIGN", "99", "3")+
                        String.format("%-15s%-100s%-8s%-8s%n","CS 122", "COMPUTER PROGRAMMING 2", "99", "2")+
                        String.format("%-15s%-100s%-8s%-8s%n","CS 122L", "COMPUTER PROGRAMMING 2 (LAB)", "99", "1")+
                        String.format("%-15s%-100s%-8s%-8s%n","CS 123", "ARCHITECTURE AND ORGANIZATION", "99", "2")+
                        String.format("%-15s%-100s%-8s%-8s%n","CS 123L", "ARCHITECTURE AND ORGANIZATION (LAB)", "99", "1")+
                        String.format("%-15s%-100s%-8s%-8s%n","FIT CS", "PHYSICAL ACTIVITY TOWARDS HEALTH AND FITNESS (COMBATIVE SPORTS)", "99", "2")+
                        String.format("%-15s%-100s%-8s%-8s%n","GENVI", "ENVIRONMENTAL SCIENCE", "99", "3")+
                        String.format("%-15s%-100s%-8s%-8s%n","GPCOM", "PURPOSIVE COMMUNICATION", "99", "3")+
                        String.format("%-15s%-100s%-8s%-8s%n","GSELF", "UNDERSTANDING THE SELF", "99", "3")+
                        "SHORT TERM, 2021\n"+
                        String.format("%-15s%-100s%-8s%-8s%n","CS 131", "SOFTWARE MODELING AND ANALYSIS", "99", "3")+
                        String.format("%-15s%-100s%-8s%-8s%n","CS 132", "MATHEMATICS FOR COMPUTER SCIENCE", "99", "3")));
        transOfRecMenu.insert(transcript);
        transOfRecMenu.insert(transcriptOfRecords);
        sluPortalList.insert(transOfRecMenu);

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
        sluPortalList.insert(journalMenu);

        //  curri check
        sluPortal curr = new sluPortal("Curriculum Checklist",null);
        sluPortal curriculumChecklist = new sluPortal("BACHELOR OF SCIENCE IN COMPUTER SCIENCE FIRST SEMESTER, 2018-2019", "FIRST YEAR, FIRST SEMESTER\n" +
                String.format("%-15s%-96s%-8s%n", "Course number", "Descriptive Title", "Units\n"+
                        String.format("%-15s%-98s%-8s%n","CFE 101", "GOD'S JOURNEY WITH HIS PEOPLE", "3")+
                        String.format("%-15s%-98s%-8s%n","CS 111", "INTRODUCTION TO COMPUTING (LEC)", "2")+
                        String.format("%-15s%-98s%-8s%n","CS 111L", "INTRODUCTION TO COMPUTING (LAB)", "1")+
                        String.format("%-15s%-98s%-8s%n","CS 112", "COMPUTER PROGRAMMING 1 (LEC)", "2")+
                        String.format("%-15s%-98s%-8s%n","CS 112L", "COMPUTER PROGRAMMING 1 (LAB)", "1")+
                        String.format("%-15s%-98s%-8s%n","CS 113", "DISCRETE STRUCTURES", "3")+
                        String.format("%-15s%-98s%-8s%n","FIT HW", "PHYSICAL ACTIVITY TOWARDS HEALTH AND FITNESS (HEALTH AND WELLNESS)", "2")+
                        String.format("%-15s%-98s%-8s%n","GART", "ART APPRECIATION", "3")+
                        String.format("%-15s%-98s%-8s%n","GHIST", "READINGS IN PHILIPPINE HISTORY", "3")+
                        String.format("%-15s%-98s%-8s%n","GMATH", "MATHEMATICS IN THE MODERN WORLD", "3")+
                        "FIRST YEAR, SECOND SEMESTER\n"+
                        String.format("%-15s%-98s%-8s%n","CFE 102", "CHRISTIAN MORALITY IN OUR TIMES", "3")+
                        String.format("%-15s%-98s%-8s%n","CS 121", "DIGITAL LOGIC DESIGN", "3")+
                        String.format("%-15s%-98s%-8s%n","CS 122", "COMPUTER PROGRAMMING 2", "2")+
                        String.format("%-15s%-98s%-8s%n","CS 122L", "COMPUTER PROGRAMMING 2 (LAB)", "1")+
                        String.format("%-15s%-98s%-8s%n","CS 123", "ARCHITECTURE AND ORGANIZATION", "2")+
                        String.format("%-15s%-98s%-8s%n","CS 123L", "ARCHITECTURE AND ORGANIZATION (LAB)", "1")+
                        String.format("%-15s%-98s%-8s%n","FIT CS", "PHYSICAL ACTIVITY TOWARDS HEALTH AND FITNESS (COMBATIVE SPORTS)", "2")+
                        String.format("%-15s%-98s%-8s%n","GENVI", "ENVIRONMENTAL SCIENCE", "3")+
                        String.format("%-15s%-98s%-8s%n","GPCOM", "PURPOSIVE COMMUNICATION", "3")+
                        String.format("%-15s%-98s%-8s%n","GSELF", "UNDERSTANDING THE SELF", "3")+
                        "FIRST YEAR, SHORT TERM\n"+
                        String.format("%-15s%-98s%-8s%n","CS 131", "SOFTWARE MODELING AND ANALYSIS", "3")+
                        String.format("%-15s%-98s%-8s%n","CS 132", "MATHEMATICS FOR COMPUTER SCIENCE", "3")+
                        "SECOND YEAR, FIRST SEMESTER\n"+
                        String.format("%-15s%-98s%-8s%n", "CFE 103", "CATHOLIC FOUNDATION OF MISSION" ,"3")+
                        String.format("%-15s%-98s%-8s%n", "CS 211",	"DATA STRUCTURES (LEC)", "2")+
                        String.format("%-15s%-98s%-8s%n", "CS 211L", "DATA STRUCTURES (LAB)", "1")+
                        String.format("%-15s%-98s%-8s%n", "CS 212",	"OPERATING SYSTEMS (LEC)", "2")+
                        String.format("%-15s%-98s%-8s%n", "CS 212L", "OPERATING SYSTEMS (LAB)", "1")+
                        String.format("%-15s%-98s%-8s%n", "CS 213", "HUMAN COMPUTER INTERACTION", "3")+
                        String.format("%-15s%-98s%-8s%n", "FIT OA", "PHYSICAL ACTIVITY TOWARDS HEALTH AND FITNESS (OUTDOOR AND ADVENTURE ACTIVITIES)", "2")+
                        String.format("%-15s%-98s%-8s%n", "GRVA", "READING VISUAL ART",	"3")+
                        String.format("%-15s%-98s%-8s%n", "GSTS", "SCIENCE, TECHNOLOGY, AND SOCIETY", "3")+
                        String.format("%-15s%-98s%-8s%n", "NSTP-CWTS 1", "FOUNDATIONS OF SERVICE", "3")+
                        "SECOND YEAR, SECOND SEMESTER\n"+
                        String.format("%-15s%-98s%-8s%n","CFE 104", "CICM MISSIONARY IDENTITY",	"3")+
                        String.format("%-15s%-98s%-8s%n","CS 221", "INFORMATION MANAGEMENT (LEC)",	"2")+
                        String.format("%-15s%-98s%-8s%n","CS 221L", "INFORMATION MANAGEMENT (LAB)",	"1")+
                        String.format("%-15s%-98s%-8s%n","CS 222", "COMPUTER PROGRAMMING 3 (LEC)",	"2")+
                        String.format("%-15s%-98s%-8s%n","CS 222L", "COMPUTER PROGRAMMING 3 (LAB)",	"1")+
                        String.format("%-15s%-98s%-8s%n","CS 223", "AUTOMATA AND FORMAL LANGUAGES", "3")+
                        String.format("%-15s%-98s%-8s%n","FIT AQ", "PHYSICAL ACTIVITY TOWARDS HEALTH AND FITNESS (AQUATICS)", "2")+
                        String.format("%-15s%-98s%-8s%n","GCWORLD", "THE CONTEMPORARY WORLD","3")+
                        String.format("%-15s%-98s%-8s%n","GETHICS", "ETHICS", "3")+
                        String.format("%-15s%-98s%-8s%n","NSTP-CWTS 2", "SOCIAL AWARENESS AND EMPOWERMENT FOR SERVICE", "3")+
                        "SECOND YEAR, SHORT TERM\n"+
                        String.format("%-15s%-98s%-8s%n","CS 231", "COMPUTER NETWORKS (LEC)", "2")+
                        String.format("%-15s%-98s%-8s%n","CS 231L",	"COMPUTER NETWORKS (LAB)", "1")+
                        String.format("%-15s%-98s%-8s%n","GENTREP",	"THE ENTREPRENEURIAL MIND", "3")+
                        String.format("%-15s%-98s%-8s%n","GRIZAL",	"THE LIFE AND WORKS OF RIZAL", "3")+
                        "THIRD YEAR, FIRST SEMESTER\n"+
                        String.format("%-15s%-98s%-8s%n","CFE 105A", "CICM IN ACTION: JUSTICE, PEACE, INTEGRITY OF CREATION, INDIGENOUS PEOPLES & INTERRELIGIOUS DIALOGUE", "2")+
                        String.format("%-15s%-98s%-8s%n","CS 311",	"APPLICATIONS DEVELOPMENT (LEC)", "2")+
                        String.format("%-15s%-98s%-8s%n","CS 311L",	"APPLICATIONS DEVELOPMENT (LAB)",	"1")+
                        String.format("%-15s%-98s%-8s%n","CS 312", "WEB SYSTEMS DEVELOPMENT (LEC)",	"2")+
                        String.format("%-15s%-98s%-8s%n","CS 312L",	"WEB SYSTEMS DEVELOPMENT (LAB)",	"1")+
                        String.format("%-15s%-98s%-8s%n","CS 313",	"SOFTWARE ENGINEERING",	"3")+
                        String.format("%-15s%-98s%-8s%n","CS 314",	"SOCIAL AND PERSONAL DEVELOPMENT IN THE ICT WORKPLACE",	"3")+
                        String.format("%-15s%-98s%-8s%n","CS 315",	"TECHNOLOGY-ASSISTED PRESENTATION AND COMMUNICATION", "3")+
                        String.format("%-15s%-98s%-8s%n","CSM 316",	"NUMERICAL METHODS FOR COMPUTER SCIENCE","3")+
                        "THIRD YEAR, SECOND SEMESTER\n"+
                        String.format("%-15s%-98s%-8s%n","CFE 105B", "CICM IN ACTION: ENVIRONMENTAL PLANNING & MANAGEMENT, AND DISASTER RISK REDUCTION MANAGEMENT",	"2")+
                        String.format("%-15s%-98s%-8s%n","CS 321",	"ARTIFICIAL INTELLIGENCE",	"3")+
                        String.format("%-15s%-98s%-8s%n","CS 322",	"DATA SCIENCE (LEC)",	"2")+
                        String.format("%-15s%-98s%-8s%n","CS 322L",	"DATA SCIENCE (LAB)",	"1")+
                        String.format("%-15s%-98s%-8s%n","CS 323", "MODELING AND SIMULATION (LEC)",	"2")+
                        String.format("%-15s%-98s%-8s%n","CS 323L",	"MODELING AND SIMULATION (LAB)",	"1")+
                        String.format("%-15s%-98s%-8s%n","CS 324",	"METHODS OF RESEARCH IN COMPUTER SCIENCE",	"3")+
                        String.format("%-15s%-98s%-8s%n","CS 325",	"sSTRUCTURE OF PROGRAMMING LANGUAGES",	"3")+
                        "THIRD YEAR, SHORT TERM\n"+
                        String.format("%-15s%-98s%-8s%n","CS 331", "PRACTICUM", "6")+
                        "FOURTH YEAR, FIRST SEMESTER\n"+
                        String.format("%-15s%-98s%-8s%n","CFE 106A", "EMBRACING THE CICM MISSION",	"2")+
                        String.format("%-15s%-98s%-8s%n","CS 411",	"CS THESIS 1",	"3")+
                        String.format("%-15s%-98s%-8s%n","CS 412",	"INFORMATION ASSURANCE AND SECURITY",	"3")+
                        String.format("%-15s%-98s%-8s%n","CS 413",	"PROFESSIONAL PRACTICE AND CYBERETHICS",	"3")+
                        String.format("%-15s%-98s%-8s%n","CSE 25",	"UX CONCEPTS AND DESIGN",	"3")+
                        String.format("%-15s%-98s%-8s%n","CSE 15",	"DATA MINING (Elective)",	"2")+
                        "FOURTH YEAR, SECOND SEMESTER\n"+
                        String.format("%-15s%-98s%-8s%n","CFE 106B", "EMBRACING THE CICM MISSION", "2")+
                        String.format("%-15s%-98s%-8s%n","CS 421",	"CS THESIS 2", "3")+
                        String.format("%-15s%-98s%-8s%n","CS 422",	"DISTRIBUTED COMPUTING", "3")+
                        String.format("%-15s%-98s%-8s%n","CSE",	"ELECTIVE 3", "3")+
                        String.format("%-15s%-98s%-8s%n","CSE",	"ELECTIVE 4", "3")+
                        String.format("%-15s%-98s%-8s%n","FOR LANG 1",	"FOREIGN LANGUAGE 1", "3")));
        curriculumMenu.insert(curr);
        curriculumMenu.insert(curriculumChecklist);
        sluPortalList.insert(curriculumMenu);


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
        sluPortalList.insert(schoolCalendarMenu);

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
        sluPortalList.insert(perDet);

        // Downloadables & About iSLU
        sluPortal downloadAbout = new sluPortal("Downloadables & About SLU", null);
        sluPortal downloadables = new sluPortal("Downloadables","<1>Student Handbok\n<2>Safety Orientation Manual\n" +
                "<3>Ordinance 021-2018 - Harassement\n<4>Gsuite For Education\n<5>The Mission and Identity Cluster");
        sluPortal aboutSLU = new sluPortal("About iSLU Portal","iSLU portal is for saint Louis university students and parents, that serves as a personal assistant in carrying out " +
                "university related tasks.");
        downAbout.insert(downloadAbout);
        downAbout.insert(downloadables);
        downAbout.insert(aboutSLU);
        sluPortalList.insert(downAbout);

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
