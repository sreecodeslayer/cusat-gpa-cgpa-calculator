package imsreenadh.gpacgpa;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class EighthSemester extends AppCompatActivity {

    Spinner sp1801,
            sp1802,
            sp1803,
            sp1804,
            sp18L1,
            sp18L2;
    String selectedGrade1801,
            selectedGrade1802,
            selectedGrade1803,
            selectedGrade1804,
            selectedGrade18L1,
            selectedGrade18L2;
    int gp1801,
            gp1802,
            gp1803,
            gp1804,
            gp18L1,
            gp18L2;
    double gpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth_semester);

        sp1801 = (Spinner) findViewById(R.id.spinner1801);
        sp1801.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1801 = adapter.getItemAtPosition(position).toString();
                gp1801 = setGradePoint(selectedGrade1801);
                //gradeToaster(selectedGrade1801);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1802 = (Spinner) findViewById(R.id.spinner1802);
        sp1802.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1802 = adapter.getItemAtPosition(position).toString();
                gp1802 = setGradePoint(selectedGrade1802);
                //gradeToaster(selectedGrade1802);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1803 = (Spinner) findViewById(R.id.spinner1803);
        sp1803.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1803 = adapter.getItemAtPosition(position).toString();
                gp1803 = setGradePoint(selectedGrade1803);
                //gradeToaster(selectedGrade1803);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1804 = (Spinner) findViewById(R.id.spinner1804);
        sp1804.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1804 = adapter.getItemAtPosition(position).toString();
                gp1804 = setGradePoint(selectedGrade1804);
                //gradeToaster(selectedGrade1804);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp18L1 = (Spinner) findViewById(R.id.spinner18L1);
        sp18L1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade18L1 = adapter.getItemAtPosition(position).toString();
                gp18L1 = setGradePoint(selectedGrade18L1);
                //gradeToaster(selectedGrade18L1);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp18L2 = (Spinner) findViewById(R.id.spinner18L2);
        sp18L2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade18L2 = adapter.getItemAtPosition(position).toString();
                gp18L2 = setGradePoint(selectedGrade18L2);
                //gradeToaster(selectedGrade18L2);

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

        gpa = ((gp1801 * 3)
                + (gp1802 * 3)
                + (gp1803 * 3)
                + (gp1804 * 3)
                + (gp18L1 * 8)
                + (gp18L2 * 2))
                / (22.0);

        /*Toast.makeText(getApplicationContext(),
                "Semester 3 GPA is: " + gpa, Toast.LENGTH_LONG).show();*/

        new AlertDialog.Builder(this)
                .setTitle("SEMESTER VIII GPA")
                .setMessage("Your GPA for Eighth Semester is : " + String.format("%.2f", gpa) + "\n\nReturn back home?")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        EighthSemester.super.onBackPressed();
                    }
                })
                .setNegativeButton(android.R.string.no, null)
                .setCancelable(false)
                .show();

    }

    public void cancelButtonClicked(View view) {
        EighthSemester.super.onBackPressed();
    }
}
