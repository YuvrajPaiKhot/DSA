public class DuplicatesInString {
    public static StringBuilder dup(String str, int i, StringBuilder sb, boolean map[]){
        if(i==str.length()){
            return sb;
        }
        if(map[str.charAt(i) - 'a'] == false){
            sb.append(str.charAt(i));
            map[str.charAt(i) - 'a'] = true;
        }
        dup(str, i+1, sb, map);
        return sb;
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        StringBuilder sb = new StringBuilder("");
        boolean[] map = new boolean[26];

        System.out.println(dup(str, 0, sb, map));
    }
}
