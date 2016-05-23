package imsreenadh.gpacgpa;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class FifthSemester extends AppCompatActivity {

    Spinner sp1501,
            sp1502,
            sp1503,
            sp1504,
            sp1505,
            sp1506,
            sp15L1,
            sp15L2;
    String selectedGrade1501,
            selectedGrade1502,
            selectedGrade1503,
            selectedGrade1504,
            selectedGrade1505,
            selectedGrade1506,
            selectedGrade15L1,
            selectedGrade15L2;
    int gp1501,
            gp1502,
            gp1503,
            gp1504,
            gp1505,
            gp1506,
            gp15L1,
            gp15L2;
    double gpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_semester);

        sp1501 = (Spinner) findViewById(R.id.spinner1501);
        sp1501.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1501 = adapter.getItemAtPosition(position).toString();
                gp1501 = setGradePoint(selectedGrade1501);
                //gradeToaster(selectedGrade1501);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1502 = (Spinner) findViewById(R.id.spinner1502);
        sp1502.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1502 = adapter.getItemAtPosition(position).toString();
                gp1502 = setGradePoint(selectedGrade1502);
                //gradeToaster(selectedGrade1502);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1503 = (Spinner) findViewById(R.id.spinner1503);
        sp1503.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1503 = adapter.getItemAtPosition(position).toString();
                gp1503 = setGradePoint(selectedGrade1503);
                //gradeToaster(selectedGrade1503);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1504 = (Spinner) findViewById(R.id.spinner1504);
        sp1504.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1504 = adapter.getItemAtPosition(position).toString();
                gp1504 = setGradePoint(selectedGrade1504);
                //gradeToaster(selectedGrade1504);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1505 = (Spinner) findViewById(R.id.spinner1505);
        sp1505.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1505 = adapter.getItemAtPosition(position).toString();
                gp1505 = setGradePoint(selectedGrade1505);
                //gradeToaster(selectedGrade1505);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1506 = (Spinner) findViewById(R.id.spinner1506);
        sp1506.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1506 = adapter.getItemAtPosition(position).toString();
                gp1506 = setGradePoint(selectedGrade1506);
                //gradeToaster(selectedGrade1506);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp15L1 = (Spinner) findViewById(R.id.spinner15L1);
        sp15L1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade15L1 = adapter.getItemAtPosition(position).toString();
                gp15L1 = setGradePoint(selectedGrade15L1);
                //gradeToaster(selectedGrade15L1);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp15L2 = (Spinner) findViewById(R.id.spinner15L2);
        sp15L2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade15L2 = adapter.getItemAtPosition(position).toString();
                gp15L2 = setGradePoint(selectedGrade15L2);
                //gradeToaster(selectedGrade15L2);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });
    }

    //OTHERS
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

        gpa = ((gp1501 * 3)
                + (gp1502 * 3)
                + (gp1503 * 3)
                + (gp1504 * 3)
                + (gp1505 * 3)
                + (gp1506 * 3)
                + (gp15L1 * 2)
                + (gp15L2 * 2))
                / (22.0);

        /*Toast.makeText(getApplicationContext(),
                "Semester 3 GPA is: " + gpa, Toast.LENGTH_LONG).show();*/

        new AlertDialog.Builder(this)
                .setTitle("SEMESTER V GPA")
                .setMessage("Your GPA for Fifth Semester is : " + String.format("%.2f", gpa) + "\n\nReturn back home?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        FifthSemester.super.onBackPressed();
                    }
                })
                .setNegativeButton(android.R.string.no, null)
                .setCancelable(false)
                .show();

    }

    public void cancelButtonClicked(View view) {
        FifthSemester.super.onBackPressed();
    }
}
