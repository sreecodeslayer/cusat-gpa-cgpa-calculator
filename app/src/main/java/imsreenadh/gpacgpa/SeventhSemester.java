package imsreenadh.gpacgpa;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class SeventhSemester extends AppCompatActivity {

    Spinner sp1701,
            sp1702,
            sp1703,
            sp1704,
            sp1705,
            sp17L1,
            sp17L2,
            sp17L3,
            sp17L4;
    String selectedGrade1701,
            selectedGrade1702,
            selectedGrade1703,
            selectedGrade1704,
            selectedGrade1705,
            selectedGrade17L1,
            selectedGrade17L2,
            selectedGrade17L3,
            selectedGrade17L4;
    int gp1701,
            gp1702,
            gp1703,
            gp1704,
            gp1705,
            gp17L1,
            gp17L2,
            gp17L3,
            gp17L4;
    double gpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_semester);

        sp1701 = (Spinner) findViewById(R.id.spinner1701);
        sp1701.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1701 = adapter.getItemAtPosition(position).toString();
                gp1701 = setGradePoint(selectedGrade1701);
                //gradeToaster(selectedGrade1701);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1702 = (Spinner) findViewById(R.id.spinner1702);
        sp1702.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1702 = adapter.getItemAtPosition(position).toString();
                gp1702 = setGradePoint(selectedGrade1702);
                //gradeToaster(selectedGrade1702);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1703 = (Spinner) findViewById(R.id.spinner1703);
        sp1703.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1703 = adapter.getItemAtPosition(position).toString();
                gp1703 = setGradePoint(selectedGrade1703);
                //gradeToaster(selectedGrade1703);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1704 = (Spinner) findViewById(R.id.spinner1704);
        sp1704.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1704 = adapter.getItemAtPosition(position).toString();
                gp1704 = setGradePoint(selectedGrade1704);
                //gradeToaster(selectedGrade1704);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1705 = (Spinner) findViewById(R.id.spinner1705);
        sp1705.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1705 = adapter.getItemAtPosition(position).toString();
                gp1705 = setGradePoint(selectedGrade1705);
                //gradeToaster(selectedGrade1705);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp17L1 = (Spinner) findViewById(R.id.spinner17L1);
        sp17L1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade17L1 = adapter.getItemAtPosition(position).toString();
                gp17L1 = setGradePoint(selectedGrade17L1);
                //gradeToaster(selectedGrade17L1);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp17L2 = (Spinner) findViewById(R.id.spinner17L2);
        sp17L2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade17L2 = adapter.getItemAtPosition(position).toString();
                gp17L2 = setGradePoint(selectedGrade17L2);
                //gradeToaster(selectedGrade17L2);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp17L3 = (Spinner) findViewById(R.id.spinner17L3);
        sp17L3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade17L3 = adapter.getItemAtPosition(position).toString();
                gp17L3 = setGradePoint(selectedGrade17L3);
                //gradeToaster(selectedGrade17L3);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp17L4 = (Spinner) findViewById(R.id.spinner17L4);
        sp17L4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade17L4 = adapter.getItemAtPosition(position).toString();
                gp17L4 = setGradePoint(selectedGrade17L4);
                //gradeToaster(selectedGrade17L3);

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

        gpa = ((gp1701 * 3)
                + (gp1702 * 3)
                + (gp1703 * 3)
                + (gp1704 * 3)
                + (gp1705 * 3)
                + (gp17L1 * 2)
                + (gp17L2 * 2)
                + (gp17L3 * 1)
                + (gp17L4 * 2))
                / (22.0);

        /*Toast.makeText(getApplicationContext(),
                "Semester 3 GPA is: " + gpa, Toast.LENGTH_LONG).show();*/

        new AlertDialog.Builder(this)
                .setTitle("SEMESTER VII GPA")
                .setMessage("Your GPA for Seventh Semester is : " + String.format("%.2f", gpa) + "\n\nReturn back home?")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        SeventhSemester.super.onBackPressed();
                    }
                })
                .setNegativeButton(android.R.string.no, null)
                .setCancelable(false)
                .show();

    }

    public void cancelButtonClicked(View view) {
        SeventhSemester.super.onBackPressed();
    }
}
