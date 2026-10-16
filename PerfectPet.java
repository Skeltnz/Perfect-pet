///Arseniy Ignatyev, 10/15/2026, gives you the perfect pet
import java.util.Scanner;
public class PerfectPet
{
    public static void main(String[] args)
    {
        Boolean green = false;
        Boolean red = false;
        Boolean blue = false;
        Boolean winter = false;
        Boolean fall = false;
        Boolean spring = false;
        Boolean summer = false;
        Boolean isVowel = false;
        Boolean season = false;
        Boolean color = false;
        Boolean name = false;
        
        
        
        
        
        
            
       

        
        
        Scanner scanner = new Scanner(System.in);
        String num = "";

            System.out.println("what is your favourite season? 1 for fall, 2 for winter, 3 for spring, and 4 for summer: ");
            num= scanner.nextLine().toLowerCase();
            //season sorting
            if (num.equals("1")){
                fall = true;
                season = true;
            }
            if (num.equals("2")){
                winter = true;
                season = true;
            }
            if (num.equals("3")){
                spring = true;
                season = true;
            }
            if (num.equals("4")){
                summer = true;
                season = true;
            }
            if("1234".indexOf(num.substring(0,1))<0){
                System.out.println("type a proper number. retry.");
                return;
            }
           
                System.out.println("what is your favourite color? 1 for red, 2 for blue, and 3 for green: ");
                num = scanner.nextLine().toLowerCase();
                if (num.equals("1")){
                red = true;
                color = true;
                }
                else if (num.equals("2")){
                blue = true;
                color = true;
                }
                else if (num.equals("3")){
                green = true;
                color = true;
                }
                else{
                    System.out.println("type a proper number. retry.");
                    return;
                }
           
                System.out.println("print your name");
                String nameT= scanner.nextLine().toLowerCase();
                if("abcdefghijklmnopqrstuvwxyz".indexOf(nameT.substring(0,1))<0){
                System.out.println("Give a real name man");
                scanner.close();
                return;
                }
                if("aeiouy".indexOf(nameT.substring(0,1))>=0){
                    isVowel =true;
                    name = true;
                }
                
            
        
        ///animal sorting
        if (fall ==true && blue == true){
            System.out.println("your animal is an alligator");
        }
        else if (spring ==true && blue == true){
            System.out.println("your animal is an Ostrich");
        }
        else if (winter ==true && green == true){
            System.out.println("your animal is a giraffe");
        }
        else if (red == true){
            
            if (isVowel == true){
            System.out.println("your animal is a porcupine");
            }

            System.out.println("you animal is a panada");
        }
        else if (summer ==true){
            System.out.println("your animal is a ponie");
        }
        else if ((isVowel ==false && blue == true)&& summer!=true || fall!=true){
            System.out.println("your animal is an axolotl");
        }
        else{
            System.out.println("your animal is a rock.");
        }
        
        
        
        
        
        


        }   
        }
    
