/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praew
 */
class CountCharacter    
{    
    public static void main(String[] args) {    
        String string = "GDL Group was founded in 2004. We are a professional IT Solution provider across various geographies. Our business has grown significantly since our inception. Our risk-sharing approach and our commitment to our client have led us to significantly reduce their total cost of ownership (TCO) as well as transactional Sustaining vital connections with employees, suppliers and customers is the lifeblood of your business and it depends on an IT infrastructure that encourages collaboration and assures optimum performance at every link in your value chain, around-the-clock. GDL Group is about optimizing investments, transforming capabilities and achieving greater business value from IT costs.";    

        int countA = 0; 
        int countE = 0; 
        int countI = 0; 
        int countO = 0; 
        int countU = 0;    

        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) == 'A' || string.charAt(i) == 'a')    
                countA ++;     
            if(string.charAt(i) == 'E' || string.charAt(i) == 'e')    
                countE ++;   
            if(string.charAt(i) == 'I' || string.charAt(i) == 'i')    
                countI ++;   
            if(string.charAt(i) == 'O' || string.charAt(i) == 'o')    
                countO ++;   
            if(string.charAt(i) == 'U' || string.charAt(i) == 'u')    
                countU ++;
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of A: " + countA );    
        System.out.println("Total number of E: " + countE ); 
        System.out.println("Total number of I: " + countI ); 
        System.out.println("Total number of O: " + countO ); 
        System.out.println("Total number of U: " + countU ); 
    }    
}  
