package me.dev.bkk.learnretrofit;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.dev.bkk.learnretrofit.Rest.SimpleRetrofit;
import me.dev.bkk.learnretrofit.model.Shot;
import retrofit.RestAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class ShowListViewFragment extends Fragment {

    @Bind(R.id.lv_showDetail)
    ListView lvShowDetail;

    public ShowListViewFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_list_view, container, false);
        ButterKnife.bind(this, view);


        new HttpAsyncTask().execute();

        return view;
    }

    public class HttpAsyncTask extends AsyncTask<Void, Void, Shot>{

        @Override
        protected Shot doInBackground(Void... params) {

            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("http://api.dribbble.com")
                    .build();

            SimpleRetrofit retrofit = restAdapter.create(SimpleRetrofit.class);
            Shot shot = retrofit.getShot();

            return shot;
        }

        @Override
        protected void onPostExecute(Shot shot) {


            Toast.makeText(getActivity(), "Name : " + shot.getTitle() + " URL : " + shot.getUrl(),
                    Toast.LENGTH_LONG).show();

            super.onPostExecute(shot);

        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
