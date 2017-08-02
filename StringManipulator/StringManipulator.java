public class StringManipulator {
    public String trimAndConcat(String word1, String word2){
        String word11 = word1.trim();
        String word22 = word2.trim();
        return word11.concat(word22);
    }

    public Integer getIndexOrNull(String str1, char char1){
        
        int output = str1.indexOf(char1);

        if(output == -1 ){
            return null;
        }
        else {
            return output;
        }
    }

    public Integer getIndexOrNull(String str2, String str3){
        int output2 = str2.indexOf(str3);

        if(str2.indexOf(str3) == -1){
            return null;
        }

        else{
            return str2.indexOf(str3);
        }
    }

    public String concatSubstring(String str4,int int1,int int2,String str5){
        String output3 = str4.substring(int1, int2);
        String output4 = output3.concat(str5);

        return output4;
    }
}