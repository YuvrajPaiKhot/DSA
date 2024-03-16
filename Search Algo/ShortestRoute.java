public class ShortestRoute {

    public static void route(String str){
        int x=0, y=0;
        for(int i=0; i<str.length(); i++){
            char letter=str.charAt(i);

            if(letter == 'N'){
                y++;
            }
            else if(letter == 'S'){
                y--;
            }
            else if(letter == 'E'){
                x++;
            }else{
                x--;
            }
        }

        double shortPath = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

        System.out.println(shortPath);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";

        route(str);
    }
}
