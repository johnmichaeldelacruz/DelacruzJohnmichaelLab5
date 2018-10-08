package johnmichael.delacruz.com.delacruzjohnmichaellab5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class Logging extends IntentService {

    public Logging() {
        super("Logger");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITH", "Service is running...");
    }
}
