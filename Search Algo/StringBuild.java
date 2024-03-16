public class StringBuild {

    public static void Build(){
        StringBuilder sb = new StringBuilder("");

        for(char i='a'; i<='z'; i++){
            sb.append(i);
        }                                       //Time cmplexity O(26); ---> In alphabet case
        System.out.println(sb);
        System.out.println(sb.length());
    }
    public static void main(String[] args) {
        Build();
    }
}
