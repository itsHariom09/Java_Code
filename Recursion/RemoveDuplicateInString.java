public class RemoveDuplicateInString {
    public static void removeDup(String str,int idx,StringBuilder newStr,boolean[] map){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char curStr=str.charAt(idx);
        if(map[curStr-'a']==true){
            removeDup(str, idx+1, newStr, map);
        }
        else{
            map[curStr-'a']=true;
            removeDup(str, idx+1, newStr.append(curStr), map);
        }
    }
    public static void main(String[] args) {
        String str="harriioommm";
        boolean[] map=new boolean[26];
        removeDup(str, 0, new StringBuilder(""), map);
    }
}
