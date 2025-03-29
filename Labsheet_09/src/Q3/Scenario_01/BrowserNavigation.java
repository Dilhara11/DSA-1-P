package Q3.Scenario_01;

public class BrowserNavigation {
    public static void main(String[] args) {
        WebStack webHistory = new WebStack(5);

        webHistory.Visit("google.com");
        webHistory.Visit("youtube.com");
        webHistory.Visit("github.com");

        System.out.println("Back to: " + webHistory.goingBack());
        System.out.println("Back to: " + webHistory.goingBack());
        System.out.println("Forward to: " + webHistory.goingForward());


    }
}
