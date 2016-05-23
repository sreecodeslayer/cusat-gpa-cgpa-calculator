package imsreenadh.gpacgpa;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class SixthSemester extends AppCompatActivity {

    Spinner sp1601,
            sp1602,
            sp1603,
            sp1604,
            sp1605,
            sp1606,
            sp16L1,
            sp16L2;
    String selectedGrade1601,
            selectedGrade1602,
            selectedGrade1603,
            selectedGrade1604,
            selectedGrade1605,
            selectedGrade1606,
            selectedGrade16L1,
            selectedGrade16L2;
    int gp1601,
            gp1602,
            gp1603,
            gp1604,
            gp1605,
            gp1606,
            gp16L1,
            gp16L2;
    double gpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_semester);

        sp1601 = (Spinner) findViewById(R.id.spinner1601);
        sp1601.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1601 = adapter.getItemAtPosition(position).toString();
                gp1601 = setGradePoint(selectedGrade1601);
                //gradeToaster(selectedGrade1601);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1602 = (Spinner) findViewById(R.id.spinner1602);
        sp1602.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1602 = adapter.getItemAtPosition(position).toString();
                gp1602 = setGradePoint(selectedGrade1602);
                //gradeToaster(selectedGrade1602);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1603 = (Spinner) findViewById(R.id.spinner1603);
        sp1603.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1603 = adapter.getItemAtPosition(position).toString();
                gp1603 = setGradePoint(selectedGrade1603);
                //gradeToaster(selectedGrade1603);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1604 = (Spinner) findViewById(R.id.spinner1604);
        sp1604.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1604 = adapter.getItemAtPosition(position).toString();
                gp1604 = setGradePoint(selectedGrade1604);
                //gradeToaster(selectedGrade1604);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1605 = (Spinner) findViewById(R.id.spinner1605);
        sp1605.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1605 = adapter.getItemAtPosition(position).toString();
                gp1605 = setGradePoint(selectedGrade1605);
                //gradeToaster(selectedGrade1605);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1606 = (Spinner) findViewById(R.id.spinner1606);
        sp1606.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1606 = adapter.getItemAtPosition(position).toString();
                gp1606 = setGradePoint(selectedGrade1606);
                //gradeToaster(selectedGrade1606);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp16L1 = (Spinner) findViewById(R.id.spinner16L1);
        sp16L1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade16L1 = adapter.getItemAtPosition(position).toString();
                gp16L1 = setGradePoint(selectedGrade16L1);
                //gradeToaster(selectedGrade16L1);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp16L2 = (Spinner) findViewById(R.id.spinner16L2);
        sp16L2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade16L2 = adapter.getItemAtPosition(position).toString();
                gp16L2 = setGradePoint(selectedGrade16L2);
                //gradeToaster(selectedGrade16L2);

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

        gpa = ((gp1601 * 3)
                + (gp1602 * 3)
                + (gp1603 * 3)
                + (gp1604 * 3)
                + (gp1605 * 3)
                + (gp1606 * 3)
                + (gp16L1 * 2)
                + (gp16L2 * 2))
                / (22.0);

        /*Toast.makeText(getApplicationContext(),
                "Semester 3 GPA is: " + gpa, Toast.LENGTH_LONG).show();*/

        new AlertDialog.Builder(this)
                .setTitle("SEMESTER VI GPA")
                .setMessage("Your GPA for Sixth Semester is : " + String.format("%.2f", gpa) + "\n\nReturn back home?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        SixthSemester.super.onBackPressed();
                    }
                })
                .setNegativeButton(android.R.string.no, null)
                .setCancelable(false)
                .show();

    }

    public void cancelButtonClicked(View view) {
        SixthSemester.super.onBackPressed();
    }
}
