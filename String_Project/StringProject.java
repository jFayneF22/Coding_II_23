public class StringProject {
    private String myString;
    public StringProject (String str) {
        myString = str;
    }
    public String toString() {
    return myString;
    }
    public String reverseCase(){
        String str = myString;
        String newString = "";
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                newString += Character.toLowerCase(str.charAt(i));
            } else if(Character.isLowerCase(str.charAt(i))){
                newString += Character.toUpperCase(str.charAt(i));
            } else{
                newString+= str.charAt(i);
            }
        }
        return newString;
    }
    public int characterCount(char let){
        String str = myString;
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if( str.charAt(i) == let){
                count++;
            }
        }
        return count;
    }
    public String reverseString(){
        String str = myString;
        String newString = "";
        for(int i = str.length()-1; i >=0 ; i--){
            newString += str.charAt(i);
        }
        return newString;
    }
    public String eachWordOnALine(){
        String str = myString;
        String newString = "";
        newString = str.replaceAll(" ", " \n");
        return newString;
    }
    public int wordCount(){
        int count = 1;
        for(int i = 0; i < myString.length(); i++){
            boolean space = myString.charAt(i) == ' ';
            if(space){
                count++;
            }
        }
        return count;
    }
    public int characterCount(){
        int count = 0;
        for(int i = 0; i < myString.length(); i++){
            boolean notSpace = myString.charAt(i) != ' ';
            if(notSpace){
                count++;
            }
        } 
        return count;
    }
    public int avgWordLength(){
     return characterCount()/wordCount();
    }
    public int vowelCount(){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'e' || myString
            .charAt(i) == 'i' || myString.charAt(i) == 'o' || myString.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
    public int substrCount(String str){
        int count = 0;
        int currentIdx = 0;
        while(currentIdx != -1)
    }
}