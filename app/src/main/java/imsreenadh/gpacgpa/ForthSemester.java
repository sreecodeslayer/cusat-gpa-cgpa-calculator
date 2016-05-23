package imsreenadh.gpacgpa;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class ForthSemester extends AppCompatActivity {

    Spinner sp1401,
            sp1402,
            sp1403,
            sp1404,
            sp1405,
            sp1406,
            sp14L1,
            sp14L2;
    String selectedGrade1401,
            selectedGrade1402,
            selectedGrade1403,
            selectedGrade1404,
            selectedGrade1405,
            selectedGrade1406,
            selectedGrade14L1,
            selectedGrade14L2;
    int gp1401,
            gp1402,
            gp1403,
            gp1404,
            gp1405,
            gp1406,
            gp14L1,
            gp14L2;
    double gpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth_semester);

        sp1401 = (Spinner) findViewById(R.id.spinner1401);
        sp1401.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1401 = adapter.getItemAtPosition(position).toString();
                gp1401 = setGradePoint(selectedGrade1401);
                //gradeToaster(selectedGrade1401);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1402 = (Spinner) findViewById(R.id.spinner1402);
        sp1402.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1402 = adapter.getItemAtPosition(position).toString();
                gp1402 = setGradePoint(selectedGrade1402);
                //gradeToaster(selectedGrade1402);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1403 = (Spinner) findViewById(R.id.spinner1403);
        sp1403.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1403 = adapter.getItemAtPosition(position).toString();
                gp1403 = setGradePoint(selectedGrade1403);
                //gradeToaster(selectedGrade1403);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1404 = (Spinner) findViewById(R.id.spinner1404);
        sp1404.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1404 = adapter.getItemAtPosition(position).toString();
                gp1404 = setGradePoint(selectedGrade1404);
                //gradeToaster(selectedGrade1404);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1405 = (Spinner) findViewById(R.id.spinner1405);
        sp1405.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1405 = adapter.getItemAtPosition(position).toString();
                gp1405 = setGradePoint(selectedGrade1405);
                //gradeToaster(selectedGrade1405);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1406 = (Spinner) findViewById(R.id.spinner1406);
        sp1406.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1406 = adapter.getItemAtPosition(position).toString();
                gp1406 = setGradePoint(selectedGrade1406);
                //gradeToaster(selectedGrade1406);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp14L1 = (Spinner) findViewById(R.id.spinner14L1);
        sp14L1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade14L1 = adapter.getItemAtPosition(position).toString();
                gp14L1 = setGradePoint(selectedGrade14L1);
                //gradeToaster(selectedGrade14L1);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp14L2 = (Spinner) findViewById(R.id.spinner14L2);
        sp14L2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade14L2 = adapter.getItemAtPosition(position).toString();
                gp14L2 = setGradePoint(selectedGrade14L2);
                //gradeToaster(selectedGrade14L2);

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

        gpa = ((gp1401 * 3)
                + (gp1402 * 3)
                + (gp1403 * 3)
                + (gp1404 * 3)
                + (gp1405 * 3)
                + (gp1406 * 3)
                + (gp14L1 * 2)
                + (gp14L2 * 2))
                / (22.0);

        /*Toast.makeText(getApplicationContext(),
                "Semester 3 GPA is: " + gpa, Toast.LENGTH_LONG).show();*/

        new AlertDialog.Builder(this)
                .setTitle("SEMESTER IV GPA")
                .setMessage("Your GPA for Forth Semester is : " + String.format("%.2f",gpa) + "\n\nReturn back home?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        ForthSemester.super.onBackPressed();
                    }
                })
                .setNegativeButton(android.R.string.no, null)
                .setCancelable(false)
                .show();

    }
    public void cancelButtonClicked(View view) {
        ForthSemester.super.onBackPressed();
    }
}
