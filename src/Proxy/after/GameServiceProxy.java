package Proxy.after;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void gameStart() {
        System.out.println("proxy 작업을 수행중입니다.");
        gameService.gameStart();
        System.out.println("proxy 작업을 수행완료했습니다");
    }
}
