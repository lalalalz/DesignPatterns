package Proxy.after;

public class DefaultGameService implements GameService {

    @Override
    public void gameStart() {
        System.out.println("게임에 오신 것을 환영합니다!!");
    }
}
