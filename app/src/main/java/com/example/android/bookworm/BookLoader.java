package com.example.android.bookworm;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * BookWorm Created by Muir on 01/06/2017.
 */

public class BookLoader extends AsyncTaskLoader<List<Book>> {

    // Tag for log messages
    private static final String LOG_TAG = BookLoader.class.getName();

    // Query URL
    private String Url;

    // Search Query String
    private String SearchQuery;

    /**
     * Constructs a new {@link BookLoader}
     *
     * @param context of the activity
     * @param url     to load data from
     */
    public BookLoader(Context context, String url, String searchQuery) {
        super(context);
        Url = url;
        SearchQuery = searchQuery;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG, "TEST: onStartLoading() called...");
        forceLoad();
    }

    // This is on a background thread.
    @Override
    public List<Book> loadInBackground() {
        Log.i(LOG_TAG, "TEST: loadInBackground() called...");

        if (Url == null || SearchQuery == null)
            return null;

        // Perform the network request, parse the response, and extract a list of books.
        return QueryUtils.fetchBookData(Url + SearchQuery);
    }
}
