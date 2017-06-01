package com.example.android.bookworm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * BookWorm Created by Muir on 01/06/2017.
 */

public class BookAdapter extends ArrayAdapter<Book> {

    /**
     * constructs a new {@link BookAdapter}
     *
     * @param context of the app
     * @param books   is the list of books, which is the data source of the adapter
     */
    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    // view lookup cache
    private static class ViewHolder {
        public ImageView bookCover;
        public TextView title;
        public TextView subtitle;
        public TextView author;
    }

    /*
     * Returns a list item view that displays information about the book at the given position
     * in the list of books.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        Book currentBook = getItem(position);

        // check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.book_list_item, parent, false);
            // Find and display the book cover
            viewHolder.bookCover = (ImageView) convertView.findViewById(R.id.bookCover);
            // Find and display the title
            viewHolder.title = (TextView) convertView.findViewById(R.id.title);
            // Find and display the subtitle
            viewHolder.subtitle = (TextView) convertView.findViewById(R.id.subTitle);
            // Find and display the author
            viewHolder.author = (TextView) convertView.findViewById(R.id.author);
            convertView.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) convertView.getTag();

        // Populate the data into the template view using the data object
        viewHolder.title.setText(currentBook.getTitle());
        viewHolder.subtitle.setText(currentBook.getSubtitle());
        viewHolder.author.setText(currentBook.getAuthor());

        // Return the completed view to render on screen
        return convertView;
    }
}