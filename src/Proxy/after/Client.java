package Proxy.after;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy(new DefaultGameService());
        gameService.gameStart();
    }
}
