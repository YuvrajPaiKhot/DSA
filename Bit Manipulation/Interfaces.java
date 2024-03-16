public class Interfaces {
    public static void main(String[] args) {
        queen q = new queen();
        q.moves();
    }
}

interface chessPlayer{
    void moves();
}

class queen implements chessPlayer{
    public void moves(){
        System.out.println("left, right, up, down, diagonal (in all 4 dir)");
    }
}

class rook implements chessPlayer{
    public void moves(){
        System.out.println("left, right, up, down");
    }
}

class king implements chessPlayer{
    public void moves(){
        System.out.println("left, right, up, down, diagonal (by 1 step)");
    }
}


