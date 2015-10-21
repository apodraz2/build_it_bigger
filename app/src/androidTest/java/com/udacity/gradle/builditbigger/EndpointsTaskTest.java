package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Pair;

/**
 * Created by adampodraza on 10/14/15.
 */
public class EndpointsTaskTest extends AndroidTestCase {

    public void testResult() {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();

        String joke = endpointsAsyncTask.doInBackground(new Pair<Context, String>(getContext(), "Adam"));

        assertNotNull(joke);
        assertNotSame(joke, "");
    }
}
