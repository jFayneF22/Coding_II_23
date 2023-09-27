public class Cell {
    private String cellName;
    private boolean openDoor;
    private int securityCode;
    public Cell(String cellName ,boolean open, int securityCode){
        this.cellName = cellName;
        this.openDoor = open;
        this.securityCode = securityCode;
    }
    public String getname(){
        return cellName;
    }
    public boolean getDoor(){
        return openDoor;
    }
    public void setCell(String name){
        cellName = name;
    }
    public void setDoor(int securityCode){
        if(this.securityCode == securityCode){
         if(openDoor){
            openDoor = false;
         }else if (openDoor == false){
            openDoor = true;
         }
         System.out.println( "Open Door: " + openDoor);
        } else{
            System.out.println("Security Code INCORRECT");
        }
    }
}
