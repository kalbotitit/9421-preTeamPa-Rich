package prelim;

public class sluPortal {

    private String menuNm;      // name of the menu item
    private String content;     // the content of each menu

    sluPortal(){
        menuNm = "Home";
        content = "Enrolled in 1st Semester A.Y. 2021-2022";
    }

    sluPortal(String m, String c){
        menuNm = m;
        content = c;
    }

    public String getMenuNm() {
        return menuNm;
    }

    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

} // end of class

