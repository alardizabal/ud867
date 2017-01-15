import android.app.Application;
import android.test.ApplicationTestCase;

import com.albertlardizabal.androidjokelibrary.JokeComposer;

/**
 * Created by albertlardizabal on 1/15/17.
 */

public class AsyncTest extends ApplicationTestCase<Application> {

    public AsyncTest() { super(Application.class); }

    public void testAsyncTask() {
        try {
            JokeComposer jokeComposer = new JokeComposer();
            String joke = jokeComposer.grabJoke();
            assertNotNull("Joke is null", joke);
            assertFalse("Joke is blank", joke.isEmpty());
        } catch (Exception e) {
            System.out.println("Exception");
            fail();
        }
    }
}
