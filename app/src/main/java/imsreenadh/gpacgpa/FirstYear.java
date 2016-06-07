package imsreenadh.gpacgpa;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.rey.material.widget.Spinner;
import com.rey.material.widget.TextView;
import com.rey.material.widget.TimePicker;

public class FirstYear extends AppCompatActivity {

    private CustomSpinnerAdapter mModeAdapter = new CustomSpinnerAdapter();
    ;

    Spinner sp1101,
            sp1102,
            sp1103,
            sp1104,
            sp1105,
            sp1106,
            sp1107,
            sp1108,
            sp1109,
            sp11L1,
            sp11L2,
            sp11L3;
    String selectedGrade1101,
            selectedGrade1102,
            selectedGrade1103,
            selectedGrade1104,
            selectedGrade1105,
            selectedGrade1106,
            selectedGrade1107,
            selectedGrade1108,
            selectedGrade1109,
            selectedGrade11L1,
            selectedGrade11L2,
            selectedGrade11L3;
    int gp1101,
            gp1102,
            gp1103,
            gp1104,
            gp1105,
            gp1106,
            gp1107,
            gp1108,
            gp1109,
            gp11L1,
            gp11L2,
            gp11L3;

    double gpa;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year);

        sp1101 = (Spinner) findViewById(R.id.spinner1101);
        sp1101.setAdapter(mModeAdapter);
        sp1101.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(Spinner parent, View view, int position, long id) {

                selectedGrade1101 = mModeAdapter.getItem(position).toString();
                gp1101 = setGradePoint(selectedGrade1101);
                gradeToaster(selectedGrade1101);
            }
        });

        sp1102 = (Spinner) findViewById(R.id.spinner1102);
        sp1102.setAdapter(mModeAdapter);
        sp1102.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(Spinner parent, View view, int position, long id) {

                selectedGrade1102 = mModeAdapter.getItemAsString(position);
                gp1102 = setGradePoint(selectedGrade1102);
                gradeToaster(selectedGrade1102);
            }
        });

        sp1103 = (Spinner) findViewById(R.id.spinner1103);
        sp1103.setAdapter(mModeAdapter);
        sp1103.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(Spinner parent, View view, int position, long id) {

                selectedGrade1103 = mModeAdapter.getItemAsString(position);
                gp1103 = setGradePoint(selectedGrade1103);
                gradeToaster(selectedGrade1103);
            }
        });

        sp1104 = (Spinner) findViewById(R.id.spinner1104);
        sp1104.setAdapter(mModeAdapter);
        sp1104.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(Spinner parent, View view, int position, long id) {

                selectedGrade1104 = mModeAdapter.getItemAsString(position);
                gp1104 = setGradePoint(selectedGrade1104);
                gradeToaster(selectedGrade1104);
            }
        });

        sp1105 = (Spinner) findViewById(R.id.spinner1105);
        sp1105.setAdapter(mModeAdapter);
        sp1105.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(Spinner parent, View view, int position, long id) {

                selectedGrade1105 = mModeAdapter.getItemAsString(position);
                gp1105 = setGradePoint(selectedGrade1105);
                gradeToaster(selectedGrade1105);
            }
        });

        sp1106 = (Spinner) findViewById(R.id.spinner1106);
        sp1106.setAdapter(mModeAdapter);
        sp1106.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(Spinner parent, View view, int position, long id) {

                selectedGrade1106 = mModeAdapter.getItemAsString(position);
                gp1106 = setGradePoint(selectedGrade1106);
                gradeToaster(selectedGrade1106);
            }
        });

        sp1107 = (Spinner) findViewById(R.id.spinner1107);
        sp1107.setAdapter(mModeAdapter);
        sp1107.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(Spinner parent, View view, int position, long id) {

                selectedGrade1107 = mModeAdapter.getItemAsString(position);
                gp1107 = setGradePoint(selectedGrade1107);
                gradeToaster(selectedGrade1107);
            }
        });

        sp1108 = (Spinner) findViewById(R.id.spinner1108);
        sp1108.setAdapter(mModeAdapter);
        sp1108.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(Spinner parent, View view, int position, long id) {

                selectedGrade1108 = mModeAdapter.getItemAsString(position);
                gp1108 = setGradePoint(selectedGrade1108);
                gradeToaster(selectedGrade1108);
            }
        });

        sp1109 = (Spinner) findViewById(R.id.spinner1109);
        sp1109.setAdapter(mModeAdapter);
        sp1109.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(Spinner parent, View view, int position, long id) {

                selectedGrade1109 = mModeAdapter.getItemAsString(position);
                gp1109 = setGradePoint(selectedGrade1109);
                gradeToaster(selectedGrade1109);
            }
        });

        /*sp1101.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1101 = adapter.getItemAtPosition(position).toString();
                gp1101 = setGradePoint(selectedGrade1101);
                //gradeToaster(selectedGrade1101);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1102 = (Spinner) findViewById(R.id.spinner1102);
        sp1102.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1102 = adapter.getItemAtPosition(position).toString();
                gp1102 = setGradePoint(selectedGrade1102);
                //gradeToaster(selectedGrade1102);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1103 = (Spinner) findViewById(R.id.spinner1103);
        sp1103.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1103 = adapter.getItemAtPosition(position).toString();
                gp1103 = setGradePoint(selectedGrade1103);
                //gradeToaster(selectedGrade1103);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1104 = (Spinner) findViewById(R.id.spinner1104);
        sp1104.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1104 = adapter.getItemAtPosition(position).toString();
                gp1104 = setGradePoint(selectedGrade1104);
                //gradeToaster(selectedGrade1104);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1105 = (Spinner) findViewById(R.id.spinner1105);
        sp1105.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1105 = adapter.getItemAtPosition(position).toString();
                gp1105 = setGradePoint(selectedGrade1105);
                //gradeToaster(selectedGrade1105);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1106 = (Spinner) findViewById(R.id.spinner1106);
        sp1106.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1106 = adapter.getItemAtPosition(position).toString();
                gp1106 = setGradePoint(selectedGrade1106);
                //gradeToaster(selectedGrade1106);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1107 = (Spinner) findViewById(R.id.spinner1107);
        sp1107.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1107 = adapter.getItemAtPosition(position).toString();
                gp1107 = setGradePoint(selectedGrade1107);
                //gradeToaster(selectedGrade1107);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1108 = (Spinner) findViewById(R.id.spinner1108);
        sp1108.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1108 = adapter.getItemAtPosition(position).toString();
                gp1108 = setGradePoint(selectedGrade1108);
                //gradeToaster(selectedGrade1108);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1109 = (Spinner) findViewById(R.id.spinner1109);
        sp1109.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1109 = adapter.getItemAtPosition(position).toString();
                gp1109 = setGradePoint(selectedGrade1109);
                //gradeToaster(selectedGrade1109);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp11L1 = (Spinner) findViewById(R.id.spinner11L1);
        sp11L1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade11L1 = adapter.getItemAtPosition(position).toString();
                gp11L1 = setGradePoint(selectedGrade11L1);
                //gradeToaster(selectedGrade11L1);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp11L2 = (Spinner) findViewById(R.id.spinner11L2);
        sp11L2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade11L2 = adapter.getItemAtPosition(position).toString();
                gp11L2 = setGradePoint(selectedGrade11L2);
                //gradeToaster(selectedGrade11L2);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp11L3 = (Spinner) findViewById(R.id.spinner11L3);
        sp11L3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade11L3 = adapter.getItemAtPosition(position).toString();
                gp11L3 = setGradePoint(selectedGrade11L3);
                //gradeToaster(selectedGrade11L3);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });*/
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void gradeToaster(String grade) {
        Toast.makeText(getApplicationContext(),
                "Selected grade : " + grade, Toast.LENGTH_SHORT).show();
    }

    private int setGradePoint(String gradeToSet) {

        /*Set grade points
         * S = 10
         * A = 9
         * B = 8
         * C = 7
         * D = 6
         * F = 0
         */
        switch (gradeToSet) {
            case "S":
                return 10;
            case "A":
                return 9;
            case "B":
                return 8;
            case "C":
                return 7;
            case "D":
                return 6;
            case "F":
                return 0;
            default:
                return 0;
        }
    }

    public void calculateGPA(View view) {

        gpa = ((gp1101 * 4)
                + (gp1102 * 4)
                + (gp1103 * 4)
                + (gp1104 * 5)
                + (gp1105 * 5)
                + (gp1106 * 4)
                + (gp1107 * 4)
                + (gp1108 * 4)
                + (gp1109 * 3)
                + (gp11L1 * 4)
                + (gp11L2 * 2)
                + (gp11L3 * 1))
                / (44.0);

        /*Toast.makeText(getApplicationContext(),
                "GPA is: " + gpa, Toast.LENGTH_LONG).show();*/

        new AlertDialog.Builder(this)
                .setTitle("SEMESTER I&II GPA")
                .setMessage("Your GPA for First Year is : " + String.format("%.2f", gpa) + "\n\nReturn back home?")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {

                        DatabaseHandler db = new DatabaseHandler(getApplicationContext());
                        db.insertFirstYear(new User());

                        FirstYear.super.onBackPressed();
                    }
                })
                .setNegativeButton(android.R.string.no, null)
                .setCancelable(false)
                .show();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "FirstYear Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://imsreenadh.gpacgpa/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "FirstYear Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://imsreenadh.gpacgpa/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }


    private class CustomSpinnerAdapter extends BaseAdapter {
        private String[] mItems = {"S", "A", "B", "C", "D", "F"};

        @Override
        public int getCount() {
            return mItems.length;
        }

        @Override
        public Object getItem(int position) {
            return mItems[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            if (v == null)
                v = LayoutInflater.from(getApplicationContext()).inflate(R.layout.rd_item_mode, parent, false);

            ((TextView) v).setText(mItems[position]);
            return v;
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            if (v == null)
                v = LayoutInflater.from(getApplicationContext()).inflate(R.layout.rd_item_dropdown_mode, parent, false);

            ((TextView) v).setText(mItems[position]);
            return v;
        }

        public String getItemAsString(int position) {
            return (String.valueOf(mItems[position]));
        }
    }


    public void cancelButtonClicked(View view) {
        FirstYear.super.onBackPressed();
    }
}
