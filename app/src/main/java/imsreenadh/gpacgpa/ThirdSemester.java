package imsreenadh.gpacgpa;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class ThirdSemester extends AppCompatActivity {

    Spinner sp1301,
            sp1302,
            sp1303,
            sp1304,
            sp1305,
            sp1306,
            sp13L1,
            sp13L2;
    String selectedGrade1301,
            selectedGrade1302,
            selectedGrade1303,
            selectedGrade1304,
            selectedGrade1305,
            selectedGrade1306,
            selectedGrade13L1,
            selectedGrade13L2;
    int gp1301,
            gp1302,
            gp1303,
            gp1304,
            gp1305,
            gp1306,
            gp13L1,
            gp13L2;
    double gpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_semester);

        sp1301 = (Spinner) findViewById(R.id.spinner1301);
        sp1301.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1301 = adapter.getItemAtPosition(position).toString();
                gp1301 = setGradePoint(selectedGrade1301);
                //gradeToaster(selectedGrade1301);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1302 = (Spinner) findViewById(R.id.spinner1302);
        sp1302.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1302 = adapter.getItemAtPosition(position).toString();
                gp1302 = setGradePoint(selectedGrade1302);
                //gradeToaster(selectedGrade1302);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1303 = (Spinner) findViewById(R.id.spinner1303);
        sp1303.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1303 = adapter.getItemAtPosition(position).toString();
                gp1303 = setGradePoint(selectedGrade1303);
                //gradeToaster(selectedGrade1303);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1304 = (Spinner) findViewById(R.id.spinner1304);
        sp1304.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1304 = adapter.getItemAtPosition(position).toString();
                gp1304 = setGradePoint(selectedGrade1304);
                //gradeToaster(selectedGrade1304);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1305 = (Spinner) findViewById(R.id.spinner1305);
        sp1305.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1305 = adapter.getItemAtPosition(position).toString();
                gp1305 = setGradePoint(selectedGrade1305);
                //gradeToaster(selectedGrade1305);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp1306 = (Spinner) findViewById(R.id.spinner1306);
        sp1306.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade1306 = adapter.getItemAtPosition(position).toString();
                gp1306 = setGradePoint(selectedGrade1306);
                //gradeToaster(selectedGrade1306);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp13L1 = (Spinner) findViewById(R.id.spinner13L1);
        sp13L1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade13L1 = adapter.getItemAtPosition(position).toString();
                gp13L1 = setGradePoint(selectedGrade13L1);
                //gradeToaster(selectedGrade13L1);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        sp13L2 = (Spinner) findViewById(R.id.spinner13L2);
        sp13L2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int position, long id) {
                // On selecting a spinner item
                selectedGrade13L2 = adapter.getItemAtPosition(position).toString();
                gp13L2 = setGradePoint(selectedGrade13L2);
                //gradeToaster(selectedGrade13L2);

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

        gpa = ((gp1301 * 3)
                + (gp1302 * 3)
                + (gp1303 * 3)
                + (gp1304 * 3)
                + (gp1305 * 3)
                + (gp1306 * 3)
                + (gp13L1 * 2)
                + (gp13L2 * 2))
                / (22.0);

        /*Toast.makeText(getApplicationContext(),
                "Semester 3 GPA is: " + gpa, Toast.LENGTH_LONG).show();*/

        new AlertDialog.Builder(this)
                .setTitle("SEMESTER III GPA")
                .setMessage("Your GPA for Third Semester is : " + String.format("%.2f",gpa) + "\n\nReturn back home?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        ThirdSemester.super.onBackPressed();
                    }
                })
                .setNegativeButton(android.R.string.no, null)
                .setCancelable(false)
                .show();

    }
    public void cancelButtonClicked(View view) {
        ThirdSemester.super.onBackPressed();
    }
}
