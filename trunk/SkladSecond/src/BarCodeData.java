/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class BarCodeData {
    public String Name;
    public int Count;
    public String Code;

    public BarCodeData(String name, int count){
        Name=name;
        Count=count;
        Code="";
    }
    public BarCodeData(String name, String code){
        Name=name;
        Count=1;
        Code=code;
    }
    
    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString(){
        return Name+" "+Count+" шт.";
    }
}
