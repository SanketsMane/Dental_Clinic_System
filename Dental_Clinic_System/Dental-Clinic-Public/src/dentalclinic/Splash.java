
package dentalclinic;

/**
 *
 * @author Sanket Manne  Github - https://github.com/SanketsMane 
 */
public class Splash {

    public static void main(String[] args) throws InterruptedException {
        SplashScreen splash = new SplashScreen();

        for (int i = 0; i <= 100; i++) {
            Thread.sleep(40);
            splash.setVisible(true);
            splash.ProgressBar.setValue(i);

            if (i == 100) {
                splash.dispose();
                new MainScreen().setVisible(true);
            }
        }
    }
}
