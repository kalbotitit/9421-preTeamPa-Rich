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

public class Main {

    private NestedList<NestedList<sluPortal>> sluPortalList = new NestedList<>();
    private NestedList<sluPortal> homeMenu = new NestedList<>();
    private NestedList<sluPortal> schedMenu = new NestedList<>();
    private sluPortal home = new sluPortal("Home", null);
    private sluPortal announcement = new sluPortal("Announcement", "slu pogi");
    private sluPortal sched = new sluPortal("Sched", "9421   CS211    Data Structures");

    public static void main(String[] args) {
        Main obj = new Main();
        obj.homeMenu.insert(obj.home);
        obj.homeMenu.insert(obj.announcement);

        obj.schedMenu.insert(obj.sched);

        obj.sluPortalList.insert(obj.homeMenu);
        obj.sluPortalList.insert(obj.schedMenu);
        obj.printMainMenu(obj.sluPortalList);

    }

    private void run(){

    }

    /**
     * Display the main menu (main list) of the portal
     */
    private void mainMenu(){
        System.out.println("====Main Menu=====");
        printMainMenu(sluPortalList);
    }// end of mainMenu method

    /**
     *
     * @param menu
     */
    private void printMainMenu(NestedList<NestedList<sluPortal>> menu){
        for(int node = 0; node < menu.getSize(); node++){
            System.out.println(menu.get(node).get(0).getMenuNm());
        }
    }// end of printMainMenu method
}
