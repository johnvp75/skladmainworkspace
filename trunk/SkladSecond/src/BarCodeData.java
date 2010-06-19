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
    public BarCodeData(String name, int count){
        Name=name;
        Count=count;
    }
    public String toString(){
        return Name+" "+Count+" шт.";
    }
}
